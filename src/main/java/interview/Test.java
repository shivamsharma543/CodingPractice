package main.java.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    char [] arr = {'a','e','f','g','h','a','e','f','h'};     
    String str = "aefghaefg";
    
    List<String> ls = new ArrayList<>();
    
    ls.add("shivam");
    ls.add("sharma");
    ls.add("apple");
    
    List<String> filteredList = ls.stream().filter(str1 -> str1.charAt(0)=='s' || str1.charAt(0)=='S').collect(Collectors.toList());
    
    //System.out.println(filteredList);

        testMap();
	}
	
	public static char findFirstNonRepeting(String str) {
		
		return str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(c -> c.getValue()==1).map(entry -> entry.getKey()).findFirst().get();
		
		
	}

    public static void testMap(){
        String str2 = "my.name.shivam.sharma.test.10";
        String str1 = "my.name.shivam.20";
        String str3 = "my.name.shivam";
        Map<Integer,Test> map = new HashMap<>();
        List<Test> t = new ArrayList<>();
        Test obj = new Test();
        obj.setName("shivam");
        map.put(1,obj);
        t.add(obj);
        //changeName(map.values());
        changeName(t);
    }

    private static void changeName(Collection<Test> ct){
        for(Test obj:ct){
            obj.setName("Nidhi");
        }

    }

}
