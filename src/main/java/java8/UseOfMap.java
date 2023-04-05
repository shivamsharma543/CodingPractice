package main.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseOfMap {

	public static void main(String args[]) {
		List<Employee> empLs = new ArrayList<Employee>();
		
		String arr[] = { "silk", "btm" };
		String arr1[] = {"mg", "krpram" };
		String arr2[] = { "Marathahalli", "Kalamandir" };

		empLs.add(new Employee("shivam", 1,Arrays.asList(arr)));
		empLs.add(new Employee("sharma", 2,Arrays.asList(arr1)));
		empLs.add(new Employee("Prakhar", 3,Arrays.asList(arr2)));

		List<Integer> lsId = empLs.stream().map(emp -> emp.getId()).collect(Collectors.toList());
		//System.out.println(lsId);
		
		Map<String,List<String>> checkMap=new LinkedHashMap<>();
		checkMap.put("aaa",Arrays.asList(arr));
		checkMap.put("bbb",Arrays.asList(arr1));
		checkMap.put("ccc",Arrays.asList(arr2));
		
		Map<String,String>checmp1=new HashMap<String,String>();
		
		checmp1.put("abc","shivam");
		
		// Error Scenario with map Get the value of map which is a data structure (List) ..
		//List<String> mapList= checkMap.entrySet().stream().filter(e->e.getKey().equals("aaa")).map(e->e.getValue()).collect(Collectors.toList());
		
		
		//List<String> mapList= checkMap.entrySet().stream().filter(e->e.getKey().equals("aaa")).flatMap(e->e.getValue().stream()).collect(Collectors.toList());
		
		List<String> mapList1= checmp1.entrySet().stream().filter(e->e.getKey().equals("aaa")).map(e->e.getValue()).collect(Collectors.toList());
		
		// To update the list based on the filters. 
		empLs.stream().filter(e->e.getName().equalsIgnoreCase("shivam")).forEach(e->e.setName("sharma"));
		
		System.out.println(empLs);
		
	
	
	
	}
}

class Employee {
	private String name;
	private int id;
	private List<String> address;

	public Employee(String name, int id, List<String> address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
	
}
