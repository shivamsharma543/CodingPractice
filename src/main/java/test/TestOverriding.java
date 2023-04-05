package main.java.test;

import java.util.ArrayList;
import java.util.List;

public class TestOverriding <T>{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOverriding<?> obj  = new TestOverriding<>();
		TestOverriding<?> obj1 = new TestOverriding<>();
		
		List<Employee> ls = obj.createList(new Employee(1,"Shivam"));
		List<TestOverriding> listOfNumber = new ArrayList<TestOverriding>();
		
		listOfNumber.add(new TestOverridingChild1());
		listOfNumber.add(new TestOverridingChild2());
		
		for(TestOverriding object:listOfNumber) {
			
			System.out.println(object.getClass().getName());
			
		}
		
		
		for(Employee e: ls) {
			System.out.println(e.toString());
		}		
		
		List<Manager> ls1 = obj1.createList(new Manager(100,"Ketan"));
		
		for(Manager e: ls1) {
			System.out.println(e.toString());
		}

	}
	
	public <T>List<T> createList(T t) {
		
		List<T> ls = new ArrayList<>();		
		ls.add(t);
		
		return ls;
		
	}


}

class TestOverridingChild1 extends TestOverriding<Integer> {

	public void sum(Integer obj) {
        System.out.println(String.valueOf(obj));
		
	}

}

class TestOverridingChild2 extends TestOverriding<Integer> {

	public void sum(Integer obj) {
        System.out.println(String.valueOf(obj));
		
	}

}

class Employee implements Comparable<Employee>{

	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Employee o) {
		return 0;
	}
	
}

class Manager implements Comparable<Manager>{

	int id;
	String name;
	
	public Manager(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Manager o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

