
package Hasmap;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class hasmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,hmstudent> hms = new HashMap<Integer,hmstudent>();

hmstudent s1 = new hmstudent("Sameer", 101, 26);
hmstudent s2 = new hmstudent("Simran", 102, 16);

hms.put(s1.eid, s1); // s1.eid = 101  s1= "Sameer", 101,26
hms.put(s2.eid, s2);

System.out.println("Iterating over HashMap: ");
for(Entry<Integer, hmstudent> e : hms.entrySet())
{
	hmstudent s4 = e.getValue();
	System.out.println("ID : " + e.getKey() + "Name : " + s4.sname + "Age : " + s4.age);
}


	}

}
