package Hasmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, String> employeeMap = new HashMap<>();

//Add key-value pairs to the map
employeeMap.put(101, "Ram");
employeeMap.put(99, "Sita");
employeeMap.put(1001, "Dency");
employeeMap.put(7, "kavya");

//Print the map

System.out.println("Employee Map: " + employeeMap);
System.out.println("EntrySet: " + employeeMap.entrySet());
System.out.println("KeySet : " + employeeMap.keySet());

//Access value using key
System.out.println("Employee with ID 99: " + employeeMap.get(99));

//Remove a key-value pair
employeeMap.remove(1001);

//Check if a key or value exists
System.out.println("Contains key 1001: " + employeeMap.containsKey(1001));
System.out.println("Contains value 'Sita'? " + employeeMap.containsValue("Sita"));

//Iterate through entries
System.out.println("\nAll Employees:");
for (Integer id : employeeMap.keySet()) {
	System.out.println("ID: " + id + ", Name: " + employeeMap.get(id));	
}
 }
}
