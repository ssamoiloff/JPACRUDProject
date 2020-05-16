package com.skilldistillery.motogp.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.motogp.entities.Rider;

@Service
@Transactional
public class RiderDAOImpl implements RiderDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Rider findById(int id) {
		return em.find(Rider.class, id);
	}

}
