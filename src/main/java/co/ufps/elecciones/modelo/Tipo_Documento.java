package co.ufps.elecciones.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipodocumento")
public class Tipo_Documento implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	@Column
	private String descripcion;
	
	public Tipo_Documento() {
	}
	public Tipo_Documento(int id, String descripcion) {
		this.id=id;
		this.descripcion=descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Tipo_Documento [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
}
