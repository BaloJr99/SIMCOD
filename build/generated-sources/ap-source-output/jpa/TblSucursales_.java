package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblEmpleado;
import jpa.TblIngreXPedido;
import jpa.TblInventario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblSucursales.class)
public class TblSucursales_ { 

    public static volatile CollectionAttribute<TblSucursales, TblEmpleado> tblEmpleadoCollection;
    public static volatile SingularAttribute<TblSucursales, Integer> idSucursal;
    public static volatile SingularAttribute<TblSucursales, String> codPost;
    public static volatile SingularAttribute<TblSucursales, String> numControl;
    public static volatile SingularAttribute<TblSucursales, Integer> numero;
    public static volatile SingularAttribute<TblSucursales, String> ciudad;
    public static volatile CollectionAttribute<TblSucursales, TblInventario> tblInventarioCollection;
    public static volatile SingularAttribute<TblSucursales, String> calle;
    public static volatile CollectionAttribute<TblSucursales, TblIngreXPedido> tblIngreXPedidoCollection;
    public static volatile SingularAttribute<TblSucursales, String> telefono;
    public static volatile SingularAttribute<TblSucursales, String> nombre;
    public static volatile SingularAttribute<TblSucursales, String> colonia;

}