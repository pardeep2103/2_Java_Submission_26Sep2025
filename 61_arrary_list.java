package Collections;

import java.util.ArrayList;
import java.util.List;


public class arrary_list {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a1 = new ArrayList<String>();

a1.add("Pune");
a1.add("Panjab");
a1.add("Haryana");


System.out.println(a1);

 for(String s : a1) 
 {
	 System.out.println(s);
 }
 a1.remove(0);
 System.out.println("After removing :" + a1);
 

	}

}
