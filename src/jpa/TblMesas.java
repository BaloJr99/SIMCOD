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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblMesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblMesas.findAll", query = "SELECT t FROM TblMesas t")
    , @NamedQuery(name = "TblMesas.findByIdMesas", query = "SELECT t FROM TblMesas t WHERE t.idMesas = :idMesas")
    , @NamedQuery(name = "TblMesas.findByIdSucursal", query = "SELECT t FROM TblMesas t WHERE t.idSucursal = :idSucursal")
    , @NamedQuery(name = "TblMesas.findByCapacidad", query = "SELECT t FROM TblMesas t WHERE t.capacidad = :capacidad")
    , @NamedQuery(name = "TblMesas.findByEstado", query = "SELECT t FROM TblMesas t WHERE t.estado = :estado")})
public class TblMesas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMesas")
    private Integer idMesas;
    @Basic(optional = false)
    @Column(name = "idSucursal")
    private int idSucursal;
    @Basic(optional = false)
    @Column(name = "capacidad")
    private String capacidad;
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idMesa")
    private Collection<TblOrdenes> tblOrdenesCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tblMesas")
    private TblMesasXReserva tblMesasXReserva;

    public TblMesas() {
    }

    public TblMesas(Integer idMesas) {
        this.idMesas = idMesas;
    }

    public TblMesas(Integer idMesas, int idSucursal, String capacidad) {
        this.idMesas = idMesas;
        this.idSucursal = idSucursal;
        this.capacidad = capacidad;
    }

    public Integer getIdMesas() {
        return idMesas;
    }

    public void setIdMesas(Integer idMesas) {
        this.idMesas = idMesas;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<TblOrdenes> getTblOrdenesCollection() {
        return tblOrdenesCollection;
    }

    public void setTblOrdenesCollection(Collection<TblOrdenes> tblOrdenesCollection) {
        this.tblOrdenesCollection = tblOrdenesCollection;
    }

    public TblMesasXReserva getTblMesasXReserva() {
        return tblMesasXReserva;
    }

    public void setTblMesasXReserva(TblMesasXReserva tblMesasXReserva) {
        this.tblMesasXReserva = tblMesasXReserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMesas != null ? idMesas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblMesas)) {
            return false;
        }
        TblMesas other = (TblMesas) object;
        if ((this.idMesas == null && other.idMesas != null) || (this.idMesas != null && !this.idMesas.equals(other.idMesas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblMesas[ idMesas=" + idMesas + " ]";
    }
    
}
