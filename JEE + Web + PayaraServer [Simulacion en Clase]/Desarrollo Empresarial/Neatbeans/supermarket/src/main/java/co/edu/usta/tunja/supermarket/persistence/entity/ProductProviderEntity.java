package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="PRODUCT_PROVIDER")
public class ProductProviderEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_product_provider",nullable = false)
    private Integer idProductProvider;

    @Column(name="stock",nullable = false)
    private Integer stock;

    @Column(name="bar_code",length = 45,nullable = false)
    private String barCode;

    @ManyToOne
    @JoinColumn(name="fk_id_product",insertable = false,updatable = false)
    private ProductEntity fkIdProduct;

    @ManyToOne
    @JoinColumn(name="fk_id_provider",insertable = false,updatable = false)
    private ProviderEntity fkIdProvider;

    @OneToMany(mappedBy = "fkIdProductProvider")
    private List<PriceProductEntity> myPriceProduct;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdProductProvider() {        return idProductProvider;    }
    public void setIdProductProvider(Integer idProductProvider) {        this.idProductProvider = idProductProvider;    }

    public Integer getStock() {        return stock;    }
    public void setStock(Integer stock) {        this.stock = stock;    }

    public String getBarCode() {        return barCode;    }
    public void setBarCode(String barCode) {        this.barCode = barCode;    }

    public ProductEntity getFkIdProduct() {        return fkIdProduct;    }
    public void setFkIdProduct(ProductEntity fkIdProduct) {        this.fkIdProduct = fkIdProduct;    }

    public ProviderEntity getFkIdProvider() {        return fkIdProvider;    }
    public void setFkIdProvider(ProviderEntity fkIdProvider) {        this.fkIdProvider = fkIdProvider;    }

    public List<PriceProductEntity> getMyPriceProduct() {        return myPriceProduct;    }
    public void setMyPriceProduct(List<PriceProductEntity> myPriceProduct) {        this.myPriceProduct = myPriceProduct;    }
    
    /*------------------------------------------ TO STRING ------------------------------------------*/

    @Override
    public String toString() {
        return "stock = " + stock + " barCode = " + barCode + '\n';
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idProductProvider);
        hash = 79 * hash + Objects.hashCode(this.stock);
        hash = 79 * hash + Objects.hashCode(this.barCode);
        hash = 79 * hash + Objects.hashCode(this.fkIdProduct);
        hash = 79 * hash + Objects.hashCode(this.fkIdProvider);
        hash = 79 * hash + Objects.hashCode(this.myPriceProduct);
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
        final ProductProviderEntity other = (ProductProviderEntity) obj;
        if (!Objects.equals(this.barCode, other.barCode)) {
            return false;
        }
        if (!Objects.equals(this.idProductProvider, other.idProductProvider)) {
            return false;
        }
        if (!Objects.equals(this.stock, other.stock)) {
            return false;
        }
        if (!Objects.equals(this.fkIdProduct, other.fkIdProduct)) {
            return false;
        }
        if (!Objects.equals(this.fkIdProvider, other.fkIdProvider)) {
            return false;
        }
        if (!Objects.equals(this.myPriceProduct, other.myPriceProduct)) {
            return false;
        }
        return true;
    }
    
    
}
