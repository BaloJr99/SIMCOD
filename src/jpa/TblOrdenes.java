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
@Table(name = "tblOrdenes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblOrdenes.findAll", query = "SELECT t FROM TblOrdenes t")
    , @NamedQuery(name = "TblOrdenes.findByIdOrden", query = "SELECT t FROM TblOrdenes t WHERE t.idOrden = :idOrden")
    , @NamedQuery(name = "TblOrdenes.findByTotal", query = "SELECT t FROM TblOrdenes t WHERE t.total = :total")
    , @NamedQuery(name = "TblOrdenes.findByEstado", query = "SELECT t FROM TblOrdenes t WHERE t.estado = :estado")
    , @NamedQuery(name = "TblOrdenes.findByFormaPago", query = "SELECT t FROM TblOrdenes t WHERE t.formaPago = :formaPago")
    , @NamedQuery(name = "TblOrdenes.findByFecha", query = "SELECT t FROM TblOrdenes t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "TblOrdenes.findByBanco", query = "SELECT t FROM TblOrdenes t WHERE t.banco = :banco")})
public class TblOrdenes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idOrden")
    private Integer idOrden;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @Column(name = "estado")
    private String estado;
    @Column(name = "formaPago")
    private String formaPago;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "banco")
    private Integer banco;
    @JoinColumn(name = "idMesa", referencedColumnName = "idMesas")
    @ManyToOne
    private TblMesas idMesa;
    @JoinColumn(name = "idReserva", referencedColumnName = "idReserva")
    @ManyToOne
    private TblReservaciones idReserva;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrden")
    private Collection<TblOrdenesFacturadas> tblOrdenesFacturadasCollection;
    @OneToMany(mappedBy = "tblOrdenidOrden")
    private Collection<TblPedido> tblPedidoCollection;

    public TblOrdenes() {
    }

    public TblOrdenes(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getBanco() {
        return banco;
    }

    public void setBanco(Integer banco) {
        this.banco = banco;
    }

    public TblMesas getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(TblMesas idMesa) {
        this.idMesa = idMesa;
    }

    public TblReservaciones getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(TblReservaciones idReserva) {
        this.idReserva = idReserva;
    }

    @XmlTransient
    public Collection<TblOrdenesFacturadas> getTblOrdenesFacturadasCollection() {
        return tblOrdenesFacturadasCollection;
    }

    public void setTblOrdenesFacturadasCollection(Collection<TblOrdenesFacturadas> tblOrdenesFacturadasCollection) {
        this.tblOrdenesFacturadasCollection = tblOrdenesFacturadasCollection;
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
        hash += (idOrden != null ? idOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblOrdenes)) {
            return false;
        }
        TblOrdenes other = (TblOrdenes) object;
        if ((this.idOrden == null && other.idOrden != null) || (this.idOrden != null && !this.idOrden.equals(other.idOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblOrdenes[ idOrden=" + idOrden + " ]";
    }
    
}
