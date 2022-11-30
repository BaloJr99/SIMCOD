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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblBancos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblBancos.findAll", query = "SELECT t FROM TblBancos t")
    , @NamedQuery(name = "TblBancos.findByIdBanco", query = "SELECT t FROM TblBancos t WHERE t.idBanco = :idBanco")
    , @NamedQuery(name = "TblBancos.findByNombreBanco", query = "SELECT t FROM TblBancos t WHERE t.nombreBanco = :nombreBanco")})
public class TblBancos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBanco")
    private Integer idBanco;
    @Basic(optional = false)
    @Column(name = "nombreBanco")
    private String nombreBanco;

    public TblBancos() {
    }

    public TblBancos(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public TblBancos(Integer idBanco, String nombreBanco) {
        this.idBanco = idBanco;
        this.nombreBanco = nombreBanco;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBanco != null ? idBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblBancos)) {
            return false;
        }
        TblBancos other = (TblBancos) object;
        if ((this.idBanco == null && other.idBanco != null) || (this.idBanco != null && !this.idBanco.equals(other.idBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblBancos[ idBanco=" + idBanco + " ]";
    }
    
}
