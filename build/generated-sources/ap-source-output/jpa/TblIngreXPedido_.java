package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblIngredientes;
import jpa.TblInventario;
import jpa.TblSucursales;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblIngreXPedido.class)
public class TblIngreXPedido_ { 

    public static volatile SingularAttribute<TblIngreXPedido, TblSucursales> idSucursal;
    public static volatile SingularAttribute<TblIngreXPedido, TblInventario> tblInventario;
    public static volatile SingularAttribute<TblIngreXPedido, String> observaciones;
    public static volatile SingularAttribute<TblIngreXPedido, Integer> cantidad;
    public static volatile SingularAttribute<TblIngreXPedido, Integer> idPedido;
    public static volatile SingularAttribute<TblIngreXPedido, TblIngredientes> idIngrediente;

}