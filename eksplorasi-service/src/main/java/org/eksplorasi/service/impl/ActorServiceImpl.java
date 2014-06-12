package org.eksplorasi.service.impl;

import java.util.List;

import org.eksplorasi.dao.ActorDao;
import org.eksplorasi.domain.Actor;
import org.eksplorasi.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Service
@Transactional
public class ActorServiceImpl implements ActorService{
	
	private final ActorDao actorDao;
	
	@Autowired
	public ActorServiceImpl(ActorDao actorDao) {
		Assert.notNull(actorDao);
		this.actorDao = actorDao;
	}
	
	public void save(Actor actor) {
		// TODO Auto-generated method stub
		actorDao.save(actor);
	}

	public void edit(Actor actor) {
		// TODO Auto-generated method stub
		actorDao.save(actor);
	}

	public void delete(Actor actor) {
		// TODO Auto-generated method stub
		actorDao.delete(actor);
	}

	public List<Actor> findAll() {
		// TODO Auto-generated method stub
		return actorDao.findAll();
	}

	public Actor findByFirstName(String name) {
		// TODO Auto-generated method stub
		return actorDao.findByFirstName(name);
	}

}
