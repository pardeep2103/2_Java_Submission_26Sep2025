package Abstraction;

public class working_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bank b;

b = new icic();
System.out.println("ICIC Bank Rate of Interest is : " + b.getRateOfInterest()+ " %" );
b = new citi();
System.out.println("CITI Bank Rate of Interest is : " + b.getRateOfInterest()+ " %" );
b = new sbi();
System.out.println("SBI  Bank Rate of Interest is : " + b.getRateOfInterest()+ " %" );



	}

}
