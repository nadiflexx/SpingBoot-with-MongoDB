package org.sportsdata.dao;

import org.sportsdata.model.*;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Represents a Rol Game interface to manipulate database data (CRUD) with SQL
 * functions integrated in JpaRepository.
 * 
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
public interface JuegoRolDao extends MongoRepository<JuegoRol, Integer> {
	/**
	 * Update the level of a Rol Game by its id.
	 * 
	 * @param nivel a String representing the new level.
	 * @param id    an Integer representing the id of the Rol Game.
	 */
	@Transactional
	@Query("{'_id' : ?1}, {'$set': {'nivel' : ?0}}")
	void updateJuegoRol(int nivel, Integer id);

}