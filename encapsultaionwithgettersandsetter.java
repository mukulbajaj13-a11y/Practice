package OOPs_testing;

public class encapsultaionwithgettersandsetter {
private String name;
private double salary;
public String  getname() {
	return name;
}
public void setname(String name) {
	this.name=name;
}

public void setsalary(double salary) {
	this.salary=salary;
}
public double getsalary() {
	return salary;
}
encapsultaionwithgettersandsetter(String Ename,double Esalary){
	name= Ename;
	salary= Esalary;
}
public  void showEmployeeDetails() {
System.out.println("Name of Employee is:" + getname());
System.out.println("Salary of " + getname() + "is :" +  getsalary());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsultaionwithgettersandsetter e1= new encapsultaionwithgettersandsetter("Mukul",2563.33);
		//e1.setname("Mukul");
		//e1.setsalary(25636);
		e1.showEmployeeDetails();
		encapsultaionwithgettersandsetter e2= new encapsultaionwithgettersandsetter("Amit",82563.33);
		e2.showEmployeeDetails();
	}

}
