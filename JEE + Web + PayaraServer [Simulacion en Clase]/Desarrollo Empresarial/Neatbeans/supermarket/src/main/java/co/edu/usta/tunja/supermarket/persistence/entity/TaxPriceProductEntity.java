package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="TAX_PRICE_PRODUCT")
public class TaxPriceProductEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tax_price_product",nullable = false)
    private Integer idTaxPriceProduct;
    
    
    @ManyToOne
    @JoinColumn(name="fk_id_price_product",insertable = false,updatable = false)
    private  PriceProductEntity fkIdPriceProduct;

    @ManyToOne
    @JoinColumn(name = "fk_id_tax",insertable = false,updatable = false,nullable = false)
    private TaxEntity fkIdTaxEntity;
    
    @OneToMany(mappedBy = "fkIdTaxPriceProduct")
    private List<TicketDetailEntity> myfkIdTaxPriceProduct;

    
    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdTaxPriceProduct() {        return idTaxPriceProduct;    }
    public void setIdTaxPriceProduct(Integer idTaxPriceProduct) {        this.idTaxPriceProduct = idTaxPriceProduct;    }
    
    public PriceProductEntity getFkIdPriceProduct() {        return fkIdPriceProduct;    }
    public void setFkIdPriceProduct(PriceProductEntity fkIdPriceProduct) {        this.fkIdPriceProduct = fkIdPriceProduct;    }

    public TaxEntity getFkIdTaxEntity() {        return fkIdTaxEntity;    }
    public void setFkIdTaxEntity(TaxEntity fkIdTaxEntity) {        this.fkIdTaxEntity = fkIdTaxEntity;    }

    public List<TicketDetailEntity> getMyfkIdTaxPriceProduct() {        return myfkIdTaxPriceProduct;    }
    public void setMyfkIdTaxPriceProduct(List<TicketDetailEntity> myfkIdTaxPriceProduct) {        this.myfkIdTaxPriceProduct = myfkIdTaxPriceProduct;    }

       
    /*------------------------------------------ TO STRING ------------------------------------------*/
    
    @Override
    public String toString() {
        
        return "fkIdPriceProduct = " + fkIdPriceProduct 
                + " fkIdTaxEntity = " + fkIdTaxEntity 
                + " fkIdTaxPriceProduct = " + myfkIdTaxPriceProduct
                + '\n';
       
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idTaxPriceProduct);
        hash = 97 * hash + Objects.hashCode(this.fkIdPriceProduct);
        hash = 97 * hash + Objects.hashCode(this.fkIdTaxEntity);
        hash = 97 * hash + Objects.hashCode(this.myfkIdTaxPriceProduct);
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
        final TaxPriceProductEntity other = (TaxPriceProductEntity) obj;
        if (!Objects.equals(this.idTaxPriceProduct, other.idTaxPriceProduct)) {
            return false;
        }
        if (!Objects.equals(this.fkIdPriceProduct, other.fkIdPriceProduct)) {
            return false;
        }
        if (!Objects.equals(this.fkIdTaxEntity, other.fkIdTaxEntity)) {
            return false;
        }
        if (!Objects.equals(this.myfkIdTaxPriceProduct, other.myfkIdTaxPriceProduct)) {
            return false;
        }
        return true;
    }

    
    
    
}
