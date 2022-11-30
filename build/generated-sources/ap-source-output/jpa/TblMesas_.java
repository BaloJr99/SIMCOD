package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblMesasXReserva;
import jpa.TblOrdenes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblMesas.class)
public class TblMesas_ { 

    public static volatile SingularAttribute<TblMesas, Integer> idSucursal;
    public static volatile SingularAttribute<TblMesas, String> estado;
    public static volatile SingularAttribute<TblMesas, TblMesasXReserva> tblMesasXReserva;
    public static volatile SingularAttribute<TblMesas, Integer> idMesas;
    public static volatile SingularAttribute<TblMesas, String> capacidad;
    public static volatile CollectionAttribute<TblMesas, TblOrdenes> tblOrdenesCollection;

}