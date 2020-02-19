package com.bayrktlihn.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;



public class SomeBusinessMockAnnotationsTest {

	@Mock
	private DataService dataServiceMock;

	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void testFindTheGreatestFromAllData() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 23, 4, 234, 2333 });

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(2333, result);
	}

	@Test
	void testFindTheGreatestFromAllData_ForOneValue() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 23 });

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(23, result);
	}

}
