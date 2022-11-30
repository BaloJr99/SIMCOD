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
@Table(name = "tblClientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblClientes.findAll", query = "SELECT t FROM TblClientes t")
    , @NamedQuery(name = "TblClientes.findByIdCliente", query = "SELECT t FROM TblClientes t WHERE t.idCliente = :idCliente")
    , @NamedQuery(name = "TblClientes.findByNombre", query = "SELECT t FROM TblClientes t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TblClientes.findByApellidoP", query = "SELECT t FROM TblClientes t WHERE t.apellidoP = :apellidoP")
    , @NamedQuery(name = "TblClientes.findByApellidoM", query = "SELECT t FROM TblClientes t WHERE t.apellidoM = :apellidoM")
    , @NamedQuery(name = "TblClientes.findByTelefono", query = "SELECT t FROM TblClientes t WHERE t.telefono = :telefono")})
public class TblClientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellidoP")
    private String apellidoP;
    @Basic(optional = false)
    @Column(name = "apellidoM")
    private String apellidoM;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<TblFactura> tblFacturaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<TblReservaciones> tblReservacionesCollection;

    public TblClientes() {
    }

    public TblClientes(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public TblClientes(Integer idCliente, String nombre, String apellidoP, String apellidoM, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<TblFactura> getTblFacturaCollection() {
        return tblFacturaCollection;
    }

    public void setTblFacturaCollection(Collection<TblFactura> tblFacturaCollection) {
        this.tblFacturaCollection = tblFacturaCollection;
    }

    @XmlTransient
    public Collection<TblReservaciones> getTblReservacionesCollection() {
        return tblReservacionesCollection;
    }

    public void setTblReservacionesCollection(Collection<TblReservaciones> tblReservacionesCollection) {
        this.tblReservacionesCollection = tblReservacionesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblClientes)) {
            return false;
        }
        TblClientes other = (TblClientes) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblClientes[ idCliente=" + idCliente + " ]";
    }
    
}
