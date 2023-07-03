package org.utils;

import java.util.Comparator;

import org.domain.Bike;

public class PriceComparator implements Comparator<Bike> {
	@Override
	public int compare(Bike b1, Bike b2) {
		return (int) (b1.getPrice() - b2.getPrice());
	}
	

}
