package com.fdmgroup.intermediate.mockito.core;



import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class MockitoTest {

	private List<Integer> mockedIntegerList;
	
	//Preferred method of creating mocks
	@Mock 
	private List<String> mockedStringList;

	@BeforeEach
	public void init() {
		//Preferred method of creating mocks
		MockitoAnnotations.initMocks(this);
		//Alternative method of creating mocks
		mockedIntegerList = mock(List.class);
	}
	
	@Test
	public void testThatMockedStringListReturnsDefaultValues() {
		assertAll(
				()-> assertEquals(0,mockedStringList.size()),
				()-> assertFalse(mockedStringList.isEmpty()),
				()-> assertNull(mockedStringList.get(0)),
				()-> assertNull(mockedStringList.get(1024)));
	}
	
	@Test
	public void testThatSubbingAltersTheReturnValues() {
		when(mockedStringList.size()).thenReturn(256);
		when(mockedStringList.isEmpty()).thenReturn(true);
		when(mockedStringList.get(1024)).thenReturn("Found");
		assertAll(
				()-> assertEquals(256,mockedStringList.size()),
				()-> assertTrue(mockedStringList.isEmpty()),
				()-> assertEquals("Found",mockedStringList.get(1024)));
	}

	@Test
	public void testThatMockedStringListIsMockedAndDoesntTruelyWork() {
		mockedStringList.add("Is it here");
		assertNull(mockedStringList.get(0));
	}
	
	@Test
	public void testThatMockedStringListsMethodsAreCalledASpecificNumberOfTimes() {
		verify(mockedIntegerList,times(0)).get(0);
	}
	 
}
