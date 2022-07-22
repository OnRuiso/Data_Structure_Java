package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.TaxPriceProductEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(TaxEntity.class)
public class TaxEntity_ { 

    public static volatile ListAttribute<TaxEntity, TaxPriceProductEntity> myTaxPriceProduct;
    public static volatile SingularAttribute<TaxEntity, Double> taxValue;
    public static volatile SingularAttribute<TaxEntity, Integer> idTax;
    public static volatile SingularAttribute<TaxEntity, Date> creationDate;
    public static volatile SingularAttribute<TaxEntity, String> taxName;

}