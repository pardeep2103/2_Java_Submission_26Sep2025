package Collections;

import java.util.ArrayList;
import java.util.List;

public class slist_object {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<student> slist = new ArrayList<student>();
			student s0 = new student();
			s0.name="John";
			s0.id=123;
			student s1 = new student("Satish", 101);
			student s2 = new student("Priya", 102);
			student s4 = new student("Bindiya", 104);

			//slist.add(null);
			slist.add(s1);
			slist.add(s2);
			slist.add(s4);
			
			student s3 = slist.get(0);
			for(student s5 : slist) 
			{
				if(s5.id==101)
					System.out.println("Student name is  " + s5.name);
			}

			
			

	}

}
