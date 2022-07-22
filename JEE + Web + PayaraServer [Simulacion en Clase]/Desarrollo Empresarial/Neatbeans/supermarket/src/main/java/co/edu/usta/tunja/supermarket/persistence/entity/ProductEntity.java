package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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
    
    @Column(name="fk_id_product_type",length = 45,nullable = false)
    private Integer fkIdProductType;

    @ManyToOne
    @JoinColumn(name="fk_id_product_type",insertable = false,updatable = false,nullable = false)
    private ProductTypeEntity fkProductType;

    //@OneToMany(mappedBy = "fkIdProduct")
    //private List<ProductProviderEntity> myProductProvider;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getFkIdProductType() {
        return fkIdProductType;
    }

    public void setFkIdProductType(Integer fkIdProductType) {
        this.fkIdProductType = fkIdProductType;
    }

    
    
    public Integer getIdProduct() {        return idProduct;    }
    public void setIdProduct(Integer idProduct) {        this.idProduct = idProduct;    }

    public String getProductName() {        return productName;    }
    public void setProductName(String productName) {        this.productName = productName;    }

    public ProductTypeEntity getFkProductType() {        return fkProductType;    }
    public void setFkProductType(ProductTypeEntity fkProductType) {        this.fkProductType = fkProductType;    }

//    public List<ProductProviderEntity> getMyProductProvider() {        return myProductProvider;    }
  //  public void setMyProductProvider(List<ProductProviderEntity> myProductProvider) {        this.myProductProvider = myProductProvider;    }
    
    /*------------------------------------------ TO STRING ------------------------------------------*/

    @Override
    public String toString() {
        return "productName=" + productName + '\n';
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idProduct);
        hash = 71 * hash + Objects.hashCode(this.productName);
        hash = 71 * hash + Objects.hashCode(this.fkProductType);
//        hash = 71 * hash + Objects.hashCode(this.myProductProvider);
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
        final ProductEntity other = (ProductEntity) obj;
        if (!Objects.equals(this.productName, other.productName)) {
            return false;
        }
        if (!Objects.equals(this.idProduct, other.idProduct)) {
            return false;
        }
        if (!Objects.equals(this.fkProductType, other.fkProductType)) {
            return false;
        }
/*        if (!Objects.equals(this.myProductProvider, other.myProductProvider)) {
            return false;
        }*/
        return true;
    }
    
    
}
