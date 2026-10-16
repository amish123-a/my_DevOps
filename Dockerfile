# syntax=docker/dockerfile:1

# ==========================================
# Stage 1: builder 
# ==========================================
FROM eclipse-temurin:21-jdk-alpine AS builder

WORKDIR /app

COPY JewelryApplication.java .

RUN javac JewelryApplication.java

# ==========================================
# Stage 2: runtime 
# ==========================================
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=builder /app/JewelryStoreApp.class .

EXPOSE 8080

CMD ["java", "JewelryApplication"]