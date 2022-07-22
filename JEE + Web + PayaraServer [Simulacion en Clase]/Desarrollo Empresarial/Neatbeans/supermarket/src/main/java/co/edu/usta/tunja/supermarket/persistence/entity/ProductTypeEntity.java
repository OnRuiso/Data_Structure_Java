package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="PRODUCT_TYPE")
public class ProductTypeEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_product_type",nullable = false)
    private Integer idProductType;

    @Column(name="product_type_name",length = 45,nullable = false)
    private String productTypeName;

    @OneToMany(mappedBy = "fkProductType")
    private List<ProductEntity> myProduct;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdProductType() {        return idProductType;    }
    public void setIdProductType(Integer idProductType) {        this.idProductType = idProductType;    }

    public String getProductTypeName() {        return productTypeName;    }
    public void setProductTypeName(String productTypeName) {        this.productTypeName = productTypeName;    }

    public List<ProductEntity> getMyProduct() {        return myProduct;    }
    public void setMyProduct(List<ProductEntity> myProduct) {        this.myProduct = myProduct;    }
    
    /*------------------------------------------ TO STRING ------------------------------------------*/

    @Override
    public String toString() {
        return  productTypeName ;
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idProductType);
        hash = 89 * hash + Objects.hashCode(this.productTypeName);
        hash = 89 * hash + Objects.hashCode(this.myProduct);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductTypeEntity other = (ProductTypeEntity) obj;
        if (!Objects.equals(this.productTypeName, other.productTypeName)) {
            return false;
        }
        if (!Objects.equals(this.idProductType, other.idProductType)) {
            return false;
        }
        if (!Objects.equals(this.myProduct, other.myProduct)) {
            return false;
        }
        return true;
    }
    
    
}
