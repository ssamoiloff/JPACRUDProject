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
	private String selPrefix = "SELECT r FROM Rider r ";
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Rider findById(int id) {
		return em.find(Rider.class, id);
	}

	@Override
	public List<Rider> findByRiderNumber(int rn) {
		String jpql = selPrefix + "WHERE r.riderNumber = :number";
		List<Rider> riders = em.createQuery(jpql, Rider.class)
				.setParameter("number", rn)
				.getResultList();
		return riders;
	}

	@Override
	public List<Rider> findByFirstName(String fn) {
		String jpql = selPrefix + "WHERE r.firstName LIKE '"+"%"+fn+"%'";
		List<Rider> riders = em.createQuery(jpql, Rider.class)
				.getResultList();
		return riders;
	}

	@Override
	public List<Rider> findByLastName(String ln) {
		String jpql = selPrefix + "WHERE r.firstName LIKE '"+"%"+ln+"%'";
		List<Rider> riders = em.createQuery(jpql, Rider.class)
				.getResultList();
		return riders;
	}
	

	@Override
	public List<Rider> findByKeyword(String kw) {
		String jpql = selPrefix + "WHERE r.firstName LIKE '"+"%"+kw+"%' OR "
				+ "r.lastName LIKE '"+"%"+kw+"%' OR r.team LIKE '"+"%"+kw+"%'";
		List<Rider> riders = em.createQuery(jpql, Rider.class)
				.getResultList();
		return riders;
	}

	@Override
	public List<Rider> findAll() {
		String jpql = selPrefix;
		List<Rider> riders = em.createQuery(jpql, Rider.class).getResultList();
		return riders;
	}
	
	@Override
	public Rider addRider(Rider rider) {
		em.persist(rider);
		em.flush();
		return rider;
	}

	@Override
	public Rider editRider(Rider rider) {
		Rider manRider = em.find(Rider.class, rider.getId());
		manRider.setFirstName(rider.getFirstName());
		manRider.setLastName(rider.getLastName());
		manRider.setAge(rider.getAge());
		manRider.setCountry(rider.getCountry());
		manRider.setTeam(rider.getTeam());
		manRider.setBike(rider.getBike());
		manRider.setFirstGPYear(rider.getFirstGPYear());
		manRider.setWins(rider.getWins());
		manRider.setPodiums(rider.getPodiums());
		manRider.setPoles(rider.getPoles());
		manRider.setRaceFastestLaps(rider.getRaceFastestLaps());
		manRider.setChampionships(rider.getChampionships());
		manRider.setRiderNumber(rider.getRiderNumber());
		em.persist(manRider);
		em.flush();
		return manRider;
	}

	@Override
	public Rider deleteRider(int id) {
		Rider rmRider = em.find(Rider.class, id);
		em.remove(rmRider);
		em.flush();
		return rmRider;
	}
}
