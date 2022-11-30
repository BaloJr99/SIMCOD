package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblMesas;
import jpa.TblReservaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblMesasXReserva.class)
public class TblMesasXReserva_ { 

    public static volatile SingularAttribute<TblMesasXReserva, Integer> idMesa;
    public static volatile SingularAttribute<TblMesasXReserva, TblMesas> tblMesas;
    public static volatile SingularAttribute<TblMesasXReserva, TblReservaciones> idReserva;

}