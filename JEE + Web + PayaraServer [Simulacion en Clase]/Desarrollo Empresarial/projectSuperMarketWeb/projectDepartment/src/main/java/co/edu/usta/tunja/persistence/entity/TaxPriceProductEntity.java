package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.util.List;

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
    private List<TicketDetailEntity> myTicketDetail;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdTaxPriceProduct() {        return idTaxPriceProduct;    }
    public void setIdTaxPriceProduct(Integer idTaxPriceProduct) {        this.idTaxPriceProduct = idTaxPriceProduct;    }

    public PriceProductEntity getFkIdPriceProduct() {        return fkIdPriceProduct;    }
    public void setFkIdPriceProduct(PriceProductEntity fkIdPriceProduct) {        this.fkIdPriceProduct = fkIdPriceProduct;    }

    public TaxEntity getFkIdTaxEntity() {        return fkIdTaxEntity;    }
    public void setFkIdTaxEntity(TaxEntity fkIdTaxEntity) {        this.fkIdTaxEntity = fkIdTaxEntity;    }

    public List<TicketDetailEntity> getMyTicketDetail() {        return myTicketDetail;    }
    public void setMyTicketDetail(List<TicketDetailEntity> myTicketDetail) {        this.myTicketDetail = myTicketDetail;    }
}
