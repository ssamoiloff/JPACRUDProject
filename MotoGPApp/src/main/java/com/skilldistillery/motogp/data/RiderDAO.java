package com.skilldistillery.motogp.data;

import java.util.List;

import com.skilldistillery.motogp.entities.Rider;

public interface RiderDAO {
	public Rider findById(int id);
	public List<Rider> findByRiderNumber(int rn);
	public List<Rider> findByFirstName(String fn);
	public List<Rider> findByLastName(String ln);
	public List<Rider> findByKeyword(String kw);
	public List<Rider> findAll();
	public Rider addRider(Rider rider);
	public Rider editRider(int id);
	public Rider deleteRider(int id);
}
