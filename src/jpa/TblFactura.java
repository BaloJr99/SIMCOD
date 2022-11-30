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
@Table(name = "tblFactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblFactura.findAll", query = "SELECT t FROM TblFactura t")
    , @NamedQuery(name = "TblFactura.findByIdFactura", query = "SELECT t FROM TblFactura t WHERE t.idFactura = :idFactura")
    , @NamedQuery(name = "TblFactura.findByFecha", query = "SELECT t FROM TblFactura t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "TblFactura.findByTotalAPagar", query = "SELECT t FROM TblFactura t WHERE t.totalAPagar = :totalAPagar")
    , @NamedQuery(name = "TblFactura.findByEfectivo", query = "SELECT t FROM TblFactura t WHERE t.efectivo = :efectivo")
    , @NamedQuery(name = "TblFactura.findByCambio", query = "SELECT t FROM TblFactura t WHERE t.cambio = :cambio")
    , @NamedQuery(name = "TblFactura.findByIdFormaPago", query = "SELECT t FROM TblFactura t WHERE t.idFormaPago = :idFormaPago")})
public class TblFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idFactura")
    private Integer idFactura;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "totalAPagar")
    private long totalAPagar;
    @Column(name = "efectivo")
    private Long efectivo;
    @Column(name = "cambio")
    private Long cambio;
    @Basic(optional = false)
    @Column(name = "idFormaPago")
    private int idFormaPago;
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false)
    private TblClientes idCliente;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tblFactura")
    private TblOrdenesFacturadas tblOrdenesFacturadas;

    public TblFactura() {
    }

    public TblFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public TblFactura(Integer idFactura, Date fecha, long totalAPagar, int idFormaPago) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.totalAPagar = totalAPagar;
        this.idFormaPago = idFormaPago;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(long totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public Long getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Long efectivo) {
        this.efectivo = efectivo;
    }

    public Long getCambio() {
        return cambio;
    }

    public void setCambio(Long cambio) {
        this.cambio = cambio;
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public TblClientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(TblClientes idCliente) {
        this.idCliente = idCliente;
    }

    public TblOrdenesFacturadas getTblOrdenesFacturadas() {
        return tblOrdenesFacturadas;
    }

    public void setTblOrdenesFacturadas(TblOrdenesFacturadas tblOrdenesFacturadas) {
        this.tblOrdenesFacturadas = tblOrdenesFacturadas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblFactura)) {
            return false;
        }
        TblFactura other = (TblFactura) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblFactura[ idFactura=" + idFactura + " ]";
    }
    
}
