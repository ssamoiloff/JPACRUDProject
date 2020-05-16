package com.skilldistillery.motogp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rider {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private Integer age;
	private String country;
	private String team;
	private String bike;
	@Column(name="first_gp_year")
	private Integer firstGPYear;
	private Integer wins;
	private Integer podiums;
	private Integer poles;
	@Column(name="race_fastest_laps")
	private Integer raceFastestLaps;
	private Integer championships;
	@Column(name="rider_number")
	private Integer riderNumber;
	
	public Rider() {
		super();
	}

	public Rider(int id, String firstName, String lastName, Integer age, String country, String team, String bike,
			Integer firstGPYear, Integer wins, Integer podiums, Integer poles, Integer raceFastestLaps,
			Integer championships, Integer riderNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
		this.team = team;
		this.bike = bike;
		this.firstGPYear = firstGPYear;
		this.wins = wins;
		this.podiums = podiums;
		this.poles = poles;
		this.raceFastestLaps = raceFastestLaps;
		this.championships = championships;
		this.riderNumber = riderNumber;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getBike() {
		return bike;
	}
	
	public void setBike(String bike) {
		this.bike = bike;
	}
	
	public Integer getFirstGPYear() {
		return firstGPYear;
	}
	
	public void setFirstGPYear(Integer firstGPYear) {
		this.firstGPYear = firstGPYear;
	}
	
	public Integer getWins() {
		return wins;
	}
	
	public void setWins(Integer wins) {
		this.wins = wins;
	}
	
	public Integer getPodiums() {
		return podiums;
	}
	
	public void setPodiums(Integer podiums) {
		this.podiums = podiums;
	}
	
	public Integer getPoles() {
		return poles;
	}
	
	public void setPoles(Integer poles) {
		this.poles = poles;
	}
	
	public Integer getRaceFastestLaps() {
		return raceFastestLaps;
	}
	
	public void setRaceFastestLaps(Integer raceFastestLaps) {
		this.raceFastestLaps = raceFastestLaps;
	}
	
	public Integer getChampionships() {
		return championships;
	}
	
	public void setChampionships(Integer championships) {
		this.championships = championships;
	}
	
	public Integer getRiderNumber() {
		return riderNumber;
	}
	
	public void setRiderNumber(Integer riderNumber) {
		this.riderNumber = riderNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((bike == null) ? 0 : bike.hashCode());
		result = prime * result + ((championships == null) ? 0 : championships.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((firstGPYear == null) ? 0 : firstGPYear.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((podiums == null) ? 0 : podiums.hashCode());
		result = prime * result + ((poles == null) ? 0 : poles.hashCode());
		result = prime * result + ((raceFastestLaps == null) ? 0 : raceFastestLaps.hashCode());
		result = prime * result + ((riderNumber == null) ? 0 : riderNumber.hashCode());
		result = prime * result + ((team == null) ? 0 : team.hashCode());
		result = prime * result + ((wins == null) ? 0 : wins.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rider other = (Rider) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (bike == null) {
			if (other.bike != null)
				return false;
		} else if (!bike.equals(other.bike))
			return false;
		if (championships == null) {
			if (other.championships != null)
				return false;
		} else if (!championships.equals(other.championships))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (firstGPYear == null) {
			if (other.firstGPYear != null)
				return false;
		} else if (!firstGPYear.equals(other.firstGPYear))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (podiums == null) {
			if (other.podiums != null)
				return false;
		} else if (!podiums.equals(other.podiums))
			return false;
		if (poles == null) {
			if (other.poles != null)
				return false;
		} else if (!poles.equals(other.poles))
			return false;
		if (raceFastestLaps == null) {
			if (other.raceFastestLaps != null)
				return false;
		} else if (!raceFastestLaps.equals(other.raceFastestLaps))
			return false;
		if (riderNumber == null) {
			if (other.riderNumber != null)
				return false;
		} else if (!riderNumber.equals(other.riderNumber))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (wins == null) {
			if (other.wins != null)
				return false;
		} else if (!wins.equals(other.wins))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rider [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", age=");
		builder.append(age);
		builder.append(", country=");
		builder.append(country);
		builder.append(", team=");
		builder.append(team);
		builder.append(", bike=");
		builder.append(bike);
		builder.append(", firstGPYear=");
		builder.append(firstGPYear);
		builder.append(", wins=");
		builder.append(wins);
		builder.append(", podiums=");
		builder.append(podiums);
		builder.append(", poles=");
		builder.append(poles);
		builder.append(", raceFastestLaps=");
		builder.append(raceFastestLaps);
		builder.append(", championships=");
		builder.append(championships);
		builder.append(", riderNumber=");
		builder.append(riderNumber);
		builder.append("]");
		return builder.toString();
	}

}
