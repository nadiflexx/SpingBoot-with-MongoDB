package org.sportsdata.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
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
@Setter
@Getter
@Data
@Document
public class Merchandising {

	/**
	 * -- GETTER --
	 *  Get's the Merchandising id.
	 *
	 *
	 * -- SETTER --
	 *  Set's a Merchandising id.
	 *
	 @return an Integer representing a Merchandising id.
	  * @param id an Integer representing the new Merchandising id.
	 */
	@Id
	private Integer id;
	/**
	 * -- GETTER --
	 *  Get's the Merchandising name.
	 *
	 *
	 * -- SETTER --
	 *  Set's a Merchandising name.
	 *
	 @return a String representing a Merchandising name.
	  * @param nombre a String representing the new Merchandising name.
	 */
	@Field("nombre")
	private String nombre;
	/**
	 * -- GETTER --
	 *  Get's the Merchandising type.
	 *
	 *
	 * -- SETTER --
	 *  Set's a Merchandising type.
	 *
	 @return a String representing a Merchandising type.
	  * @param tipo a String representing the new Merchandising type.
	 */
	@Field("tipo")
	private String tipo;
	/**
	 * -- GETTER --
	 *  Get's the Merchandising description.
	 *
	 *
	 * -- SETTER --
	 *  Set's a Merchandising description.
	 *
	 @return a String representing a Merchandising description.
	  * @param descripcion a String representing the new Merchandising description.
	 */
	@Field("descripcion")
	private String descripcion;

	/**
	 * Get's the Merchandising total players.
	 * 
	 * @return an Integer representing a Merchandising total players.
	 */
}