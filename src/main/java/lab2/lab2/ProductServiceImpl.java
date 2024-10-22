package lab2.lab2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDTO> getAll() {
        List<ProductEntity> products = productRepository.findAll();
        return products
                .stream()
                .map(productMapper)
                .toList();
    }

    @Override
    public ProductDTO getById(Long id) {
        return productMapper.apply(findById(id));
    }

    @Override
    public ProductDTO create(ProductDTO productDTO) {
        ProductEntity newProduct = new ProductEntity(productDTO.productName(), productDTO.material(), productDTO.auxiliaryMaterial(),
                productDTO.returnWaste(), productDTO.basicSalary(), productDTO.additionalSalary(), productDTO.generalProductionCosts(), productDTO.amount());
        ProductEntity savedProduct = productRepository.save(newProduct);
        return productMapper.apply(savedProduct);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    private ProductEntity findById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }
}
