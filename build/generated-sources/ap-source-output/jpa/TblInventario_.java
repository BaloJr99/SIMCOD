package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblIngreXPedido;
import jpa.TblSucursales;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblInventario.class)
public class TblInventario_ { 

    public static volatile SingularAttribute<TblInventario, TblSucursales> idSucursal;
    public static volatile SingularAttribute<TblInventario, Date> fecha;
    public static volatile SingularAttribute<TblInventario, Integer> idPedido;
    public static volatile SingularAttribute<TblInventario, TblIngreXPedido> tblIngreXPedido;

}