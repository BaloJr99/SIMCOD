package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblCargo;
import jpa.TblDireccionEmpleado;
import jpa.TblLogin;
import jpa.TblRegistroJornadaTrabajo;
import jpa.TblSucursales;
import jpa.TblTelefonoEmpleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblEmpleado.class)
public class TblEmpleado_ { 

    public static volatile SingularAttribute<TblEmpleado, Integer> tiempoExperiencia;
    public static volatile SingularAttribute<TblEmpleado, String> apellidoP;
    public static volatile SingularAttribute<TblEmpleado, Long> salario;
    public static volatile SingularAttribute<TblEmpleado, String> nombres;
    public static volatile CollectionAttribute<TblEmpleado, TblDireccionEmpleado> tblDireccionEmpleadoCollection;
    public static volatile CollectionAttribute<TblEmpleado, TblLogin> tblLoginCollection;
    public static volatile CollectionAttribute<TblEmpleado, TblTelefonoEmpleado> tblTelefonoEmpleadoCollection;
    public static volatile SingularAttribute<TblEmpleado, TblSucursales> idSucursal;
    public static volatile SingularAttribute<TblEmpleado, TblCargo> idCargo;
    public static volatile CollectionAttribute<TblEmpleado, TblRegistroJornadaTrabajo> tblRegistroJornadaTrabajoCollection;
    public static volatile SingularAttribute<TblEmpleado, Integer> idEmpleado;
    public static volatile SingularAttribute<TblEmpleado, String> correoEmpresarial;
    public static volatile SingularAttribute<TblEmpleado, String> apellidoM;
    public static volatile SingularAttribute<TblEmpleado, String> curp;

}