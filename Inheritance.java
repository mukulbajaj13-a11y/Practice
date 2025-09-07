package OOPs_testing;


class Vehicle{
	String brand;
	String model;
	int year;

public Vehicle(String brand, String model, int year) {
	this.brand= brand;
	this.model=model;
	this.year= year;
}
public void displayinfo(){
	System.out.println("Veichile"+ brand +"model" +model + "Is Year" +year);
}
public String getBrand() { return brand; }
public String getModel() { return model; }
public int getYear() { return year; }
}
class Car extends Vehicle{
	private int seats;
	public Car(String brand, String model, int year,int seats) {
		super(brand,model,year);
		this.seats=seats;
	}
	public void displayInfoCar()
{
		System.out.println("Car: "+getBrand() + " " + getModel() +
                " (" + getYear() + ") | Seats: " + seats);
}}
class Bike extends Vehicle{
	private String type;
	public Bike(String brand, String model, int year,String type) {
		super(brand,model,year);
		this.type=type;
	}
		public void displayInfoBike()
		{
				System.out.println("Bike: "+getBrand() + " " + getModel() +
		                " (" + getYear() + ") | Type: " + type);
		}
	}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Car car1 = new Car("Toyota", "Camry", 2020, 5);
		  Bike b1=new Bike("Yamaha", "R15", 2023, "Sports");

	        // Display details
	        car1.displayInfoCar();
	        b1.displayInfoBike();
	        
	}

}
