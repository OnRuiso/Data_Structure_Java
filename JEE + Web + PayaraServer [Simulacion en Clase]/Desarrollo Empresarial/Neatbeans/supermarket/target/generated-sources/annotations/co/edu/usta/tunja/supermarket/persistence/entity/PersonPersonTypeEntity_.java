package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PersonEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.PersonTypeEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(PersonPersonTypeEntity.class)
public class PersonPersonTypeEntity_ { 

    public static volatile SingularAttribute<PersonPersonTypeEntity, Integer> idPersonPersonType;
    public static volatile SingularAttribute<PersonPersonTypeEntity, PersonTypeEntity> fkIdPersonType;
    public static volatile SingularAttribute<PersonPersonTypeEntity, PersonEntity> fkIdPerson;

}