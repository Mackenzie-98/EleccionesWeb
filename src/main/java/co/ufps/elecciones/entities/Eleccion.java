package co.ufps.elecciones.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "eleccion")
public class Eleccion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name ="id",nullable = false)
	private int id;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="fechainicio")
	private LocalDateTime fechainicio;
	
	@Column(name ="fechafin")
	private LocalDateTime fechafin;
	
	@Column(name ="cargo")
	private String cargo;
	
	@OneToMany(mappedBy = "eleccion")
	private List<Estamento> estamentos=new ArrayList<>();
	
	@OneToMany(mappedBy = "eleccion")
	private List<Votante> votantes=new ArrayList<>();
	
	@OneToMany(mappedBy = "eleccion")
	private List<Candidato> candidatos=new ArrayList<>();
	
	public Eleccion() {
		
	}
	
	public Eleccion(int id, String nombre, LocalDateTime fechainicio, LocalDateTime fechafin, String cargo) {
		this.id = id;
		this.nombre = nombre;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<Estamento> getEstamentos() {
		return estamentos;
	}

	public void setEstamentos(List<Estamento> estamentos) {
		this.estamentos = estamentos;
	}

	public List<Votante> getVotantes() {
		return votantes;
	}

	public void setVotantes(List<Votante> votantes) {
		this.votantes = votantes;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public LocalDateTime getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(LocalDateTime fechainicio) {
		this.fechainicio = fechainicio;
	}

	public LocalDateTime getFechafin() {
		return fechafin;
	}

	public void setFechafin(LocalDateTime fechafin) {
		this.fechafin = fechafin;
	}

	@Override
	public String toString() {
		return "Eleccion [id=" + id + ", nombre=" + nombre + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin
				+ ", cargo=" + cargo +"]";
	}
	
	
	
}
