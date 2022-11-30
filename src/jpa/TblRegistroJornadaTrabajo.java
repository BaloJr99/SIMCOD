/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LATITUD
 */
@Entity
@Table(name = "tblRegistroJornadaTrabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblRegistroJornadaTrabajo.findAll", query = "SELECT t FROM TblRegistroJornadaTrabajo t")
    , @NamedQuery(name = "TblRegistroJornadaTrabajo.findByIdHorario", query = "SELECT t FROM TblRegistroJornadaTrabajo t WHERE t.idHorario = :idHorario")
    , @NamedQuery(name = "TblRegistroJornadaTrabajo.findByHoraEntradaMarcada", query = "SELECT t FROM TblRegistroJornadaTrabajo t WHERE t.horaEntradaMarcada = :horaEntradaMarcada")
    , @NamedQuery(name = "TblRegistroJornadaTrabajo.findByHoraSalidaMarcada", query = "SELECT t FROM TblRegistroJornadaTrabajo t WHERE t.horaSalidaMarcada = :horaSalidaMarcada")})
public class TblRegistroJornadaTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idHorario")
    private String idHorario;
    @Basic(optional = false)
    @Column(name = "horaEntradaMarcada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaEntradaMarcada;
    @Basic(optional = false)
    @Column(name = "horaSalidaMarcada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSalidaMarcada;
    @JoinColumn(name = "idEmpleado", referencedColumnName = "idEmpleado")
    @ManyToOne(optional = false)
    private TblEmpleado idEmpleado;

    public TblRegistroJornadaTrabajo() {
    }

    public TblRegistroJornadaTrabajo(String idHorario) {
        this.idHorario = idHorario;
    }

    public TblRegistroJornadaTrabajo(String idHorario, Date horaEntradaMarcada, Date horaSalidaMarcada) {
        this.idHorario = idHorario;
        this.horaEntradaMarcada = horaEntradaMarcada;
        this.horaSalidaMarcada = horaSalidaMarcada;
    }

    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public Date getHoraEntradaMarcada() {
        return horaEntradaMarcada;
    }

    public void setHoraEntradaMarcada(Date horaEntradaMarcada) {
        this.horaEntradaMarcada = horaEntradaMarcada;
    }

    public Date getHoraSalidaMarcada() {
        return horaSalidaMarcada;
    }

    public void setHoraSalidaMarcada(Date horaSalidaMarcada) {
        this.horaSalidaMarcada = horaSalidaMarcada;
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
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRegistroJornadaTrabajo)) {
            return false;
        }
        TblRegistroJornadaTrabajo other = (TblRegistroJornadaTrabajo) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.TblRegistroJornadaTrabajo[ idHorario=" + idHorario + " ]";
    }
    
}
