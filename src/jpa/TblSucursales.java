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
@Table(name = "tblSucursales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSucursales.findAll", query = "SELECT t FROM TblSucursales t")
    , @NamedQuery(name = "TblSucursales.findByIdSucursal", query = "SELECT t FROM TblSucursales t WHERE t.idSucursal = :idSucursal")
    , @NamedQuery(name = "TblSucursales.findByNombre", query = "SELECT t FROM TblSucursales t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TblSucursales.findByCalle", query = "SELECT t FROM TblSucursales t WHERE t.calle = :calle")
    , @NamedQuery(name = "TblSucursales.findByNumero", query = "SELECT t FROM TblSucursales t WHERE t.numero = :numero")
    , @NamedQuery(name = "TblSucursales.findByColonia", query = "SELECT t FROM TblSucursales t WHERE t.colonia = :colonia")
    , @NamedQuery(name = "TblSucursales.findByCodPost", query = "SELECT t FROM TblSucursales t WHERE t.codPost = :codPost")
    , @NamedQuery(name = "TblSucursales.findByCiudad", query = "SELECT t FROM TblSucursales t WHERE t.ciudad = :ciudad")
    , @NamedQuery(name = "TblSucursales.findByNumControl", query = "SELECT t FROM TblSucursales t WHERE t.numControl = :numControl")
    , @NamedQuery(name = "TblSucursales.findByTelefono", query = "SELECT t FROM TblSucursales t WHERE t.telefono = :telefono")})
public class TblSucursales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSucursal")
    private Integer idSucursal;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "calle")
    private String calle;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "colonia")
    private String colonia;
    @Basic(optional = false)
    @Column(name = "codPost")
    private String codPost;
    @Basic(optional = false)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @Column(name = "numControl")
    private String numControl;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<TblIngreXPedido> tblIngreXPedidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<TblInventario> tblInventarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSucursal")
    private Collection<TblEmpleado> tblEmpleadoCollection;

    public TblSucursales() {
    }

    public TblSucursales(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public TblSucursales(Integer idSucursal, String nombre, String calle, int numero, String colonia, String codPost, String ciudad, String numControl, String telefono) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codPost = codPost;
        this.ciudad = ciudad;
        this.numControl = numControl;
        this.telefono = telefono;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodPost() {
        return codPost;
    }

    public void setCodPost(String codPost) {
        this.codPost = codPost;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<TblIngreXPedido> getTblIngreXPedidoCollection() {
        return tblIngreXPedidoCollection;
    }

    public void setTblIngreXPedidoCollection(Collection<TblIngreXPedido> tblIngreXPedidoCollection) {
        this.tblIngreXPedidoCollection = tblIngreXPedidoCollection;
    }

    @XmlTransient
    public Collection<TblInventario> getTblInventarioCollection() {
        return tblInventarioCollection;
    }

    public void setTblInventarioCollection(Collection<TblInventario> tblInventarioCollection) {
        this.tblInventarioCollection = tblInventarioCollection;
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
        hash += (idSucursal != null ? idSucursal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSucursales)) {
            return false;
        }
        TblSucursales other = (TblSucursales) object;
        if ((this.idSucursal == null && other.idSucursal != null) || (this.idSucursal != null && !this.idSucursal.equals(other.idSucursal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblSucursales[ idSucursal=" + idSucursal + " ]";
    }
    
}
