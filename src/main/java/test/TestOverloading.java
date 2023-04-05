package main.java.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestOverloading {

    public static void main(String args[]) {
        System.out.println("Date is   "+LocalDate.now().toEpochDay());

        List<String> arrayList = new ArrayList<>();
        List<String> linkList  = new LinkedList<>();
        TestOverloading obj = new TestOverloading();
        arrayList.add("Deepak");
        //obj.findElemant(arrayList,"Shivam");
    }

/*    public boolean findElemant(List<String> list, String str){
        System.out.println("i am in list");
        return list.contains(str);
    }*/

    public boolean findElemant(ArrayList<String> list, String str){
        System.out.println("i am in array list");
        return list.contains(str);
    }

   /* public boolean findElemant(LinkedList<String> list, String str){
        System.out.println("i am in linked list");
        return list.contains(str);
    }*/
}

