package co.edu.usta.tunja.supermarket.persistence.entity;

import co.edu.usta.tunja.supermarket.persistence.entity.ProductTypeEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T18:23:39")
@StaticMetamodel(ProductEntity.class)
public class ProductEntity_ { 

    public static volatile SingularAttribute<ProductEntity, ProductTypeEntity> fkProductType;
    public static volatile SingularAttribute<ProductEntity, Integer> idProduct;
    public static volatile SingularAttribute<ProductEntity, Integer> fkIdProductType;
    public static volatile SingularAttribute<ProductEntity, String> productName;

}