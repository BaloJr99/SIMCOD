package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblEmpleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblCargo.class)
public class TblCargo_ { 

    public static volatile CollectionAttribute<TblCargo, TblEmpleado> tblEmpleadoCollection;
    public static volatile SingularAttribute<TblCargo, Integer> idCargo;
    public static volatile SingularAttribute<TblCargo, String> cargo;

}