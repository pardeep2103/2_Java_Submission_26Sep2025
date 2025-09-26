package OOps_Class_object_constructor;

public class Amity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student deep = new Student(); // constructor method
deep.name="deep";
deep.maths=80;
deep.iot=60;
deep.ad=75;

deep.average();
System.out.println(deep.name + "\n " + deep.maths + "\n " + deep.iot + "\n " + deep.ad + 
		"\n " + deep.avg);
Student Jeeva = new Student(); // constructor method
Jeeva.name="Jeeva";
Jeeva.maths=80;
Jeeva.iot=90;
Jeeva.ad=77;

Jeeva.average();
System.out.println(Jeeva.name + "\n " + Jeeva.maths + "\n " + Jeeva.iot + "\n " + Jeeva.ad + 
		"\n " + Jeeva.avg);

	}

}
