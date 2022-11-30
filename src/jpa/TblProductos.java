/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblProductos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblProductos.findAll", query = "SELECT t FROM TblProductos t")
    , @NamedQuery(name = "TblProductos.findByIdProductos", query = "SELECT t FROM TblProductos t WHERE t.idProductos = :idProductos")
    , @NamedQuery(name = "TblProductos.findByIdTipo", query = "SELECT t FROM TblProductos t WHERE t.idTipo = :idTipo")
    , @NamedQuery(name = "TblProductos.findByNombre", query = "SELECT t FROM TblProductos t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TblProductos.findByPrecio", query = "SELECT t FROM TblProductos t WHERE t.precio = :precio")
    , @NamedQuery(name = "TblProductos.findByDescripcion", query = "SELECT t FROM TblProductos t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TblProductos.findByCategoria", query = "SELECT t FROM TblProductos t WHERE t.categoria = :categoria")})
public class TblProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProductos")
    private Integer idProductos;
    @Basic(optional = false)
    @Column(name = "idTipo")
    private int idTipo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblProductos")
    private Collection<TblIngreXProd> tblIngreXProdCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblProductoidProducto")
    private Collection<TblPedido> tblPedidoCollection;

    public TblProductos() {
    }

    public TblProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }

    public TblProductos(Integer idProductos, int idTipo, String nombre, double precio, String descripcion, String categoria) {
        this.idProductos = idProductos;
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public Integer getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public Collection<TblIngreXProd> getTblIngreXProdCollection() {
        return tblIngreXProdCollection;
    }

    public void setTblIngreXProdCollection(Collection<TblIngreXProd> tblIngreXProdCollection) {
        this.tblIngreXProdCollection = tblIngreXProdCollection;
    }

    @XmlTransient
    public Collection<TblPedido> getTblPedidoCollection() {
        return tblPedidoCollection;
    }

    public void setTblPedidoCollection(Collection<TblPedido> tblPedidoCollection) {
        this.tblPedidoCollection = tblPedidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductos != null ? idProductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProductos)) {
            return false;
        }
        TblProductos other = (TblProductos) object;
        if ((this.idProductos == null && other.idProductos != null) || (this.idProductos != null && !this.idProductos.equals(other.idProductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblProductos[ idProductos=" + idProductos + " ]";
    }
    
}
