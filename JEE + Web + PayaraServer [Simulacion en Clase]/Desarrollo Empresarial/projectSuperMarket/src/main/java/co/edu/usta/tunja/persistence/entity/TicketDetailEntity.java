package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="TICKET_DETAIL")
public class TicketDetailEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ticket_detail")
    private Integer idTicketDetail;

    @Column(name="amount",nullable = false)
    private Integer amount;

    @Column(name="devolution_request",nullable = false)
    private Date devolutionRequest;

    @Column(name="devolution_approved",nullable = false)
    private Date devolutionApproved;

    @ManyToOne
    @JoinColumn(name="fk_id_tax_price_product",insertable = false,updatable = false)
    private TaxPriceProductEntity fkIdTaxPriceProduct;

    @ManyToOne
    @JoinColumn(name="fk_id_ticket",insertable = false,updatable = false)
    private TaxEntity fkIdTicket;

    @ManyToOne
    @JoinColumn(name="fk_id_person_administrator",insertable = false,updatable = false)
    private PersonEntity fkIdPersonAdministrator;

    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdTicketDetail() {        return idTicketDetail;    }
    public void setIdTicketDetail(Integer idTicketDetail) {        this.idTicketDetail = idTicketDetail;    }

    public Integer getAmount() {        return amount;    }
    public void setAmount(Integer amount) {        this.amount = amount;    }

    public Date getDevolutionRequest() {        return devolutionRequest;    }
    public void setDevolutionRequest(Date devolutionRequest) {        this.devolutionRequest = devolutionRequest;    }

    public Date getDevolutionApproved() {        return devolutionApproved;    }
    public void setDevolutionApproved(Date devolutionApproved) {        this.devolutionApproved = devolutionApproved;    }

    public TaxPriceProductEntity getFkIdTaxPriceProduct() {        return fkIdTaxPriceProduct;    }
    public void setFkIdTaxPriceProduct(TaxPriceProductEntity fkIdTaxPriceProduct) {        this.fkIdTaxPriceProduct = fkIdTaxPriceProduct;    }

    public TaxEntity getFkIdTicket() {        return fkIdTicket;    }
    public void setFkIdTicket(TaxEntity fkIdTicket) {        this.fkIdTicket = fkIdTicket;    }

    public PersonEntity getFkIdPersonAdministrator() {        return fkIdPersonAdministrator;    }
    public void setFkIdPersonAdministrator(PersonEntity fkIdPersonAdministrator) {        this.fkIdPersonAdministrator = fkIdPersonAdministrator;    }
}
