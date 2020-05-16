package com.skilldistillery.motogp.data;

import java.util.List;

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

	@Override
	public Rider findByRiderNumber(Integer rn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rider findByFirstName(String fn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rider findByLastName(String ln) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rider> findByTeam(String team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rider> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rider addRider(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rider editRider(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rider deleteRider(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
