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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblCargo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCargo.findAll", query = "SELECT t FROM TblCargo t")
    , @NamedQuery(name = "TblCargo.findByIdCargo", query = "SELECT t FROM TblCargo t WHERE t.idCargo = :idCargo")
    , @NamedQuery(name = "TblCargo.findByCargo", query = "SELECT t FROM TblCargo t WHERE t.cargo = :cargo")})
public class TblCargo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCargo")
    private Integer idCargo;
    @Basic(optional = false)
    @Column(name = "cargo")
    private String cargo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCargo")
    private Collection<TblEmpleado> tblEmpleadoCollection;

    public TblCargo() {
    }

    public TblCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public TblCargo(Integer idCargo, String cargo) {
        this.idCargo = idCargo;
        this.cargo = cargo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @XmlTransient
    public Collection<TblEmpleado> getTblEmpleadoCollection() {
        return tblEmpleadoCollection;
    }

    public void setTblEmpleadoCollection(Collection<TblEmpleado> tblEmpleadoCollection) {
        this.tblEmpleadoCollection = tblEmpleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCargo != null ? idCargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCargo)) {
            return false;
        }
        TblCargo other = (TblCargo) object;
        if ((this.idCargo == null && other.idCargo != null) || (this.idCargo != null && !this.idCargo.equals(other.idCargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblCargo[ idCargo=" + idCargo + " ]";
    }
    
}
