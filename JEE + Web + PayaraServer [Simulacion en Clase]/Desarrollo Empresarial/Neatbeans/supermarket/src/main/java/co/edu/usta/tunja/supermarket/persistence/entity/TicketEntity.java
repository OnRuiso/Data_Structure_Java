package co.edu.usta.tunja.supermarket.persistence.entity;

import javax.persistence.*;
import java.util.Date;
//import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TICKET")
public class TicketEntity
{
    /*
    public TicketEntity() {
        ticketDate = new Date();
    }
    */    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket",nullable = false)
    private Integer idTicket;

    @Column(name="ticket_date",nullable = false)
    private Date ticketDate;

    @Column(name="half_payment",length = 13,precision = 2,nullable = false)
    private Double halfPayment;

    
    @ManyToOne
    @JoinColumn(name="fk_id_person_cashier",insertable = false,updatable = false)
    private PersonEntity fkIdPersonCashier;

    @ManyToOne
    @JoinColumn(name="fk_id_person_customer",insertable = false,updatable = false)
    private PersonEntity fkIdPersonCustomer;
    
    @OneToMany(mappedBy = "fkIdTicket")
    private List<TicketDetailEntity> myfkIdTicket;
    
    /*
    @Column(name="fk_id_person_cashier",insertable = false,updatable = false)
    private Integer fkIdPersonCashier;
    
    @Column(name="fk_id_person_customer",insertable = false,updatable = false)
    private Integer fkIdPersonCustomer;
    */
    
    /*------------------------------------------Getters and Setters---------------------------------------------------*/

    public Integer getIdTicket() {        return idTicket;    }
    public void setIdTicket(Integer idTicket) {        this.idTicket = idTicket;    }

    public Date getTicketDate() {        return ticketDate;    }
    public void setTicketDate(Date ticketDate) {        this.ticketDate = ticketDate;    }

    public Double getHalfPayment() {        return halfPayment;    }
    public void setHalfPayment(Double halfPayment) {        this.halfPayment = halfPayment;    }
    
    
    public PersonEntity getFkIdPersonCashier() {        return fkIdPersonCashier;    }
    public void setFkIdPersonCashier(PersonEntity fkIdPersonCashier) {        this.fkIdPersonCashier = fkIdPersonCashier;    }

    public PersonEntity getFkIdPersonCustomer() {        return fkIdPersonCustomer;    }
    public void setFkIdPersonCustomer(PersonEntity fkIdPersonCustomer) {        this.fkIdPersonCustomer = fkIdPersonCustomer;    }

    public List<TicketDetailEntity> getMyfkIdTicket() {        return myfkIdTicket;    }
    public void setMyfkIdTicket(List<TicketDetailEntity> myfkIdTicket) {        this.myfkIdTicket = myfkIdTicket;}
    
    /*------------------------------------------ TO STRING ------------------------------------------*/
    
    @Override
    public String toString() {
        return "Fecha = " + ticketDate 
                + " Nombre Cajero = " + fkIdPersonCashier.getPersonName() + " " +fkIdPersonCashier.getPersonLastName()
                + " Informacion Cliente = " + fkIdPersonCustomer.getPersonName()+" "+fkIdPersonCustomer.getPersonLastName()
                + " DNI: "+fkIdPersonCustomer.getPersonDni()
                + '\n';
    }
    /*
        @Override
    public String toString() {
        return "Fecha = " + ticketDate 
                + " Nombre Cajero = " + fkIdPersonCashier
                + " Informacion Cliente = " + fkIdPersonCustomer
                +" DNI: "+fkIdPersonCustomer
                + '\n';
    }
    */
    /*------------------------------------------ EQUALS and HASH CODE ------------------------------------------*/

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.idTicket);
        hash = 43 * hash + Objects.hashCode(this.ticketDate);
        hash = 43 * hash + Objects.hashCode(this.halfPayment);
        hash = 43 * hash + Objects.hashCode(this.fkIdPersonCashier);
        hash = 43 * hash + Objects.hashCode(this.fkIdPersonCustomer);
        hash = 43 * hash + Objects.hashCode(this.myfkIdTicket);
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
        final TicketEntity other = (TicketEntity) obj;
        if (!Objects.equals(this.idTicket, other.idTicket)) {
            return false;
        }
        if (!Objects.equals(this.ticketDate, other.ticketDate)) {
            return false;
        }
        if (!Objects.equals(this.halfPayment, other.halfPayment)) {
            return false;
        }
        if (!Objects.equals(this.fkIdPersonCashier, other.fkIdPersonCashier)) {
            return false;
        }
        if (!Objects.equals(this.fkIdPersonCustomer, other.fkIdPersonCustomer)) {
            return false;
        }
        
        if (!Objects.equals(this.myfkIdTicket, other.myfkIdTicket)) {
            return false;
        }
        
        return true;
    }

    
    
    
}
