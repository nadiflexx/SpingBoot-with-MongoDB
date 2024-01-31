package org.sportsdata.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Represents Merchandising to interpret it in a database.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Document(collection = "")
public class Merchandising {

	@Id
	private Integer id;
	@Field("nombre")
	private String nombre;
	@Field("tipo")
	private String tipo;
	@Field("descripcion")
	private String descripcion;

	/**
	 * Get's the Merchandising id.
	 * 
	 * @return an Integer representing a Merchandising id.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set's a Merchandising id.
	 * 
	 * @param id an Integer representing the new Merchandising id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get's the Merchandising name.
	 * 
	 * @return a String representing a Merchandising name.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set's a Merchandising name.
	 * 
	 * @param nombre a String representing the new Merchandising name.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Get's the Merchandising type.
	 * 
	 * @return a String representing a Merchandising type.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Set's a Merchandising type.
	 * 
	 * @param tipo a String representing the new Merchandising type.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Get's the Merchandising description.
	 * 
	 * @return a String representing a Merchandising description.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Set's a Merchandising description.
	 * 
	 * @param descripcion a String representing the new Merchandising description.
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Get's the Merchandising total players.
	 * 
	 * @return an Integer representing a Merchandising total players.
	 */
}