package oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * class  and object
 */
public class Vehicle implements Comparable<Vehicle> {
	String name;
	int price;
	String sex;

	public Vehicle(String name, int price, String sex) {
		super();
		this.name = name;
		this.price = price;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println(this.getClass().getSimpleName() + "[Name: " + this.name + ", Price: " + this.price + "]");
	}



	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", price=" + price + ", sex=" + sex + "]";
	}

	@Override
	public boolean equals(Object otherObj) {

		if (this == otherObj) // does this and otherObj refers to the same object
			return true;
		if (!(otherObj instanceof Vehicle)) // is class type otherObj is a vehicle
			return false;
		Vehicle v = (Vehicle) otherObj;
		return (this.name == v.name) && (this.price == v.price);
	}

	@Override
	public int compareTo(Vehicle v) {
		if (this.price == v.getPrice()) {
			if (this.name.equals(v.getName())) {
				return this.sex.compareTo(v.getSex());
			}
			return this.name.compareTo(v.getName());
		}

		else if (this.price > v.getPrice())
			return 1;
		else
			return -1;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("v1", 1000,"male");
		// System.out.println(v1.getName());
		// System.out.println(v1.getPrice());
		// v1.print();
		System.out.println(v1);
		Vehicle v2 = new Vehicle("v2", 2000,"male");
		Vehicle v3 = new Vehicle("v3", 3000,"male");
		Vehicle v4 = new Vehicle("v4", 4000,"male");
		Vehicle v5 = new Vehicle("v6", 5000,"female"); //
		Vehicle v6 = new Vehicle("v5", 5000,"male");
		Vehicle v7 = new Vehicle("v7", 7000,"male");
		Vehicle v8 = new Vehicle("v6", 5000,"male");  //
		// System.out.println(v1.equals(v2)); // true
		// System.out.println(v1.equals(v3)); // true
		// System.out.println(v1 == v3); // true
		/*
		 * List<Vehicle> vehicles = new ArrayList<Vehicle>(); vehicles.add(v1);
		 * vehicles.add(v2); vehicles.add(v3);
		 * 
		 */
		List<Vehicle> vehicles = Arrays.asList(v5, v6, v7, v8, v1, v2, v3, v4);
		System.out.println(vehicles);
		Collections.sort(vehicles);
		System.out.println(vehicles);
	}
}
