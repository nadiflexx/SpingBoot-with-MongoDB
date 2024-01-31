package org.sportsdata.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Represents a Rol Game to interpret it in a database.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Document(collection = "")
public class JuegoRol {

	@Id
	private Integer id;
	@Field("nombre")
	private String nombre;
	@Field("editorial")
	private String editorial;
	@Field("nivel")
	private int nivel;

	/**
	 * Get's the JuegoRol id.
	 * 
	 * @return an Integer representing a JuegoRol id.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set's a JuegoRol id.
	 * 
	 * @param id an Integer representing the new JuegoRol id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get's the JuegoRol name.
	 * 
	 * @return a String representing a JuegoRol name.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set's a JuegoRol name.
	 * 
	 * @param nombre a String representing the new JuegoRol name.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Get's the JuegoRol editorial.
	 * 
	 * @return a String representing a JuegoRol editorial.
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Set's a JuegoRol editorial.
	 * 
	 * @param editorial a String representing the new JuegoRol editorial.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Get's the JuegoRol level.
	 * 
	 * @return an Integer representing a JuegoRol level.
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * Set's a JuegoRol level.
	 * 
	 * @param nivel an Integer representing the new JuegoRol level.
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}