package co.ufps.elecciones.entities;

import java.io.Serializable;

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
@Table(name = "votante")
public class Votante implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "email")
	private String email;

	@Column(name = "documento")
	private String documento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipodocumento")
	private Tipo_Documento tipodocumento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eleccion")
	private Eleccion eleccion;
	
	public Votante() {
		
	}

	public Votante(int id, String nombre, String email, String documento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.documento = documento;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Tipo_Documento getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(Tipo_Documento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public Eleccion getEleccion() {
		return eleccion;
	}

	public void setEleccion(Eleccion eleccion) {
		this.eleccion = eleccion;
	}

	@Override
	public String toString() {
		return "Votante [id=" + id + ", nombre=" + nombre + ", email=" + email + ", documento=" + documento
				+ ", tipodocumento=" + tipodocumento.getId() + ", eleccion=" + eleccion.getId() + "]";
	}
	
	
	
}
