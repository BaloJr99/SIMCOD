package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblOrdenes;
import jpa.TblProductos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblPedido.class)
public class TblPedido_ { 

    public static volatile SingularAttribute<TblPedido, String> estado;
    public static volatile SingularAttribute<TblPedido, TblOrdenes> tblOrdenidOrden;
    public static volatile SingularAttribute<TblPedido, Integer> cantidad;
    public static volatile SingularAttribute<TblPedido, Integer> idPedido;
    public static volatile SingularAttribute<TblPedido, TblProductos> tblProductoidProducto;

}