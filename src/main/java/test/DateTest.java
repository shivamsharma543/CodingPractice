package main.java.test;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.*;
import java.util.*;
import java.util.stream.Collectors;

public class DateTest {

    public static void main(String[] args)  {
       DateTest obj = new DateTest();
       List<String> arrayList = new ArrayList<>();
       List<String> linkList  = new LinkedList<>();

       List<String> rics = Arrays.asList("GS.N","AB.NB",".NB.A");
       String[] arr = new String[]{"GS.N","AB.NB",".NB.A","ABC"};
       arr = Arrays.stream(arr).filter(ric->ric.contains(".NB")).toArray(String[]::new);
       for(String str : arr){
           System.out.println(str);
       }
       //System.out.println(rics.stream().filter(ric->ric.contains(".NB")).collect(Collectors.toList()));

       //System.out.println(obj.findElemant(arrayList,"shivam"));
       //System.out.println(obj.findElemant(linkList,"shivam"));
       //System.out.println(obj.useLambda("shiv-am"));
    }

    public int  useLambda(String str ){
        Sample s = (s1)  ->   s1.length();
        return s.findLength(str);
    }

    public boolean findElemant(List<String> list,String str){
        System.out.println("i am in list");
        return list.contains(str);
    }

    public boolean findElemant(ArrayList<String> list,String str){
        System.out.println("i am in array list");
        return list.contains(str);
    }

    public boolean findElemant(LinkedList<String> list, String str){
        System.out.println("i am in linked list");
        return list.contains(str);
    }



}

/*lass DateTestChild extends DateTest{
    public void parserDate() throws ParseException {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date dt = df.parse("01-06-2016");
    }
}*/

@FunctionalInterface
interface Sample{

    abstract int findLength(String str);
}
