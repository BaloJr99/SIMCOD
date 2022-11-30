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
@Table(name = "tblOrdenesFacturadas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblOrdenesFacturadas.findAll", query = "SELECT t FROM TblOrdenesFacturadas t")
    , @NamedQuery(name = "TblOrdenesFacturadas.findByIdFactura", query = "SELECT t FROM TblOrdenesFacturadas t WHERE t.idFactura = :idFactura")})
public class TblOrdenesFacturadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idFactura")
    private Integer idFactura;
    @JoinColumn(name = "idFactura", referencedColumnName = "idFactura", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TblFactura tblFactura;
    @JoinColumn(name = "idOrden", referencedColumnName = "idOrden")
    @ManyToOne(optional = false)
    private TblOrdenes idOrden;

    public TblOrdenesFacturadas() {
    }

    public TblOrdenesFacturadas(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public TblFactura getTblFactura() {
        return tblFactura;
    }

    public void setTblFactura(TblFactura tblFactura) {
        this.tblFactura = tblFactura;
    }

    public TblOrdenes getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(TblOrdenes idOrden) {
        this.idOrden = idOrden;
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
        if (!(object instanceof TblOrdenesFacturadas)) {
            return false;
        }
        TblOrdenesFacturadas other = (TblOrdenesFacturadas) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblOrdenesFacturadas[ idFactura=" + idFactura + " ]";
    }
    
}
