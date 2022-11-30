package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblMesas;
import jpa.TblOrdenesFacturadas;
import jpa.TblPedido;
import jpa.TblReservaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblOrdenes.class)
public class TblOrdenes_ { 

    public static volatile SingularAttribute<TblOrdenes, Date> fecha;
    public static volatile SingularAttribute<TblOrdenes, Double> total;
    public static volatile SingularAttribute<TblOrdenes, String> estado;
    public static volatile SingularAttribute<TblOrdenes, TblMesas> idMesa;
    public static volatile CollectionAttribute<TblOrdenes, TblPedido> tblPedidoCollection;
    public static volatile SingularAttribute<TblOrdenes, Integer> banco;
    public static volatile CollectionAttribute<TblOrdenes, TblOrdenesFacturadas> tblOrdenesFacturadasCollection;
    public static volatile SingularAttribute<TblOrdenes, String> formaPago;
    public static volatile SingularAttribute<TblOrdenes, Integer> idOrden;
    public static volatile SingularAttribute<TblOrdenes, TblReservaciones> idReserva;

}