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
	private String qPrefix = "SELECT r FROM Rider r ";
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Rider findById(int id) {
		return em.find(Rider.class, id);
	}

	@Override
	public List<Rider> findByRiderNumber(int rn) {
		String jpql = qPrefix + "WHERE r.riderNumber = :number";
		List<Rider> riders = em.createQuery(jpql, Rider.class)
				.setParameter("number", rn)
				.getResultList();
		return riders;
	}

	@Override
	public List<Rider> findByFirstName(String fn) {
		String jpql = qPrefix + "WHERE r.firstName LIKE '"+"%"+fn+"%'";
		List<Rider> riders = em.createQuery(jpql, Rider.class)
				.getResultList();
		return riders;
	}

	@Override
	public List<Rider> findByLastName(String ln) {
		String jpql = qPrefix + "WHERE r.firstName LIKE '"+"%"+ln+"%'";
		List<Rider> riders = em.createQuery(jpql, Rider.class)
				.getResultList();
		return riders;
	}
	
//	@Override
//	public List<Rider> findByTeam(String team) {
//		String jpql = qPrefix + "WHERE r.team LIKE '"+"%"+team+"%'";
//		List<Rider> riders = em.createQuery(jpql, Rider.class)
//				.getResultList();
//		return riders;
//	}

	@Override
	public List<Rider> findByKeyword(String kw) {
		String jpql = qPrefix + "WHERE r.firstName LIKE '"+"%"+kw+"%' OR "
				+ "r.lastName LIKE '"+"%"+kw+"%' OR r.team LIKE '"+"%"+kw+"%'";
		List<Rider> riders = em.createQuery(jpql, Rider.class)
				.getResultList();
		return riders;
	}

	@Override
	public List<Rider> findAll() {
		String jpql = qPrefix;
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
