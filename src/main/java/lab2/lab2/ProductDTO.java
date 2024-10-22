package lab2.lab2;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDTO(Long id,
                         @NotNull @NotBlank String productName,
                         @NotNull int material,
                         @NotNull int auxiliaryMaterial,
                         @NotNull int returnWaste,
                         @NotNull int basicSalary,
                         @NotNull int additionalSalary,
                         @NotNull int generalProductionCosts,
                         @NotNull int amount,
                         double costPerUnit,
                         double productionCost) {
}
