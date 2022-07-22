package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

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
    
    @Column (name="description_devolution", nullable = false)
    private String descriptionDevolution;
    
    @ManyToOne
    @JoinColumn(name="fk_id_tax_price_product",insertable = false,updatable = false)
    private TaxPriceProductEntity fkIdTaxPriceProduct;

    @ManyToOne
    @JoinColumn(name="fk_id_ticket",insertable = false,updatable = false)
    private TicketEntity fkIdTicket;

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

    public PersonEntity getFkIdPersonAdministrator() {        return fkIdPersonAdministrator;    }
    public void setFkIdPersonAdministrator(PersonEntity fkIdPersonAdministrator) {        this.fkIdPersonAdministrator = fkIdPersonAdministrator;    }

    public String getDescriptionDevolution() {        return descriptionDevolution;    }
    public void setDescriptionDevolution(String descriptionDevolution) {        this.descriptionDevolution = descriptionDevolution;}

    public TicketEntity getFkIdTicket() {        return fkIdTicket;    }
    public void setFkIdTicket(TicketEntity fkIdTicket) {        this.fkIdTicket = fkIdTicket;    }
    
        
    /*------------------------------------------ TO STRING ------------------------------------------*/

    @Override
    public String toString() {
        return " Nombre Producto= " + fkIdTaxPriceProduct.getFkIdPriceProduct().getFkIdProductProvider().getFkIdProduct().getProductName() 
                + " Cantidad = " + amount
                + " Precio = " + fkIdTaxPriceProduct.getFkIdPriceProduct().getSalePrice()
                + " Impuesto = " + fkIdTaxPriceProduct.getFkIdTaxEntity().getTaxValue()
                + " TOTAL = " + (amount)*((fkIdTaxPriceProduct.getFkIdPriceProduct().getSalePrice())*(1+(fkIdTaxPriceProduct.getFkIdTaxEntity().getTaxValue()))) //cantidad * (precio*(1+impuesto))
                + '\n';
    }
    
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.idTicketDetail);
        hash = 11 * hash + Objects.hashCode(this.amount);
        hash = 11 * hash + Objects.hashCode(this.devolutionRequest);
        hash = 11 * hash + Objects.hashCode(this.devolutionApproved);
        hash = 11 * hash + Objects.hashCode(this.descriptionDevolution);
        hash = 11 * hash + Objects.hashCode(this.fkIdTaxPriceProduct);
        hash = 11 * hash + Objects.hashCode(this.fkIdTicket);
        hash = 11 * hash + Objects.hashCode(this.fkIdPersonAdministrator);
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
        final TicketDetailEntity other = (TicketDetailEntity) obj;
        if (!Objects.equals(this.descriptionDevolution, other.descriptionDevolution)) {
            return false;
        }
        if (!Objects.equals(this.idTicketDetail, other.idTicketDetail)) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        if (!Objects.equals(this.devolutionRequest, other.devolutionRequest)) {
            return false;
        }
        if (!Objects.equals(this.devolutionApproved, other.devolutionApproved)) {
            return false;
        }
        if (!Objects.equals(this.fkIdTaxPriceProduct, other.fkIdTaxPriceProduct)) {
            return false;
        }
        if (!Objects.equals(this.fkIdTicket, other.fkIdTicket)) {
            return false;
        }
        if (!Objects.equals(this.fkIdPersonAdministrator, other.fkIdPersonAdministrator)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
