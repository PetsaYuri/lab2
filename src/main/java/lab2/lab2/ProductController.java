package lab2.lab2;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    private final ProductService productService;

    private static final String URI_ID = "/{id}";

    @GetMapping
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @GetMapping(URI_ID)
    public ProductDTO getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO productDTO) {
        return productService.create(productDTO);
    }


    @DeleteMapping
    public void deleteAll() {
        productService.deleteAll();
    }

    @DeleteMapping(URI_ID)
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
