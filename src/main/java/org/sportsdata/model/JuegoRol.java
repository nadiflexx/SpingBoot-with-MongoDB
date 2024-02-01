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
    @Id
    private Integer id;

    @Field("nombre")
    private String nombre;

    @Field("editorial")
    private String editorial;

    @Field("nivel")
    private int nivel;

}