package org.utils;

import java.util.Comparator;

import org.domain.Bike;

public class ManufYearComparator implements Comparator<Bike>{
	@Override
	public int compare(Bike b1, Bike b2) {
		return b1.getManfYear() - b2.getManfYear(); // - for primitive data type
	}
}
