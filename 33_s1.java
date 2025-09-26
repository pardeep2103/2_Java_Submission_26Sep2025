
package OOps_Class_object_constructor;


public class s1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "I am learning java";
String str = new String("hello");
System.out.println(str);
int l = str.length();
System.out.println(l);


String s4 = "Hello how are you ? I am working in HCL",
s1="HCL", s2="HCL1";

char c = s4.charAt(1);
System.out.println("pos : 1 " + c);
System.out.println(s2.contains(s1));

boolean b = s1.equals(s2);
System.out.println(b);
s1 = s4.substring(10,19); 
System.out.println(s1);


	}

}
