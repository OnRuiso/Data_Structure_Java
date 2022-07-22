package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TaxPriceProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(TicketDetailEntity.class)
public class TicketDetailEntity_ { 

    public static volatile SingularAttribute<TicketDetailEntity, Date> devolutionApproved;
    public static volatile SingularAttribute<TicketDetailEntity, Integer> amount;
    public static volatile SingularAttribute<TicketDetailEntity, String> descriptionDevolution;
    public static volatile SingularAttribute<TicketDetailEntity, TicketEntity> fkIdTicket;
    public static volatile SingularAttribute<TicketDetailEntity, TaxPriceProductEntity> fkIdTaxPriceProduct;
    public static volatile SingularAttribute<TicketDetailEntity, Date> devolutionRequest;
    public static volatile SingularAttribute<TicketDetailEntity, PersonEntity> fkIdPersonAdministrator;
    public static volatile SingularAttribute<TicketDetailEntity, Integer> idTicketDetail;

}