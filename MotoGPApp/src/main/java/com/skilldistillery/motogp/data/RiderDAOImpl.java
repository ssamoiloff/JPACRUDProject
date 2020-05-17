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
		String jpql = "INSERT INTO Rider r (r.firstName, r.lastName, r.age, r.country, "
				+ "r.team, r.bike, r.firstGPYear, r.wins, r.podiums, r.poles, r.raceFastestLaps, "
				+ "r.championships, r.riderNumber) "
				+ "VALUES (:fn, :ln, :age, :country, :team, :bike, :fGPYear, :wins, :podiums, "
				+ ":poles, :rFLaps, :champs, :rNum";
		Rider newRider = em.createQuery(jpql, Rider.class)
				.setParameter("fn", rider.getFirstName())
				.setParameter("ln", rider.getLastName())
				.setParameter("age", rider.getAge())
				.setParameter("country", rider.getCountry())
				.setParameter("team", rider.getTeam())
				.setParameter("bike", rider.getBike())
				.setParameter("fGPYear", rider.getFirstGPYear())
				.setParameter("wins", rider.getWins())
				.setParameter("podiums", rider.getPodiums())
				.setParameter("poles", rider.getPoles())
				.setParameter("rFLaps", rider.getRaceFastestLaps())
				.setParameter("champs", rider.getChampionships())
				.setParameter("rNum", rider.getRiderNumber())
				.getSingleResult();
		em.persist(newRider);
		em.flush();
		return newRider;
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
