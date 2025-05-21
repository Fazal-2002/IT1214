class Vehicle {
	String brand;
	int speed;
	
	void display() {
		System.out.println("Vehicle brand"+ brand);
		System.out.println("Vehicle Speed"+ speed);
		// Display vehicle details
	}
}

class Car extends Vehicle {
	String model;
	@Override
	
	void display() {
		super.display();
		System.out.println("Vehicle Model"+ model);
		// Display car details including brand, speed, and model
	}
	
public static void main (String[] args){
		Car car = new Car();
		car.brand = "Toyota";
		car.speed = 120;
		car.model = "Corolla";
		car.display();
	}
}