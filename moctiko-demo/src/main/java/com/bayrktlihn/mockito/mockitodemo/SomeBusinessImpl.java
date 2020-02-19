package com.bayrktlihn.mockito.mockitodemo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SomeBusinessImpl {
	private DataService dataService;
	
	public int findTheGreatestFromAllData() {
		int max = Integer.MIN_VALUE;
		
		for(int data : dataService.retrieveAllData()) {
			if(max < data)
				max = data;
		}
		
		return max;
	}
}



