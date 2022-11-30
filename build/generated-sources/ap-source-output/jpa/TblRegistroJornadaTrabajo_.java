package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblEmpleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblRegistroJornadaTrabajo.class)
public class TblRegistroJornadaTrabajo_ { 

    public static volatile SingularAttribute<TblRegistroJornadaTrabajo, Date> horaEntradaMarcada;
    public static volatile SingularAttribute<TblRegistroJornadaTrabajo, String> idHorario;
    public static volatile SingularAttribute<TblRegistroJornadaTrabajo, TblEmpleado> idEmpleado;
    public static volatile SingularAttribute<TblRegistroJornadaTrabajo, Date> horaSalidaMarcada;

}