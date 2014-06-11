package org.ventus.chimpanzee.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.ventus.chimpanzee.dao.BukuUjianDao;
import org.ventus.chimpanzee.domain.BukuUjianEntity;
import org.ventus.chimpanzee.service.BukuUjianService;

@Service
@Transactional
public class BukuUjianServiceImpl implements BukuUjianService{
	
	private final BukuUjianDao bukuUjianDao;
	
	@Autowired
	public BukuUjianServiceImpl(BukuUjianDao bukuUjianDao) {
		Assert.notNull(bukuUjianDao);
		this.bukuUjianDao = bukuUjianDao;
	}
	
	public void save(BukuUjianEntity bukuUjianEntity) {
		// TODO Auto-generated method stub
		bukuUjianDao.save(bukuUjianEntity);
	}

	public void edit(BukuUjianEntity bukuUjianEntity) {
		// TODO Auto-generated method stub
		bukuUjianDao.save(bukuUjianEntity);
	}

	public void delete(BukuUjianEntity bukuUjianEntity) {
		// TODO Auto-generated method stub
		bukuUjianDao.delete(bukuUjianEntity);
	}

	public List<BukuUjianEntity> findAll() {
		// TODO Auto-generated method stub
		return bukuUjianDao.findAll();
	}

	public BukuUjianEntity findByName(String name) {
		// TODO Auto-generated method stub
		return bukuUjianDao.findByName(name);
	}

}
