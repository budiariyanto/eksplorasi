package org.ventus.chimpanzee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.ventus.chimpanzee.domain.BukuUjianEntity;

public interface BukuUjianService {
	
	public void save(BukuUjianEntity bukuUjianEntity);
	public void edit(BukuUjianEntity bukuUjianEntity);
	public void delete(BukuUjianEntity bukuUjianEntity);
	public List findAll();
	public BukuUjianEntity findByName(String name);
	
}
