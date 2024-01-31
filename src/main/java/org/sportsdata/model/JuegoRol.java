package org.sportsdata.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
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
@Setter
@Getter
@Data
@Document
public class JuegoRol {

	/**
	 * -- GETTER --
	 *  Get's the JuegoRol id.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoRol id.
	 *
	 @return an Integer representing a JuegoRol id.
	  * @param id an Integer representing the new JuegoRol id.
	 */
	@Id
	private Integer id;
	/**
	 * -- GETTER --
	 *  Get's the JuegoRol name.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoRol name.
	 *
	 @return a String representing a JuegoRol name.
	  * @param nombre a String representing the new JuegoRol name.
	 */
	@Field("nombre")
	private String nombre;
	/**
	 * -- GETTER --
	 *  Get's the JuegoRol editorial.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoRol editorial.
	 *
	 @return a String representing a JuegoRol editorial.
	  * @param editorial a String representing the new JuegoRol editorial.
	 */
	@Field("editorial")
	private String editorial;
	/**
	 * -- GETTER --
	 *  Get's the JuegoRol level.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoRol level.
	 *
	 @return an Integer representing a JuegoRol level.
	  * @param nivel an Integer representing the new JuegoRol level.
	 */
	@Field("nivel")
	private int nivel;

}