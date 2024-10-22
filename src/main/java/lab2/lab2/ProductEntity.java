package lab2.lab2;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {

    public ProductEntity() {}

    public ProductEntity(String productName, int material, int auxiliaryMaterial, int returnWaste, int basicSalary, int additionalSalary,
                         int generalProductionCosts, int amount) {
        this.productName = productName;
        this.material = material;
        this.auxiliaryMaterial = auxiliaryMaterial;
        this.returnWaste = returnWaste;
        this.basicSalary = basicSalary;
        this.additionalSalary = additionalSalary;
        this.generalProductionCosts = generalProductionCosts;
        this.amount = amount;
        costPerUnit = material + auxiliaryMaterial + returnWaste + generalProductionCosts + ((basicSalary + additionalSalary) * 22.0 / 100.0);
        productionCost = costPerUnit * amount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private int material, auxiliaryMaterial, returnWaste, basicSalary, additionalSalary, generalProductionCosts, amount;

    @Column(nullable = false)
    private double costPerUnit, productionCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getAuxiliaryMaterial() {
        return auxiliaryMaterial;
    }

    public void setAuxiliaryMaterial(int auxiliaryMaterial) {
        this.auxiliaryMaterial = auxiliaryMaterial;
    }

    public int getReturnWaste() {
        return returnWaste;
    }

    public void setReturnWaste(int returnWaste) {
        this.returnWaste = returnWaste;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getAdditionalSalary() {
        return additionalSalary;
    }

    public void setAdditionalSalary(int additionalSalary) {
        this.additionalSalary = additionalSalary;
    }

    public int getGeneralProductionCosts() {
        return generalProductionCosts;
    }

    public void setGeneralProductionCosts(int generalProductionCosts) {
        this.generalProductionCosts = generalProductionCosts;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }
}