package Hasmap;


public class hmstudent {
	String sname;
	int eid;
	int age;
	
	//Parameterised constructor
	public hmstudent(String sname, int eid, int age)
	{
		this.sname = sname;
		this.eid = eid;
		this.age = age;
		
		//System.outl.println("In const " + sname + " " + id + " " + age);
	}
	public void display()
	{
		System.out.println(sname + " " + eid + " " + age);
	}

}
