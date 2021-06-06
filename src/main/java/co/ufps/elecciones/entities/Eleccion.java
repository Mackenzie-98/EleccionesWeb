package co.ufps.elecciones.entities;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Eleccion implements Serializable {
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="fechainicio")
	private Timestamp fechainicio;
	
	@Column(name ="fechafin")
	private Timestamp fechafin;
	
	@Column(name ="cargo")
	private String cargo;
	
	@OneToMany(mappedBy = "eleccion", cascade = CascadeType.ALL)
	private List<Estamento> estamentos=new ArrayList<>();
	
	@OneToMany(mappedBy = "eleccion", cascade = CascadeType.ALL)
	private List<Votante> votantes=new ArrayList<>();
	
	@OneToMany(mappedBy = "eleccion", cascade = CascadeType.ALL)
	private List<Candidato> candidatos=new ArrayList<>();
	
	public Eleccion() {
		
	}

	public Eleccion(int id, String nombre, Timestamp fechainicio, Timestamp fechafin, String cargo) {
		super();
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

	public Timestamp getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Timestamp fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Timestamp getFechafin() {
		return fechafin;
	}

	public void setFechafin(Timestamp fechafin) {
		this.fechafin = fechafin;
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

	@Override
	public String toString() {
		return "Eleccion [id=" + id + ", nombre=" + nombre + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin
				+ ", cargo=" + cargo + ", estamentos=" + estamentos + ", votantes=" + votantes + ", candidatos="
				+ candidatos + "]";
	}
	
	
	
}
