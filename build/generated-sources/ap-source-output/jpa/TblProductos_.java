package jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.TblIngreXProd;
import jpa.TblPedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T11:46:40")
@StaticMetamodel(TblProductos.class)
public class TblProductos_ { 

    public static volatile SingularAttribute<TblProductos, String> descripcion;
    public static volatile SingularAttribute<TblProductos, Double> precio;
    public static volatile CollectionAttribute<TblProductos, TblPedido> tblPedidoCollection;
    public static volatile SingularAttribute<TblProductos, Integer> idProductos;
    public static volatile SingularAttribute<TblProductos, String> categoria;
    public static volatile SingularAttribute<TblProductos, Integer> idTipo;
    public static volatile CollectionAttribute<TblProductos, TblIngreXProd> tblIngreXProdCollection;
    public static volatile SingularAttribute<TblProductos, String> nombre;

}