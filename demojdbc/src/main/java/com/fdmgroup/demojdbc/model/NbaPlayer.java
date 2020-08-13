package com.fdmgroup.demojdbc.model;

public class NbaPlayer {
	
	private int id;
	private String firstName;
	private String lastName;
	private int	careerPoints;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if (this.id == 0) {
			this.id = id;
		}
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
	public int getCareerPoints() {
		return careerPoints;
	}
	public void setCareerPoints(int careerPoints) {
		this.careerPoints = careerPoints;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + careerPoints;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		NbaPlayer other = (NbaPlayer) obj;
		if (careerPoints != other.careerPoints)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NbaPlayer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", careerPoints="
				+ careerPoints + "]";
	}
}
