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
	public Rider findByRiderNumber(int rn) {
		String jpql = "SELECT r FROM Rider r WHERE r.riderNumber = :number";
		Rider rider = em.createQuery(jpql, Rider.class).setParameter("number", rn)
						.getSingleResult();
		return rider;
	}

	@Override
	public Rider findByFirstName(String fn) {
		String jpql = "SELECT r FROM Rider r WHERE r.firstName LIKE '%:name%'";
		Rider rider = em.createQuery(jpql, Rider.class).setParameter("name", fn)
				.getSingleResult();
		return rider;
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
	public List<Rider> findByKeyword(String keyword) {
		// TODO SEARCH BY FIRST NAME, LAST NAME, TEAM
		return null;
	}

	@Override
	public List<Rider> findAll() {
		String jpql = "SELECT r from Rider r";
		List<Rider> riders = em.createQuery(jpql, Rider.class).getResultList();
		return riders;
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
