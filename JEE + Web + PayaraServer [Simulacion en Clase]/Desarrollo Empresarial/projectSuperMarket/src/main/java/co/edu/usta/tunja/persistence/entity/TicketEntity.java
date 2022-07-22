package co.edu.usta.tunja.persistence.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "TICKET")
public class TicketEntity
{
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
    private List<TicketDetailEntity> myTicketDetailtoTicket;

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

    public List<TicketDetailEntity> getMyTicketDetailtoTicket() {        return myTicketDetailtoTicket;    }
    public void setMyTicketDetailtoTicket(List<TicketDetailEntity> myTicketDetailtoTicket) {        this.myTicketDetailtoTicket = myTicketDetailtoTicket;    }
}
