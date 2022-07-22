package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketDetailEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(TicketEntity.class)
public class TicketEntity_ { 

    public static volatile SingularAttribute<TicketEntity, Integer> idTicket;
    public static volatile SingularAttribute<TicketEntity, PersonEntity> fkIdPersonCustomer;
    public static volatile ListAttribute<TicketEntity, TicketDetailEntity> myfkIdTicket;
    public static volatile SingularAttribute<TicketEntity, Double> halfPayment;
    public static volatile SingularAttribute<TicketEntity, PersonEntity> fkIdPersonCashier;
    public static volatile SingularAttribute<TicketEntity, Date> ticketDate;

}