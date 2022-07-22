package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="PRODUCT")
public class ProductEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_product",nullable = false)
    private Integer idProduct;

    @Column(name="product_name",length = 45,nullable = false)
    private String productName;

    @ManyToOne
    @JoinColumn(name="fk_id_product_type",insertable = false,updatable = false,nullable = false)
    private ProductTypeEntity fkProductType;

    @OneToMany(mappedBy = "fkIdProduct")
    private List<ProductProviderEntity> myProductProvider;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdProduct() {        return idProduct;    }
    public void setIdProduct(Integer idProduct) {        this.idProduct = idProduct;    }

    public String getProductName() {        return productName;    }
    public void setProductName(String productName) {        this.productName = productName;    }

    public ProductTypeEntity getFkProductType() {        return fkProductType;    }
    public void setFkProductType(ProductTypeEntity fkProductType) {        this.fkProductType = fkProductType;    }

    public List<ProductProviderEntity> getMyProductProvider() {        return myProductProvider;    }
    public void setMyProductProvider(List<ProductProviderEntity> myProductProvider) {        this.myProductProvider = myProductProvider;    }
}
