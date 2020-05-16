package com.skilldistillery.motogp.data;

import com.skilldistillery.motogp.entities.Rider;

public interface RiderDAO {
	public Rider findById(int id);
}
