package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblFactura;
import jpa.TblOrdenes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblOrdenesFacturadas.class)
public class TblOrdenesFacturadas_ { 

    public static volatile SingularAttribute<TblOrdenesFacturadas, TblFactura> tblFactura;
    public static volatile SingularAttribute<TblOrdenesFacturadas, Integer> idFactura;
    public static volatile SingularAttribute<TblOrdenesFacturadas, TblOrdenes> idOrden;

}