package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="PRICE_PRODUCT")
public class PriceProductEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_price_product")
    private Integer idPriceProduct;

    @Column(name="sale_price",length = 13,precision = 2,nullable = false)
    private Double salePrice;

    @Column(name="shop_price",length = 13,precision = 2,nullable = false)
    private Double shopPrice;

    @Column(name="start_date",nullable = false)
    private Date startDate;

    @Column(name = "user_update",length = 40,nullable = false)
    private String userUpdate;

    @Column(name = "date_update",nullable = false)
    private Date dateUpdate;

    @ManyToOne
    @JoinColumn(name="fk_id_product_provider",insertable = false,updatable = false,nullable = false)
    private ProductProviderEntity fkIdProductProvider;

    @OneToMany(mappedBy = "fkIdPriceProduct")
    private List<TaxPriceProductEntity> myTaxPriceProduct;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdPriceProduct() {        return idPriceProduct;    }
    public void setIdPriceProduct(Integer idPriceProduct) {        this.idPriceProduct = idPriceProduct;    }

    public Double getSalePrice() {        return salePrice;    }
    public void setSalePrice(Double salePrice) {        this.salePrice = salePrice;    }

    public Double getShopPrice() {        return shopPrice;    }
    public void setShopPrice(Double shopPrice) {        this.shopPrice = shopPrice;    }

    public Date getStartDate() {        return startDate;    }
    public void setStartDate(Date startDate) {        this.startDate = startDate;    }

    public String getUserUpdate() {        return userUpdate;    }
    public void setUserUpdate(String userUpdate) {        this.userUpdate = userUpdate;    }

    public Date getDateUpdate() {        return dateUpdate;    }
    public void setDateUpdate(Date dateUpdate) {        this.dateUpdate = dateUpdate;    }

    public ProductProviderEntity getFkIdProductProvider() {        return fkIdProductProvider;    }
    public void setFkIdProductProvider(ProductProviderEntity fkIdProductProvider) {        this.fkIdProductProvider = fkIdProductProvider;    }

    public List<TaxPriceProductEntity> getMyTaxPriceProduct() {        return myTaxPriceProduct;    }
    public void setMyTaxPriceProduct(List<TaxPriceProductEntity> myTaxPriceProduct) {        this.myTaxPriceProduct = myTaxPriceProduct;    }
}
