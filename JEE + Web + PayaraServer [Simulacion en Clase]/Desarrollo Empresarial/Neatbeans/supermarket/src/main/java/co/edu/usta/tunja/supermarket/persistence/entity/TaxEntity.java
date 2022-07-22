package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="TAX")
public class TaxEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tax",nullable = false)
    private Integer idTax;

    @Column(name="tax_value",length = 5, precision = 2 ,nullable = false)
    private Double taxValue;

    @Column(name="tax_name",length = 15,nullable = false)
    private String taxName;

    @Column(name="creation_date",nullable = true)
    private Date creationDate;

    @OneToMany(mappedBy = "fkIdTaxEntity")
    private List<TaxPriceProductEntity> myTaxPriceProduct;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdTax() {        return idTax;    }
    public void setIdTax(Integer idTax) {        this.idTax = idTax;    }

    public Double getTaxValue() {        return taxValue;    }
    public void setTaxValue(Double taxValue) {        this.taxValue = taxValue;    }

    public String getTaxName() {        return taxName;    }
    public void setTaxName(String taxName) {        this.taxName = taxName;    }

    public Date getCreationDate() {        return creationDate;    }
    public void setCreationDate(Date creationDate) {        this.creationDate = creationDate;    }

    public List<TaxPriceProductEntity> getMyTaxPriceProduct() {        return myTaxPriceProduct;    }
    public void setMyTaxPriceProduct(List<TaxPriceProductEntity> myTaxPriceProduct) {        this.myTaxPriceProduct = myTaxPriceProduct;    }
    
    /*------------------------------------------ TO STRING ------------------------------------------*/

    @Override
    public String toString() {
        return "taxValue=" + taxValue + " taxName=" + taxName + '\n';
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idTax);
        hash = 89 * hash + Objects.hashCode(this.taxValue);
        hash = 89 * hash + Objects.hashCode(this.taxName);
        hash = 89 * hash + Objects.hashCode(this.creationDate);
        hash = 89 * hash + Objects.hashCode(this.myTaxPriceProduct);
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
        final TaxEntity other = (TaxEntity) obj;
        if (!Objects.equals(this.taxName, other.taxName)) {
            return false;
        }
        if (!Objects.equals(this.idTax, other.idTax)) {
            return false;
        }
        if (!Objects.equals(this.taxValue, other.taxValue)) {
            return false;
        }
        if (!Objects.equals(this.creationDate, other.creationDate)) {
            return false;
        }
        if (!Objects.equals(this.myTaxPriceProduct, other.myTaxPriceProduct)) {
            return false;
        }
        return true;
    }
    
    
}
