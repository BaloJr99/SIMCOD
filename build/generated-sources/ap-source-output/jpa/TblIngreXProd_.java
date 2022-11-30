package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblIngreXProdPK;
import jpa.TblIngredientes;
import jpa.TblProductos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblIngreXProd.class)
public class TblIngreXProd_ { 

    public static volatile SingularAttribute<TblIngreXProd, TblProductos> tblProductos;
    public static volatile SingularAttribute<TblIngreXProd, String> medida;
    public static volatile SingularAttribute<TblIngreXProd, TblIngreXProdPK> tblIngreXProdPK;
    public static volatile SingularAttribute<TblIngreXProd, Double> cantidad;
    public static volatile SingularAttribute<TblIngreXProd, TblIngredientes> tblIngredientes;

}