package co.ufps.elecciones.modelo;

import java.io.Serializable;
import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Eleccion implements Serializable {
	@Id
	private int id;
	@Column
	private String nombre;
	@Column
	private Timestamp fechainicio;
	@Column
	private Timestamp fechafin;
	@Column
	private String cargo;
	
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

	@Override
	public String toString() {
		return "Eleccion [id=" + id + ", nombre=" + nombre + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin
				+ ", cargo=" + cargo + "]";
	}
	
}
