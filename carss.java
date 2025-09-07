package OOPs_testing;

public class carss {
String brand,model;
int year;
carss(String cBrand,String cModel,int cYear){
	brand=cBrand;
	model=cModel;
	year=cYear=2025;
}
public void displayCar() {
	System.out.println("The Car brand is " + brand +" Model is " + model + " and its year is " + year);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
carss c1= new carss("Honda","City",0);
c1.displayCar();
carss c2= new carss("Honda","Alto",0);
c2.displayCar();
	}

}
