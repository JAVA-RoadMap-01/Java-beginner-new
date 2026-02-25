package org;

import java.util.*;

public class EmployeeComparator {
    
    public static void main(String[] args){
        HashMap<String, Double> employees = new HashMap<>();

        employees.put("Alec", 700000.00);
        employees.put("Brian", 500000.00);
        employees.put("Catherine", 600000.00);
        employees.put("Diana", 800000.00);

        //Iterator<String> it = employees.keySet().iterator();
        Iterator<Map.Entry<String, Double>> entryIt = employees.entrySet().iterator();

        while(entryIt.hasNext()){
            Map.Entry<String,Double> entry = entryIt.next();
            System.out.println("Employee " + entry.getKey() + " has a salary of " + entry.getValue());
            //System.out.println("Employee salary: "  + employees.get(entry.getKey()));
        }

        List<Map.Entry<String, Double>> entryList = new ArrayList<>(employees.entrySet());
        entryList.sort((e1,e2) -> e1.getValue().compareTo(e2.getValue()));

        System.out.println("\nEmployees sorted by salary:");
        for(Map.Entry<String, Double> entry : entryList){
            System.out.println("Employee " + entry.getKey() + " has a salary of " + entry.getValue());
        }


        
    }
}
