package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblClientes;
import jpa.TblOrdenesFacturadas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblFactura.class)
public class TblFactura_ { 

    public static volatile SingularAttribute<TblFactura, Long> cambio;
    public static volatile SingularAttribute<TblFactura, Date> fecha;
    public static volatile SingularAttribute<TblFactura, Integer> idFormaPago;
    public static volatile SingularAttribute<TblFactura, Long> totalAPagar;
    public static volatile SingularAttribute<TblFactura, TblClientes> idCliente;
    public static volatile SingularAttribute<TblFactura, Integer> idFactura;
    public static volatile SingularAttribute<TblFactura, Long> efectivo;
    public static volatile SingularAttribute<TblFactura, TblOrdenesFacturadas> tblOrdenesFacturadas;

}