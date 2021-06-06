package co.ufps.elecciones.entities;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "voto")
public class Voto implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="id") 
	private int id;
	
	@Column(name = "fechacreacion")
	private Timestamp fechacreacion;
	
	@Column(name = "fechavoto")
	private Timestamp fechavoto;
	
	@Column(name = "uuid")
	private String uuid;
	
	@Column(name = "enlace")
	private String enlace;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estamento")
	private Estamento estamento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "candidato")
	private Candidato candidato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "votante")
	private Votante votante;
	
	public Voto() {
		
	}

	public Voto(int id, Timestamp fechacreacion, Timestamp fechavoto, String uuid, String enlace) {
		super();
		this.id = id;
		this.fechacreacion = fechacreacion;
		this.fechavoto = fechavoto;
		this.uuid = uuid;
		this.enlace = enlace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Timestamp fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Timestamp getFechavoto() {
		return fechavoto;
	}

	public void setFechavoto(Timestamp fechavoto) {
		this.fechavoto = fechavoto;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public Estamento getEstamento() {
		return estamento;
	}

	public void setEstamento(Estamento estamento) {
		this.estamento = estamento;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public Votante getVotante() {
		return votante;
	}

	public void setVotante(Votante votante) {
		this.votante = votante;
	}

	@Override
	public String toString() {
		return "Voto [id=" + id + ", fechacreacion=" + fechacreacion + ", fechavoto=" + fechavoto + ", uuid=" + uuid
				+ ", enlace=" + enlace + ", estamento=" + estamento.getId() + ", candidato=" + candidato + ", votante="
				+ votante.getId() + "]";
	}
	
	

}
