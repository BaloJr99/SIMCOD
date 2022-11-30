package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblEmpleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblDireccionEmpleado.class)
public class TblDireccionEmpleado_ { 

    public static volatile SingularAttribute<TblDireccionEmpleado, Integer> idDireccion;
    public static volatile SingularAttribute<TblDireccionEmpleado, String> codPost;
    public static volatile SingularAttribute<TblDireccionEmpleado, Integer> numero;
    public static volatile SingularAttribute<TblDireccionEmpleado, TblEmpleado> idEmpleado;
    public static volatile SingularAttribute<TblDireccionEmpleado, String> ciudad;
    public static volatile SingularAttribute<TblDireccionEmpleado, String> calle;
    public static volatile SingularAttribute<TblDireccionEmpleado, String> colonia;

}