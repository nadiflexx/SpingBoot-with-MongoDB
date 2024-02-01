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
    @Id
    private Integer id;

    private String nombre;

    private String editorial;

    private int num_cartas;

    private int temporada;
}