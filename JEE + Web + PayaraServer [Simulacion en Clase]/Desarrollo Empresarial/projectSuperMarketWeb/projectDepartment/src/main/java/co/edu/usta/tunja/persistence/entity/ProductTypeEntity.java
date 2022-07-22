package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.util.List;

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
}
