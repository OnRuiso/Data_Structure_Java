package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.ProductProviderEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TaxPriceProductEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(PriceProductEntity.class)
public class PriceProductEntity_ { 

    public static volatile ListAttribute<PriceProductEntity, TaxPriceProductEntity> myTaxPriceProduct;
    public static volatile SingularAttribute<PriceProductEntity, Double> shopPrice;
    public static volatile SingularAttribute<PriceProductEntity, String> userUpdate;
    public static volatile SingularAttribute<PriceProductEntity, Integer> idPriceProduct;
    public static volatile SingularAttribute<PriceProductEntity, Double> salePrice;
    public static volatile SingularAttribute<PriceProductEntity, Date> dateUpdate;
    public static volatile SingularAttribute<PriceProductEntity, ProductProviderEntity> fkIdProductProvider;
    public static volatile SingularAttribute<PriceProductEntity, Date> startDate;

}