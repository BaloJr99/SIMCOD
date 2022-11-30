/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblIngredientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblIngredientes.findAll", query = "SELECT t FROM TblIngredientes t")
    , @NamedQuery(name = "TblIngredientes.findByIdIngrediente", query = "SELECT t FROM TblIngredientes t WHERE t.idIngrediente = :idIngrediente")
    , @NamedQuery(name = "TblIngredientes.findByIngrediente", query = "SELECT t FROM TblIngredientes t WHERE t.ingrediente = :ingrediente")
    , @NamedQuery(name = "TblIngredientes.findByPresentacion", query = "SELECT t FROM TblIngredientes t WHERE t.presentacion = :presentacion")
    , @NamedQuery(name = "TblIngredientes.findByMarca", query = "SELECT t FROM TblIngredientes t WHERE t.marca = :marca")
    , @NamedQuery(name = "TblIngredientes.findByFechaVencimientoLote", query = "SELECT t FROM TblIngredientes t WHERE t.fechaVencimientoLote = :fechaVencimientoLote")
    , @NamedQuery(name = "TblIngredientes.findByExistencia", query = "SELECT t FROM TblIngredientes t WHERE t.existencia = :existencia")
    , @NamedQuery(name = "TblIngredientes.findByUnidad", query = "SELECT t FROM TblIngredientes t WHERE t.unidad = :unidad")})
public class TblIngredientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idIngrediente")
    private Integer idIngrediente;
    @Basic(optional = false)
    @Column(name = "ingrediente")
    private String ingrediente;
    @Basic(optional = false)
    @Column(name = "presentacion")
    private String presentacion;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "fechaVencimientoLote")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimientoLote;
    @Column(name = "existencia")
    private Integer existencia;
    @Column(name = "unidad")
    private String unidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idIngrediente")
    private Collection<TblIngreXPedido> tblIngreXPedidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tblIngredientes")
    private Collection<TblIngreXProd> tblIngreXProdCollection;
    @JoinColumn(name = "idProveedor", referencedColumnName = "idProveedor")
    @ManyToOne(optional = false)
    private TblProveedores idProveedor;

    public TblIngredientes() {
    }

    public TblIngredientes(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public TblIngredientes(Integer idIngrediente, String ingrediente, String presentacion, String marca, Date fechaVencimientoLote) {
        this.idIngrediente = idIngrediente;
        this.ingrediente = ingrediente;
        this.presentacion = presentacion;
        this.marca = marca;
        this.fechaVencimientoLote = fechaVencimientoLote;
    }

    public Integer getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFechaVencimientoLote() {
        return fechaVencimientoLote;
    }

    public void setFechaVencimientoLote(Date fechaVencimientoLote) {
        this.fechaVencimientoLote = fechaVencimientoLote;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @XmlTransient
    public Collection<TblIngreXPedido> getTblIngreXPedidoCollection() {
        return tblIngreXPedidoCollection;
    }

    public void setTblIngreXPedidoCollection(Collection<TblIngreXPedido> tblIngreXPedidoCollection) {
        this.tblIngreXPedidoCollection = tblIngreXPedidoCollection;
    }

    @XmlTransient
    public Collection<TblIngreXProd> getTblIngreXProdCollection() {
        return tblIngreXProdCollection;
    }

    public void setTblIngreXProdCollection(Collection<TblIngreXProd> tblIngreXProdCollection) {
        this.tblIngreXProdCollection = tblIngreXProdCollection;
    }

    public TblProveedores getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(TblProveedores idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIngrediente != null ? idIngrediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIngredientes)) {
            return false;
        }
        TblIngredientes other = (TblIngredientes) object;
        if ((this.idIngrediente == null && other.idIngrediente != null) || (this.idIngrediente != null && !this.idIngrediente.equals(other.idIngrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblIngredientes[ idIngrediente=" + idIngrediente + " ]";
    }
    
}
