package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblClientes;
import jpa.TblMesasXReserva;
import jpa.TblOrdenes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblReservaciones.class)
public class TblReservaciones_ { 

    public static volatile SingularAttribute<TblReservaciones, TblClientes> idCliente;
    public static volatile SingularAttribute<TblReservaciones, Date> fechaHora;
    public static volatile CollectionAttribute<TblReservaciones, TblMesasXReserva> tblMesasXReservaCollection;
    public static volatile SingularAttribute<TblReservaciones, Integer> idReserva;
    public static volatile CollectionAttribute<TblReservaciones, TblOrdenes> tblOrdenesCollection;

}