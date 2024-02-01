package org.sportsdata.dao;

import org.sportsdata.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Represents a Table Game interface to manipulate database data (CRUD) with SQL
 * functions integrated in JpaRepository.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
public interface JuegoMesaDao extends MongoRepository<JuegoMesa, Integer> {
}

