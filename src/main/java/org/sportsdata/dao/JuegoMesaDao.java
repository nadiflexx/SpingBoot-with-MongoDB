package org.sportsdata.dao;

import org.sportsdata.model.*;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Represents a Table Game interface to manipulate database data (CRUD) with SQL
 * functions integrated in JpaRepository.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
public interface JuegoMesaDao extends MongoRepository<JuegoMesa, Integer> {
	@Transactional
	@Query("{'_id' : ?2} {'$set': {'descripcion' : ?0, 'tipo' : ?1}}")
	void updateJuegoMesa(String descripcion, String tipo, Integer id);
}
