package org.main;
import org.domain.Bike;
import org.utils.*;
import org.domain.Showroom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;



public class Program {
	private static Scanner sc = new Scanner(System.in);
	
	
	public static ArrayList<Bike> getBikes(){
		ArrayList<Bike> arr = new ArrayList<>();
//		Bike b1 = new Bike("Splendour", 67363, "Hero", 123641, 2021, "Black");
//		Bike b2 = new Bike("Hunter", 68233, "Royal Enf", 218200, 2022, "Blue/White");
//		Bike b3 = new Bike("Bobber", 65144, "JAWA", 171899, 2022, "Red/White");
//		Bike b4 = new Bike("Shine", 71347, "Honda", 98000, 2015, "Black/Red");
//		Bike b5 = new Bike("RX-135", 39863, "Yamaha", 78093, 2011, "Gold");
		arr.add(new Bike("Splendour", 67363, "Hero", 123641, 2021, "Black"));
		arr.add(new Bike("Hunter", 68233, "Royal Enfield", 218200, 2022, "Blue/White"));
		arr.add(new Bike("Bobber 42", 65144, "JAWA", 171899, 2022, "Red/White"));
		arr.add(new Bike("Shine", 71347, "Honda", 98000, 2015, "Black/Red"));
		arr.add(new Bike("RX-135", 39863, "Yamaha", 78093, 2011, "Gold"));
		
		return arr;
	}
	
	public static int menuList() {
		int choice; 
//		System.out.println("\n" + showroom.getName() + " Bike Showroom");
		System.out.println();
		System.out.println("0. Exit");
		System.out.println("1. Display Bikes");
		System.out.println("2. Add a Bike");
		System.out.println("3. Sell a Bike");
		System.out.println("4. Sort by Model Number");
		System.out.println("5. Sort by Bike Name");
		System.out.println("6. Sort by Manufacture Year");
		System.out.println("7. Sort by Brand Name");
		System.out.println("8. Sort by Price");
		System.out.println();
		System.out.println("Enter Choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
//		ArrayList<Bike> arr = new ArrayList<>();
		Showroom showroom = new Showroom("Elite Showroom");
		Comparator<Bike> comparator = null;
		showroom.addBikeArray(Program.getBikes());
		int choice;
		while((choice = (Program.menuList())) != 0){
			switch(choice) {
			
			case 1:
				showroom.displayBikes();
				break;
				
			case 2:
				System.out.println("Enter bike name : ");
				String bikeName = sc.next();
				sc.nextLine();
				System.out.println("Enter Model Number : ");
				int modelNumber = sc.nextInt();
				System.out.println("Enter Brand name : ");
				String brandName = sc.next();
				sc.nextLine();
			
				System.out.println("Enter price : ");
				Double price = sc.nextDouble();
				System.out.println("Enter Manufacture Year : ");
				int manfYear = sc.nextInt();
				
				System.out.println("Enter color : ");
				String color = sc.next();
				sc.nextLine();
				
				Bike bike = new Bike(bikeName, modelNumber, brandName, price, manfYear, color);
				showroom.addBike(bike);
				break;
				
			case 3:
				System.out.print("Enter bike name : ");  
				String name = sc.next();
				showroom.removeBike(name);
				break;
				
			case 4:
				comparator = new ModelNumberComparator();
				showroom.sortBikes(comparator);
				break;
				
			case 5:
				comparator = new BikeNameComparator();
				showroom.sortBikes(comparator);
				break;
			
			case 6:
				comparator = new ManufYearComparator();
				showroom.sortBikes(comparator);
				break;
			
			case 7:
				comparator = new BrandComparator();
				showroom.sortBikes(comparator);
				break;
				
			case 8: 
				comparator = new PriceComparator();
				showroom.sortBikes(comparator);
				break;
			}
			
		}
		
	}
}
