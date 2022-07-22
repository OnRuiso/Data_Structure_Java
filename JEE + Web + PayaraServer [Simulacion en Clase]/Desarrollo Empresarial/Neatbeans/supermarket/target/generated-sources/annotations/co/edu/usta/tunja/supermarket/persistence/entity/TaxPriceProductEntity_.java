package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.PriceProductEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TaxEntity;
import co.edu.usta.tunja.supermarket.persistence.entity.TicketDetailEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(TaxPriceProductEntity.class)
public class TaxPriceProductEntity_ { 

    public static volatile SingularAttribute<TaxPriceProductEntity, PriceProductEntity> fkIdPriceProduct;
    public static volatile ListAttribute<TaxPriceProductEntity, TicketDetailEntity> myfkIdTaxPriceProduct;
    public static volatile SingularAttribute<TaxPriceProductEntity, Integer> idTaxPriceProduct;
    public static volatile SingularAttribute<TaxPriceProductEntity, TaxEntity> fkIdTaxEntity;

}