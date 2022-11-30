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
@Table(name = "tblReservaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblReservaciones.findAll", query = "SELECT t FROM TblReservaciones t")
    , @NamedQuery(name = "TblReservaciones.findByIdReserva", query = "SELECT t FROM TblReservaciones t WHERE t.idReserva = :idReserva")
    , @NamedQuery(name = "TblReservaciones.findByFechaHora", query = "SELECT t FROM TblReservaciones t WHERE t.fechaHora = :fechaHora")})
public class TblReservaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReserva")
    private Integer idReserva;
    @Basic(optional = false)
    @Column(name = "fechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @OneToMany(mappedBy = "idReserva")
    private Collection<TblOrdenes> tblOrdenesCollection;
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false)
    private TblClientes idCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReserva")
    private Collection<TblMesasXReserva> tblMesasXReservaCollection;

    public TblReservaciones() {
    }

    public TblReservaciones(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public TblReservaciones(Integer idReserva, Date fechaHora) {
        this.idReserva = idReserva;
        this.fechaHora = fechaHora;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @XmlTransient
    public Collection<TblOrdenes> getTblOrdenesCollection() {
        return tblOrdenesCollection;
    }

    public void setTblOrdenesCollection(Collection<TblOrdenes> tblOrdenesCollection) {
        this.tblOrdenesCollection = tblOrdenesCollection;
    }

    public TblClientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(TblClientes idCliente) {
        this.idCliente = idCliente;
    }

    @XmlTransient
    public Collection<TblMesasXReserva> getTblMesasXReservaCollection() {
        return tblMesasXReservaCollection;
    }

    public void setTblMesasXReservaCollection(Collection<TblMesasXReserva> tblMesasXReservaCollection) {
        this.tblMesasXReservaCollection = tblMesasXReservaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReserva != null ? idReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblReservaciones)) {
            return false;
        }
        TblReservaciones other = (TblReservaciones) object;
        if ((this.idReserva == null && other.idReserva != null) || (this.idReserva != null && !this.idReserva.equals(other.idReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblReservaciones[ idReserva=" + idReserva + " ]";
    }
    
}
