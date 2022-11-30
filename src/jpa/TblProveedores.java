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
@Table(name = "tblProveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblProveedores.findAll", query = "SELECT t FROM TblProveedores t")
    , @NamedQuery(name = "TblProveedores.findByIdProveedor", query = "SELECT t FROM TblProveedores t WHERE t.idProveedor = :idProveedor")
    , @NamedQuery(name = "TblProveedores.findByProveedor", query = "SELECT t FROM TblProveedores t WHERE t.proveedor = :proveedor")
    , @NamedQuery(name = "TblProveedores.findByNombreContacto", query = "SELECT t FROM TblProveedores t WHERE t.nombreContacto = :nombreContacto")
    , @NamedQuery(name = "TblProveedores.findByApellidoPContacto", query = "SELECT t FROM TblProveedores t WHERE t.apellidoPContacto = :apellidoPContacto")
    , @NamedQuery(name = "TblProveedores.findByApellidoMContacto", query = "SELECT t FROM TblProveedores t WHERE t.apellidoMContacto = :apellidoMContacto")
    , @NamedQuery(name = "TblProveedores.findByTelefono", query = "SELECT t FROM TblProveedores t WHERE t.telefono = :telefono")
    , @NamedQuery(name = "TblProveedores.findByDireccionWeb", query = "SELECT t FROM TblProveedores t WHERE t.direccionWeb = :direccionWeb")})
public class TblProveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProveedor")
    private Integer idProveedor;
    @Basic(optional = false)
    @Column(name = "proveedor")
    private String proveedor;
    @Basic(optional = false)
    @Column(name = "nombreContacto")
    private String nombreContacto;
    @Basic(optional = false)
    @Column(name = "apellidoPContacto")
    private String apellidoPContacto;
    @Basic(optional = false)
    @Column(name = "apellidoMContacto")
    private String apellidoMContacto;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "direccionWeb")
    private String direccionWeb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProveedor")
    private Collection<TblIngredientes> tblIngredientesCollection;

    public TblProveedores() {
    }

    public TblProveedores(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public TblProveedores(Integer idProveedor, String proveedor, String nombreContacto, String apellidoPContacto, String apellidoMContacto, String telefono) {
        this.idProveedor = idProveedor;
        this.proveedor = proveedor;
        this.nombreContacto = nombreContacto;
        this.apellidoPContacto = apellidoPContacto;
        this.apellidoMContacto = apellidoMContacto;
        this.telefono = telefono;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getApellidoPContacto() {
        return apellidoPContacto;
    }

    public void setApellidoPContacto(String apellidoPContacto) {
        this.apellidoPContacto = apellidoPContacto;
    }

    public String getApellidoMContacto() {
        return apellidoMContacto;
    }

    public void setApellidoMContacto(String apellidoMContacto) {
        this.apellidoMContacto = apellidoMContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        this.direccionWeb = direccionWeb;
    }

    @XmlTransient
    public Collection<TblIngredientes> getTblIngredientesCollection() {
        return tblIngredientesCollection;
    }

    public void setTblIngredientesCollection(Collection<TblIngredientes> tblIngredientesCollection) {
        this.tblIngredientesCollection = tblIngredientesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedor != null ? idProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProveedores)) {
            return false;
        }
        TblProveedores other = (TblProveedores) object;
        if ((this.idProveedor == null && other.idProveedor != null) || (this.idProveedor != null && !this.idProveedor.equals(other.idProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblProveedores[ idProveedor=" + idProveedor + " ]";
    }
    
}
