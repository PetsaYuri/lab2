package lab2.lab2;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductMapper implements Function<ProductEntity, ProductDTO> {

    @Override
    public ProductDTO apply(ProductEntity productEntity) {
        return new ProductDTO(
                productEntity.getId(),
                productEntity.getProductName(),
                productEntity.getMaterial(),
                productEntity.getAuxiliaryMaterial(),
                productEntity.getReturnWaste(),
                productEntity.getBasicSalary(),
                productEntity.getAdditionalSalary(),
                productEntity.getGeneralProductionCosts(),
                productEntity.getAmount(),
                productEntity.getCostPerUnit(),
                productEntity.getProductionCost());
    }
}
