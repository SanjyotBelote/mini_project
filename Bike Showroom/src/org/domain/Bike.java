package org.domain;
import lombok.*;
import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

public class Bike implements Comparable<Bike>{
	private String bikeName;
	private int modelNumber;
	private String brand;
	private double price;
	private int manfYear;
	private String color;
//	private boolean isAvailable;
	
//	public boolean isAvailable() {
//		return isAvailable;
//	}
//	
	@Override
	public String toString() {
		return String.format("%-15s%-15d%-15s%-15.2f%-21d%-10s", this.bikeName, this.modelNumber, this.brand, this.price, this.manfYear, this.color);
		
	}
	@Override
	public int compareTo(Bike other) {
		return this.modelNumber - other.modelNumber;
	}
}
