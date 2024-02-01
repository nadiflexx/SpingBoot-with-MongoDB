package org.sportsdata.dao;

import org.sportsdata.model.JuegoCartas;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

/**
 * Represents a Card Game interface to manipulate database data (CRUD) with SQL
 * functions integrated in JpaRepository.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
public interface JuegoCartasDao extends MongoRepository<JuegoCartas, Integer> {
    /**
     * Selects Card Games that have the same season.
     *
     * @param temporada Integer representing the season to search.
     * @return an ArrayList of all the Card Games with the same season.
     */

    @Query("{ 'temporada' : ?0 }")
    ArrayList<JuegoCartas> findJuegoCartasByTemporada(@Param("temporada") int temporada);
}