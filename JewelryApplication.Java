@RestController
public class JewelryController {
    @GetMapping("/catalog")
    public List<Map<String, Object>> getCatalog() {
        return List.of(
            Map.of("id", 1, "name", "Золотое кольцо", "price", 50000),
            Map.of("id", 2, "name", "Серебряный браслет", "price", 15000)
        );
    }
}