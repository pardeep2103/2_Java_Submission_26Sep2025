package OOps_Class_object_constructor;


public class Student_addmission_Q2 {
 
	public int id;
	public float english, maths, avg;
	public String name;
//Constructor-1
	//Parameterised constructor
	public Student_addmission_Q2(String name, int id , float english, float maths)
	{
		this.name = name;
		this.english= english;
		this.maths= maths;
		this.id= id;
		
		
		
	}
	//Type this constuctor
	public Student_addmission_Q2(String name, int id) {
		this.name= name;
		this.id= id;
		System.out.println(" I am executed");
		
		
	}
	public void calc_avg()
	{
		avg= (float) ((english+maths)/2.0);
		
	}
	public void display_avg() {
		System.out.println(" Name: " + name +"\n Average = " + avg);
		
	}
}
