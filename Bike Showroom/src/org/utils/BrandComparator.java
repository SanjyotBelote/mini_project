package org.utils;

import java.util.Comparator;

import org.domain.Bike;

public class BrandComparator implements Comparator<Bike>{
	@Override
	public int compare(Bike b1, Bike b2) {
		return b1.getBrand().compareTo(b2.getBrand());
	}
} 
