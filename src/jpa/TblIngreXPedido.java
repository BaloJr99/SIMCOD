/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblIngreXPedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblIngreXPedido.findAll", query = "SELECT t FROM TblIngreXPedido t")
    , @NamedQuery(name = "TblIngreXPedido.findByIdPedido", query = "SELECT t FROM TblIngreXPedido t WHERE t.idPedido = :idPedido")
    , @NamedQuery(name = "TblIngreXPedido.findByCantidad", query = "SELECT t FROM TblIngreXPedido t WHERE t.cantidad = :cantidad")
    , @NamedQuery(name = "TblIngreXPedido.findByObservaciones", query = "SELECT t FROM TblIngreXPedido t WHERE t.observaciones = :observaciones")})
public class TblIngreXPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPedido")
    private Integer idPedido;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "idIngrediente", referencedColumnName = "idIngrediente")
    @ManyToOne(optional = false)
    private TblIngredientes idIngrediente;
    @JoinColumn(name = "idPedido", referencedColumnName = "idPedido", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TblInventario tblInventario;
    @JoinColumn(name = "idSucursal", referencedColumnName = "idSucursal")
    @ManyToOne(optional = false)
    private TblSucursales idSucursal;

    public TblIngreXPedido() {
    }

    public TblIngreXPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public TblIngreXPedido(Integer idPedido, int cantidad, String observaciones) {
        this.idPedido = idPedido;
        this.cantidad = cantidad;
        this.observaciones = observaciones;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public TblIngredientes getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(TblIngredientes idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public TblInventario getTblInventario() {
        return tblInventario;
    }

    public void setTblInventario(TblInventario tblInventario) {
        this.tblInventario = tblInventario;
    }

    public TblSucursales getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(TblSucursales idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIngreXPedido)) {
            return false;
        }
        TblIngreXPedido other = (TblIngreXPedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblIngreXPedido[ idPedido=" + idPedido + " ]";
    }
    
}
