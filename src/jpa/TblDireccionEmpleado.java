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
@Table(name = "tblDireccionEmpleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblDireccionEmpleado.findAll", query = "SELECT t FROM TblDireccionEmpleado t")
    , @NamedQuery(name = "TblDireccionEmpleado.findByIdDireccion", query = "SELECT t FROM TblDireccionEmpleado t WHERE t.idDireccion = :idDireccion")
    , @NamedQuery(name = "TblDireccionEmpleado.findByCalle", query = "SELECT t FROM TblDireccionEmpleado t WHERE t.calle = :calle")
    , @NamedQuery(name = "TblDireccionEmpleado.findByNumero", query = "SELECT t FROM TblDireccionEmpleado t WHERE t.numero = :numero")
    , @NamedQuery(name = "TblDireccionEmpleado.findByColonia", query = "SELECT t FROM TblDireccionEmpleado t WHERE t.colonia = :colonia")
    , @NamedQuery(name = "TblDireccionEmpleado.findByCodPost", query = "SELECT t FROM TblDireccionEmpleado t WHERE t.codPost = :codPost")
    , @NamedQuery(name = "TblDireccionEmpleado.findByCiudad", query = "SELECT t FROM TblDireccionEmpleado t WHERE t.ciudad = :ciudad")})
public class TblDireccionEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDireccion")
    private Integer idDireccion;
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
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false)
    private TblEmpleado idEmpleado;

    public TblDireccionEmpleado() {
    }

    public TblDireccionEmpleado(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public TblDireccionEmpleado(Integer idDireccion, String calle, int numero, String colonia, String codPost, String ciudad) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codPost = codPost;
        this.ciudad = ciudad;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
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

    public TblEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(TblEmpleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccion != null ? idDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblDireccionEmpleado)) {
            return false;
        }
        TblDireccionEmpleado other = (TblDireccionEmpleado) object;
        if ((this.idDireccion == null && other.idDireccion != null) || (this.idDireccion != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblDireccionEmpleado[ idDireccion=" + idDireccion + " ]";
    }
    
}
