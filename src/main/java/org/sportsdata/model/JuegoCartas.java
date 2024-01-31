package org.sportsdata.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/**
 * Represents a Card Game to interpret it in a database.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Document(collection = "")
public class JuegoCartas {

	@Id
	private Integer id;
	@Field("nombre")
	private String nombre;
	@Field("editorial")
	private String editorial;
	@Field("num_cartas")
	private int num_cartas;
	@Field("temporada")
	private int temporada;

	/**
	 * Get's the JuegoCartas id.
	 * 
	 * @return an Integer representing a JuegoCartas id.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set's a JuegoCartas id.
	 * 
	 * @param id an Integer representing the new JuegoCartas id.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get's the JuegoCartas name.
	 * 
	 * @return a String representing a JuegoCartas name.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set's a JuegoCartas name.
	 * 
	 * @param nombre a String representing the new JuegoCartas name.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Get's the JuegoCartas editorial.
	 * 
	 * @return a String representing a JuegoCartas editorial.
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Set's a JuegoCartas editorial.
	 * 
	 * @param editorial a String representing the new JuegoCartas editorial.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Get's the JuegoCartas total cards.
	 * 
	 * @return an Integer representing a JuegoCartas total cards.
	 */
	public int getNum_cartas() {
		return num_cartas;
	}

	/**
	 * Set's a JuegoCartas total cards.
	 * 
	 * @param num_cartas an Integer representing the new JuegoCartas total cards.
	 */
	public void setNum_cartas(int num_cartas) {
		this.num_cartas = num_cartas;
	}

	/**
	 * Get's the JuegoCartas season.
	 * 
	 * @return an Integer representing a JuegoCartas season.
	 */
	public int getTemporada() {
		return temporada;
	}

	/**
	 * Set's a JuegoCartas season.
	 * 
	 * @param temporada an Integer representing the new JuegoCartas season.
	 */
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
}