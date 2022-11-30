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
@Table(name = "tblTelefonoEmpleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTelefonoEmpleado.findAll", query = "SELECT t FROM TblTelefonoEmpleado t")
    , @NamedQuery(name = "TblTelefonoEmpleado.findByIdTelefono", query = "SELECT t FROM TblTelefonoEmpleado t WHERE t.idTelefono = :idTelefono")
    , @NamedQuery(name = "TblTelefonoEmpleado.findByNumero", query = "SELECT t FROM TblTelefonoEmpleado t WHERE t.numero = :numero")})
public class TblTelefonoEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTelefono")
    private Integer idTelefono;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false)
    private TblEmpleado idEmpleado;

    public TblTelefonoEmpleado() {
    }

    public TblTelefonoEmpleado(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    public TblTelefonoEmpleado(Integer idTelefono, String numero) {
        this.idTelefono = idTelefono;
        this.numero = numero;
    }

    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TblEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTelefono != null ? idTelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTelefonoEmpleado)) {
            return false;
        }
        TblTelefonoEmpleado other = (TblTelefonoEmpleado) object;
        if ((this.idTelefono == null && other.idTelefono != null) || (this.idTelefono != null && !this.idTelefono.equals(other.idTelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblTelefonoEmpleado[ idTelefono=" + idTelefono + " ]";
    }
    
}
