/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author LATITUD
 */
@Embeddable
public class TblIngreXProdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idProductos")
    private int idProductos;
    @Basic(optional = false)
    @Column(name = "idIngrediente")
    private int idIngrediente;

    public TblIngreXProdPK() {
    }

    public TblIngreXProdPK(int idProductos, int idIngrediente) {
        this.idProductos = idProductos;
        this.idIngrediente = idIngrediente;
    }

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProductos;
        hash += (int) idIngrediente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIngreXProdPK)) {
            return false;
        }
        TblIngreXProdPK other = (TblIngreXProdPK) object;
        if (this.idProductos != other.idProductos) {
            return false;
        }
        if (this.idIngrediente != other.idIngrediente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblIngreXProdPK[ idProductos=" + idProductos + ", idIngrediente=" + idIngrediente + " ]";
    }
    
}
