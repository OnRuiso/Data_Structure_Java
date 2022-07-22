package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.ProductProviderEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(ProviderEntity.class)
public class ProviderEntity_ { 

    public static volatile SingularAttribute<ProviderEntity, String> address;
    public static volatile SingularAttribute<ProviderEntity, String> phoneNumber;
    public static volatile SingularAttribute<ProviderEntity, Integer> idProvider;
    public static volatile SingularAttribute<ProviderEntity, String> nit;
    public static volatile SingularAttribute<ProviderEntity, String> nameProvider;
    public static volatile SingularAttribute<ProviderEntity, String> url;
    public static volatile ListAttribute<ProviderEntity, ProductProviderEntity> myProductProvider;

}