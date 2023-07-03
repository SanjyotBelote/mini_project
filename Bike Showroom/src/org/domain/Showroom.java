package org.domain;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Showroom {
	private String name;
	private ArrayList<Bike> bikes;
	
	public Showroom(String name) {
		this.name = name;
		bikes = new ArrayList<>();
		
	}
	public String getName() {
		return name;
	}

	public void addBike(Bike b) {
		bikes.add(b);
	}
	
	public ArrayList<Bike> getBikes(){
		return bikes;
	}
//	public void sellBike(int index) {
//		bikes.remove(index);
//	}
	
	public void removeBike(String bikeName){
        for (Bike bike : bikes) {
            if (bike.getBikeName().equalsIgnoreCase(bikeName)) {
                if (bikes.contains(bike)) { 
                	bikes.remove(bike);
                }

                bikes.remove(bike);
                System.out.println(bikeName + " removed from showroom");
                return;
            }
        }

        System.out.println("Sorry, Bike not available !");
        System.out.println();
    }
	
	public void displayBikes() {
		if(bikes.isEmpty()) {
			System.out.println("No bikes available !");
		} else {
			System.out.println("Bikes available at " + name + ":");
			System.out.println();
			System.out.println("Bike Name      Model Number   Brand          Price          Year of Manufacture  Color ");
			System.out.println("_________      ____________   _____          _____          ___________________  _____");
			System.out.println();
			for(Bike bike : bikes) {
				System.out.println(bike.toString());
			}
		}
	}
	
	public void addBikeArray(List<Bike> b) {
		bikes.addAll(b);
	}
	
	public void sortBikes(Comparator<Bike> c) {
		bikes.sort(c);
		for(Bike bike:bikes) {
			System.out.println(bike.toString());
		}
	}
	
	
	@Override
	public String toString() {
		return "Showroom{" + "bikes=" + bikes + "}";
	}
	
	
}
