package org.sportsdata.dao;

import org.sportsdata.model.*;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

/**
 * Represents a Merchandising interface to manipulate database data (CRUD) with
 * SQL functions integrated in JpaRepository.
 * 
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
public interface MerchandisingDao extends MongoRepository<Merchandising, Integer> {
	/**
	 * Selects Merchandising that are of the same type.
	 * 
	 * @param tipo String representing the type to search.
	 * @return an ArrayList of all Merchandising that are of the same type.
	 */
	@Query("{'tipo' : ?0}")
	ArrayList<Merchandising> findMerchandisingByTipo(String tipo);
}