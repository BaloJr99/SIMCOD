package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblIngredientes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblProveedores.class)
public class TblProveedores_ { 

    public static volatile SingularAttribute<TblProveedores, String> nombreContacto;
    public static volatile SingularAttribute<TblProveedores, String> apellidoMContacto;
    public static volatile SingularAttribute<TblProveedores, Integer> idProveedor;
    public static volatile SingularAttribute<TblProveedores, String> proveedor;
    public static volatile SingularAttribute<TblProveedores, String> direccionWeb;
    public static volatile SingularAttribute<TblProveedores, String> telefono;
    public static volatile SingularAttribute<TblProveedores, String> apellidoPContacto;
    public static volatile CollectionAttribute<TblProveedores, TblIngredientes> tblIngredientesCollection;

}