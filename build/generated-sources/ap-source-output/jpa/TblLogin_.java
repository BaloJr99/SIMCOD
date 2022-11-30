package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblEmpleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblLogin.class)
public class TblLogin_ { 

    public static volatile SingularAttribute<TblLogin, TblEmpleado> idEmpleado;
    public static volatile SingularAttribute<TblLogin, String> usuario;
    public static volatile SingularAttribute<TblLogin, String> contrasenia;
    public static volatile SingularAttribute<TblLogin, Integer> idLogin;

}