package org.utils;

import java.util.Comparator;

import org.domain.Bike;

public class BikeNameComparator implements Comparator<Bike>{
	@Override
	public int compare(Bike b1, Bike b2) {
		return b1.getBikeName().compareTo(b2.getBikeName()); //compareTo for non-primitive data type
	}

}
