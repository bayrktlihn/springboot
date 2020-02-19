package com.bayrktlihn.mockito.mockitodemo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListTest {

	@Test
	void testSize() {
		List<String> listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());

	}
	
	@Test
	void testSize_multipleReturns() {
		List<String> listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());

	}

	@Test
	void testGet_SpecificParamater() {
		List<String> listMock = mock(List.class);
		
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals(null, listMock.get(1));

	}
	
	@Test
	void testGet_GenericParamater() {
		List<String> listMock = mock(List.class);
		
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals("SomeString", listMock.get(1));

	}
	
	

}
