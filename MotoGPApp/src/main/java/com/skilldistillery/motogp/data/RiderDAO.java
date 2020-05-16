package com.skilldistillery.motogp.data;

import java.util.List;

import com.skilldistillery.motogp.entities.Rider;

public interface RiderDAO {
	public Rider findById(int id);
	public Rider findByRiderNumber(Integer rn);
	public Rider findByFirstName(String fn);
	public Rider findByLastName(String ln);
	public List<Rider> findByTeam(String team);
	public List<Rider> findAll();
	public Rider addRider(int id);
	public Rider editRider(int id);
	public Rider deleteRider(int id);
}
