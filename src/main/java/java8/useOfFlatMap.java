package main.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class useOfFlatMap {

	public static void main(String args[]) {
		
		List<List<Employee>>listOfList=new ArrayList<List<Employee>>();
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		String address1[]= {"silkboard","btm"};
		String address2[]= {"mg road","kr-puram"};
		String address3[]= {"Marathahalli","Kalamandir"};
				
	    listOfEmployee.add(new Employee("Shivam",1,Arrays.asList(address1)));
        listOfEmployee.add(new Employee("PRAKHAR",2,Arrays.asList(address2)));
        listOfEmployee.add(new Employee("AKASH",3,Arrays.asList(address3)));

		/*
		 * List<String>address=listOfEmployee.stream().flatMap(l->l.getAddress().stream(
		 * )).collect(Collectors.toList()); //forEach(l->System.out.println(l));
		 * 
		 * System.out.println(address);
		 */
        
        listOfList.add(listOfEmployee);
        
        
        
        // Collect the list of employee and print their name in two steps
                List<Employee>listOfEmployee1=listOfList.stream().flatMap(l->l.stream()).collect(Collectors.toList());
                listOfEmployee1.stream().forEach(l->System.out.println(l.getName()));
                                      
       // Collect the list of employee and print their name in one step 
                                      //listOfList.stream().flatMap(l->l.stream()).forEach(l->System.out.println(l.getName()));
                                      
                                      
      // Collect the list of employee and address in one single step  
        listOfList.stream().flatMap(l->l.stream()).flatMap(l->l.getAddress().stream()).forEach(l->System.out.println(l));
        //List<String>lsAddress=listOfList.stream().flatMap(l->l.stream()).flatMap(a->a.getAddress().stream()).collect(Collectors.toList());
        
        
        

		
	}
}
