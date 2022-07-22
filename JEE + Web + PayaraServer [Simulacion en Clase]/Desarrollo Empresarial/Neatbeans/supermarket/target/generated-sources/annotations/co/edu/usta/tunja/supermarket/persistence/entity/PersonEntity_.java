package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonPersonTypeEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketDetailEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(PersonEntity.class)
public class PersonEntity_ { 

    public static volatile SingularAttribute<PersonEntity, String> personName;
    public static volatile SingularAttribute<PersonEntity, String> personPhone;
    public static volatile SingularAttribute<PersonEntity, String> personDni;
    public static volatile SingularAttribute<PersonEntity, Integer> idPerson;
    public static volatile SingularAttribute<PersonEntity, String> personAddress;
    public static volatile ListAttribute<PersonEntity, TicketEntity> myfkIdPersonCashier;
    public static volatile SingularAttribute<PersonEntity, String> personLastName;
    public static volatile ListAttribute<PersonEntity, PersonPersonTypeEntity> myFKIdPerson;
    public static volatile ListAttribute<PersonEntity, TicketEntity> myfkIdPersonCustomer;
    public static volatile ListAttribute<PersonEntity, TicketDetailEntity> myfkIdPersonAdministrator;

}