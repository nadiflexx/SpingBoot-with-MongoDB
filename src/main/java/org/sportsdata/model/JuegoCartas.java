package org.sportsdata.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Represents a Card Game to interpret it in a database.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */

@Setter
@Getter
@Data
@Document
public class JuegoCartas {

	/**
	 * -- GETTER --
	 *  Get's the JuegoCartas id.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoCartas id.
	 *
	 @return an Integer representing a JuegoCartas id.
	  * @param id an Integer representing the new JuegoCartas id.
	 */
	@Id
	private Integer id;
	/**
	 * -- GETTER --
	 *  Get's the JuegoCartas name.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoCartas name.
	 *
	 @return a String representing a JuegoCartas name.
	  * @param nombre a String representing the new JuegoCartas name.
	 */
	private String nombre;
	/**
	 * -- GETTER --
	 *  Get's the JuegoCartas editorial.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoCartas editorial.
	 *
	 @return a String representing a JuegoCartas editorial.
	  * @param editorial a String representing the new JuegoCartas editorial.
	 */
	private String editorial;
	/**
	 * -- GETTER --
	 *  Get's the JuegoCartas total cards.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoCartas total cards.
	 *
	 @return an Integer representing a JuegoCartas total cards.
	  * @param num_cartas an Integer representing the new JuegoCartas total cards.
	 */
	private int num_cartas;
	/**
	 * -- GETTER --
	 *  Get's the JuegoCartas season.
	 *
	 *
	 * -- SETTER --
	 *  Set's a JuegoCartas season.
	 *
	 @return an Integer representing a JuegoCartas season.
	  * @param temporada an Integer representing the new JuegoCartas season.
	 */
	private int temporada;

}