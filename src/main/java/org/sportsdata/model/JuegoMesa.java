package org.sportsdata.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Represents a Table Game to interpret it in a database.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@Setter
@Getter
@Data
@Document
public class JuegoMesa {

	/**
	 * -- GETTER --
	 *  Get's the JuegoMesa id.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoMesa id.
	 *
	 @return an Integer representing a JuegoMesa id.
	  * @param id an Integer representing the new JuegoMesa id.
	 */
	@Id
	private Integer id;
	/**
	 * -- GETTER --
	 *  Get's the JuegoMesa name.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoMesa name.
	 *
	 @return a String representing a JuegoMesa name.
	  * @param nombre a String representing the new JuegoMesa name.
	 */
	@Field("nombre")
	private String nombre;
	/**
	 * -- GETTER --
	 *  Get's the JuegoMesa editorial.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoMesa editorial.
	 *
	 @return a String representing a JuegoMesa editorial.
	  * @param editorial a String representing the new JuegoMesa editorial.
	 */
	@Field("editorial")
	private String editorial;
	/**
	 * -- GETTER --
	 *  Get's the JuegoMesa description.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoMesa description.
	 *
	 @return a String representing a JuegoMesa description.
	  * @param descripcion a String representing the new JuegoMesa description.
	 */
	@Field("descripcion")
	private String descripcion;
	/**
	 * -- GETTER --
	 *  Get's the JuegoMesa total players.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoMesa total players.
	 *
	 @return an Integer representing a JuegoMesa total players.
	  * @param num_jugadores an Integer representing the new JuegoMesa total players.
	 */
	@Field("num_jugadores")
	private int num_jugadores;
	/**
	 * -- GETTER --
	 *  Get's the JuegoMesa type.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoMesa type.
	 *
	 @return a String representing a JuegoMesa type.
	  * @param tipo a String representing the new JuegoMesa type.
	 */
	@Field("tipo")
	private String tipo;

}