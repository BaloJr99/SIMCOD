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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tblEmpleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpleado.findAll", query = "SELECT t FROM TblEmpleado t")
    , @NamedQuery(name = "TblEmpleado.findByIdEmpleado", query = "SELECT t FROM TblEmpleado t WHERE t.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "TblEmpleado.findByNombres", query = "SELECT t FROM TblEmpleado t WHERE t.nombres = :nombres")
    , @NamedQuery(name = "TblEmpleado.findByApellidoP", query = "SELECT t FROM TblEmpleado t WHERE t.apellidoP = :apellidoP")
    , @NamedQuery(name = "TblEmpleado.findByApellidoM", query = "SELECT t FROM TblEmpleado t WHERE t.apellidoM = :apellidoM")
    , @NamedQuery(name = "TblEmpleado.findBySalario", query = "SELECT t FROM TblEmpleado t WHERE t.salario = :salario")
    , @NamedQuery(name = "TblEmpleado.findByCurp", query = "SELECT t FROM TblEmpleado t WHERE t.curp = :curp")
    , @NamedQuery(name = "TblEmpleado.findByTiempoExperiencia", query = "SELECT t FROM TblEmpleado t WHERE t.tiempoExperiencia = :tiempoExperiencia")
    , @NamedQuery(name = "TblEmpleado.findByCorreoEmpresarial", query = "SELECT t FROM TblEmpleado t WHERE t.correoEmpresarial = :correoEmpresarial")})
public class TblEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idEmpleado")
    private Integer idEmpleado;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "apellidoP")
    private String apellidoP;
    @Basic(optional = false)
    @Column(name = "apellidoM")
    private String apellidoM;
    @Basic(optional = false)
    @Column(name = "salario")
    private long salario;
    @Basic(optional = false)
    @Column(name = "CURP")
    private String curp;
    @Basic(optional = false)
    @Column(name = "tiempoExperiencia")
    private int tiempoExperiencia;
    @Basic(optional = false)
    @Column(name = "correoEmpresarial")
    private String correoEmpresarial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private Collection<TblRegistroJornadaTrabajo> tblRegistroJornadaTrabajoCollection;
    @OneToMany(mappedBy = "idEmpleado")
    private Collection<TblLogin> tblLoginCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private Collection<TblTelefonoEmpleado> tblTelefonoEmpleadoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private Collection<TblDireccionEmpleado> tblDireccionEmpleadoCollection;
    @JoinColumn(name = "idCargo", referencedColumnName = "idCargo")
    @ManyToOne(optional = false)
    private TblCargo idCargo;
    @JoinColumn(name = "idSucursal", referencedColumnName = "idSucursal")
    @ManyToOne(optional = false)
    private TblSucursales idSucursal;

    public TblEmpleado() {
    }

    public TblEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public TblEmpleado(Integer idEmpleado, String nombres, String apellidoP, String apellidoM, long salario, String curp, int tiempoExperiencia, String correoEmpresarial) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.salario = salario;
        this.curp = curp;
        this.tiempoExperiencia = tiempoExperiencia;
        this.correoEmpresarial = correoEmpresarial;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public String getCorreoEmpresarial() {
        return correoEmpresarial;
    }

    public void setCorreoEmpresarial(String correoEmpresarial) {
        this.correoEmpresarial = correoEmpresarial;
    }

    @XmlTransient
    public Collection<TblRegistroJornadaTrabajo> getTblRegistroJornadaTrabajoCollection() {
        return tblRegistroJornadaTrabajoCollection;
    }

    public void setTblRegistroJornadaTrabajoCollection(Collection<TblRegistroJornadaTrabajo> tblRegistroJornadaTrabajoCollection) {
        this.tblRegistroJornadaTrabajoCollection = tblRegistroJornadaTrabajoCollection;
    }

    @XmlTransient
    public Collection<TblLogin> getTblLoginCollection() {
        return tblLoginCollection;
    }

    public void setTblLoginCollection(Collection<TblLogin> tblLoginCollection) {
        this.tblLoginCollection = tblLoginCollection;
    }

    @XmlTransient
    public Collection<TblTelefonoEmpleado> getTblTelefonoEmpleadoCollection() {
        return tblTelefonoEmpleadoCollection;
    }

    public void setTblTelefonoEmpleadoCollection(Collection<TblTelefonoEmpleado> tblTelefonoEmpleadoCollection) {
        this.tblTelefonoEmpleadoCollection = tblTelefonoEmpleadoCollection;
    }

    @XmlTransient
    public Collection<TblDireccionEmpleado> getTblDireccionEmpleadoCollection() {
        return tblDireccionEmpleadoCollection;
    }

    public void setTblDireccionEmpleadoCollection(Collection<TblDireccionEmpleado> tblDireccionEmpleadoCollection) {
        this.tblDireccionEmpleadoCollection = tblDireccionEmpleadoCollection;
    }

    public TblCargo getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(TblCargo idCargo) {
        this.idCargo = idCargo;
    }

    public TblSucursales getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(TblSucursales idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpleado)) {
            return false;
        }
        TblEmpleado other = (TblEmpleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblEmpleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
