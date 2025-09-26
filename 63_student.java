package Collections;


public class student {
	public int id;
	public String name;
	
	//Constructor

	  public student(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	public student() {
		
	}
	public void display()
	{
		System.out.println("Name : " + this.name + " ID : " + this.id);
		
	}

}
