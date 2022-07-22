package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonPersonTypeEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(PersonTypeEntity.class)
public class PersonTypeEntity_ { 

    public static volatile SingularAttribute<PersonTypeEntity, Integer> idPersonType;
    public static volatile SingularAttribute<PersonTypeEntity, String> personTypeName;
    public static volatile ListAttribute<PersonTypeEntity, PersonPersonTypeEntity> myPersonType;

}