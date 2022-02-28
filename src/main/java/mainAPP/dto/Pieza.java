package mainAPP.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pieza")
public class Pieza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;

	@OneToMany(mappedBy = "pieza", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Suministra> suministra;

	// CONSTRUCTORES
	public Pieza() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Pieza(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
		return "Pieza [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
}
