/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblInventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblInventario.findAll", query = "SELECT t FROM TblInventario t")
    , @NamedQuery(name = "TblInventario.findByIdPedido", query = "SELECT t FROM TblInventario t WHERE t.idPedido = :idPedido")
    , @NamedQuery(name = "TblInventario.findByFecha", query = "SELECT t FROM TblInventario t WHERE t.fecha = :fecha")})
public class TblInventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPedido")
    private Integer idPedido;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tblInventario")
    private TblIngreXPedido tblIngreXPedido;
    @JoinColumn(name = "idSucursal", referencedColumnName = "idSucursal")
    @ManyToOne(optional = false)
    private TblSucursales idSucursal;

    public TblInventario() {
    }

    public TblInventario(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public TblInventario(Integer idPedido, Date fecha) {
        this.idPedido = idPedido;
        this.fecha = fecha;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TblIngreXPedido getTblIngreXPedido() {
        return tblIngreXPedido;
    }

    public void setTblIngreXPedido(TblIngreXPedido tblIngreXPedido) {
        this.tblIngreXPedido = tblIngreXPedido;
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
        if (!(object instanceof TblInventario)) {
            return false;
        }
        TblInventario other = (TblInventario) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblInventario[ idPedido=" + idPedido + " ]";
    }
    
}
