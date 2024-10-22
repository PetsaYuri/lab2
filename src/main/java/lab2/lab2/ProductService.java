package lab2.lab2;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAll();

    ProductDTO getById(Long id);

    ProductDTO create(ProductDTO productDTO);

    void deleteAll();

    void delete(Long id);
}
