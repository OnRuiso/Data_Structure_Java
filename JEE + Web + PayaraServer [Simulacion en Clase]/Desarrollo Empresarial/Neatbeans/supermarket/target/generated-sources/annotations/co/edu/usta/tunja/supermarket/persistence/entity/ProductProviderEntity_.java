package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PriceProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.ProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.ProviderEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(ProductProviderEntity.class)
public class ProductProviderEntity_ { 

    public static volatile SingularAttribute<ProductProviderEntity, Integer> idProductProvider;
    public static volatile SingularAttribute<ProductProviderEntity, ProviderEntity> fkIdProvider;
    public static volatile ListAttribute<ProductProviderEntity, PriceProductEntity> myPriceProduct;
    public static volatile SingularAttribute<ProductProviderEntity, Integer> stock;
    public static volatile SingularAttribute<ProductProviderEntity, ProductEntity> fkIdProduct;
    public static volatile SingularAttribute<ProductProviderEntity, String> barCode;

}