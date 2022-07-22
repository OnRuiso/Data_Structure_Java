package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
}
