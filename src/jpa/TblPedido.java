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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblPedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPedido.findAll", query = "SELECT t FROM TblPedido t")
    , @NamedQuery(name = "TblPedido.findByIdPedido", query = "SELECT t FROM TblPedido t WHERE t.idPedido = :idPedido")
    , @NamedQuery(name = "TblPedido.findByCantidad", query = "SELECT t FROM TblPedido t WHERE t.cantidad = :cantidad")
    , @NamedQuery(name = "TblPedido.findByEstado", query = "SELECT t FROM TblPedido t WHERE t.estado = :estado")})
public class TblPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPedido")
    private Integer idPedido;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "tblOrden_idOrden", referencedColumnName = "idOrden")
    @ManyToOne
    private TblOrdenes tblOrdenidOrden;
    @JoinColumn(name = "tblProducto_idProducto", referencedColumnName = "idProductos")
    @ManyToOne(optional = false)
    private TblProductos tblProductoidProducto;

    public TblPedido() {
    }

    public TblPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TblOrdenes getTblOrdenidOrden() {
        return tblOrdenidOrden;
    }

    public void setTblOrdenidOrden(TblOrdenes tblOrdenidOrden) {
        this.tblOrdenidOrden = tblOrdenidOrden;
    }

    public TblProductos getTblProductoidProducto() {
        return tblProductoidProducto;
    }

    public void setTblProductoidProducto(TblProductos tblProductoidProducto) {
        this.tblProductoidProducto = tblProductoidProducto;
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
        if (!(object instanceof TblPedido)) {
            return false;
        }
        TblPedido other = (TblPedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblPedido[ idPedido=" + idPedido + " ]";
    }
    
}
