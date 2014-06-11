package org.ventus.chimpanzee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.ventus.chimpanzee.domain.BukuUjianEntity;

public interface BukuUjianDao extends JpaRepository<BukuUjianEntity, Long> {
	
	@Query("select bu from BukuUjianEntity bu where bu.nama = ?1")
	BukuUjianEntity findByName(String name);
}
