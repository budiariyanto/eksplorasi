package org.eksplorasi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.eksplorasi.domain.Actor;

public interface ActorDao extends JpaRepository<Actor, Long> {
	
	@Query("select actor from Actor actor where actor.first_name = ?1")
	Actor findByFirstName(String firstName);
}
