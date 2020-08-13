package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Animal;

public class TestAnimal {

	@Test
	public void test_checkIfAnimalIsOrganic() {
		//Arrange
		Animal barbar = new Animal();
		barbar.setOrganicNature(true);
		//Act
		boolean isOrganic = barbar.getOrganicNature();
		//Assert
		assertTrue(isOrganic);
		
	}
	
	
	@Test
	public void test_checkIfAnimalIsInorganic() {
		//Arrange
		Animal sparky = new Animal();
		sparky.setOrganicNature(false);
		//Act
		boolean isOrganic = sparky.getOrganicNature();
		//Assert
		assertFalse(isOrganic);
		
	}
	@Test
	public void test_checkIfAnimalSpecies() {
		//Arrange
		Animal lion = new Animal();
		
		Lion.setSpecies("Lion");
		//Act
		String species = Lion.getSpecies();
		//Assert
		assertEquals(species , "Lion");
		
	}
}
