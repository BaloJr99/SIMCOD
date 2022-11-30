package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblFactura;
import jpa.TblReservaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblClientes.class)
public class TblClientes_ { 

    public static volatile CollectionAttribute<TblClientes, TblFactura> tblFacturaCollection;
    public static volatile CollectionAttribute<TblClientes, TblReservaciones> tblReservacionesCollection;
    public static volatile SingularAttribute<TblClientes, Integer> idCliente;
    public static volatile SingularAttribute<TblClientes, String> apellidoP;
    public static volatile SingularAttribute<TblClientes, String> apellidoM;
    public static volatile SingularAttribute<TblClientes, String> telefono;
    public static volatile SingularAttribute<TblClientes, String> nombre;

}