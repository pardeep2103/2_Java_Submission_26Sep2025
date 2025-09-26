package Polymorphism;

public class poly_bank {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b; //object of parent class
		b = new bob();
		System.out.println(" Bob : ROI " + b.getRateOfInterest());
		b = new axis();
		System.out.println(" Axis : ROI " + b.getRateOfInterest());
		b = new bob();
		System.out.println(" SBI : ROI " + b.getRateOfInterest());

	}

}
