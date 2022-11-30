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
@Table(name = "tblMesasXReserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblMesasXReserva.findAll", query = "SELECT t FROM TblMesasXReserva t")
    , @NamedQuery(name = "TblMesasXReserva.findByIdMesa", query = "SELECT t FROM TblMesasXReserva t WHERE t.idMesa = :idMesa")})
public class TblMesasXReserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idMesa")
    private Integer idMesa;
    @JoinColumn(name = "idMesa", referencedColumnName = "idMesas", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TblMesas tblMesas;
    @JoinColumn(name = "idReserva", referencedColumnName = "idReserva")
    @ManyToOne(optional = false)
    private TblReservaciones idReserva;

    public TblMesasXReserva() {
    }

    public TblMesasXReserva(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public TblMesas getTblMesas() {
        return tblMesas;
    }

    public void setTblMesas(TblMesas tblMesas) {
        this.tblMesas = tblMesas;
    }

    public TblReservaciones getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(TblReservaciones idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMesa != null ? idMesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblMesasXReserva)) {
            return false;
        }
        TblMesasXReserva other = (TblMesasXReserva) object;
        if ((this.idMesa == null && other.idMesa != null) || (this.idMesa != null && !this.idMesa.equals(other.idMesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblMesasXReserva[ idMesa=" + idMesa + " ]";
    }
    
}
