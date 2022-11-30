package jpa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblIngreXPedido;
import jpa.TblIngreXProd;
import jpa.TblProveedores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblIngredientes.class)
public class TblIngredientes_ { 

    public static volatile SingularAttribute<TblIngredientes, String> marca;
    public static volatile SingularAttribute<TblIngredientes, Integer> existencia;
    public static volatile SingularAttribute<TblIngredientes, String> unidad;
    public static volatile SingularAttribute<TblIngredientes, TblProveedores> idProveedor;
    public static volatile SingularAttribute<TblIngredientes, String> presentacion;
    public static volatile SingularAttribute<TblIngredientes, Date> fechaVencimientoLote;
    public static volatile CollectionAttribute<TblIngredientes, TblIngreXPedido> tblIngreXPedidoCollection;
    public static volatile CollectionAttribute<TblIngredientes, TblIngreXProd> tblIngreXProdCollection;
    public static volatile SingularAttribute<TblIngredientes, Integer> idIngrediente;
    public static volatile SingularAttribute<TblIngredientes, String> ingrediente;

}