package mainAPP.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "proveedor")
public class Proveedor {

	@Id
	private Character id;
	private String nombre;

	@OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Suministra> suministra;

	// CONSTRUCTORES
	public Proveedor() {
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Proveedor(Character id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS
	public Character getId() {
		return id;
	}

	public void setId(Character id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	public void setCaja(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	// METODO TO STRING
	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + "]";
	}
}
