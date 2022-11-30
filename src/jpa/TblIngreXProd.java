/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "tblIngreXProd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblIngreXProd.findAll", query = "SELECT t FROM TblIngreXProd t")
    , @NamedQuery(name = "TblIngreXProd.findByIdProductos", query = "SELECT t FROM TblIngreXProd t WHERE t.tblIngreXProdPK.idProductos = :idProductos")
    , @NamedQuery(name = "TblIngreXProd.findByCantidad", query = "SELECT t FROM TblIngreXProd t WHERE t.cantidad = :cantidad")
    , @NamedQuery(name = "TblIngreXProd.findByIdIngrediente", query = "SELECT t FROM TblIngreXProd t WHERE t.tblIngreXProdPK.idIngrediente = :idIngrediente")
    , @NamedQuery(name = "TblIngreXProd.findByMedida", query = "SELECT t FROM TblIngreXProd t WHERE t.medida = :medida")})
public class TblIngreXProd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TblIngreXProdPK tblIngreXProdPK;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @Column(name = "medida")
    private String medida;
    @JoinColumn(name = "idIngrediente", referencedColumnName = "idIngrediente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblIngredientes tblIngredientes;
    @JoinColumn(name = "idProductos", referencedColumnName = "idProductos", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TblProductos tblProductos;

    public TblIngreXProd() {
    }

    public TblIngreXProd(TblIngreXProdPK tblIngreXProdPK) {
        this.tblIngreXProdPK = tblIngreXProdPK;
    }

    public TblIngreXProd(TblIngreXProdPK tblIngreXProdPK, double cantidad, String medida) {
        this.tblIngreXProdPK = tblIngreXProdPK;
        this.cantidad = cantidad;
        this.medida = medida;
    }

    public TblIngreXProd(int idProductos, int idIngrediente) {
        this.tblIngreXProdPK = new TblIngreXProdPK(idProductos, idIngrediente);
    }

    public TblIngreXProdPK getTblIngreXProdPK() {
        return tblIngreXProdPK;
    }

    public void setTblIngreXProdPK(TblIngreXProdPK tblIngreXProdPK) {
        this.tblIngreXProdPK = tblIngreXProdPK;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public TblIngredientes getTblIngredientes() {
        return tblIngredientes;
    }

    public void setTblIngredientes(TblIngredientes tblIngredientes) {
        this.tblIngredientes = tblIngredientes;
    }

    public TblProductos getTblProductos() {
        return tblProductos;
    }

    public void setTblProductos(TblProductos tblProductos) {
        this.tblProductos = tblProductos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tblIngreXProdPK != null ? tblIngreXProdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIngreXProd)) {
            return false;
        }
        TblIngreXProd other = (TblIngreXProd) object;
        if ((this.tblIngreXProdPK == null && other.tblIngreXProdPK != null) || (this.tblIngreXProdPK != null && !this.tblIngreXProdPK.equals(other.tblIngreXProdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblIngreXProd[ tblIngreXProdPK=" + tblIngreXProdPK + " ]";
    }
    
}
