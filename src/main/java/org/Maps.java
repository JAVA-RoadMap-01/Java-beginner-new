package org;

import java.util.*;

public class Maps {
    
    public static void main(String[] args){
        Map<String, Integer> marks = new HashMap<>();
        for(int i = 1; i <= 5; i++){
            marks.put("Student" + i, i * 10);
        }

        if(marks.containsKey("Student3")){
            System.out.println("Marks of Student3: " + marks.get("Student3"));
            marks.putIfAbsent("Student6", 60);
        }

        System.out.println("Marks of all students:" + marks);
        marks.put("Studen7", 70);

        List<Map.Entry<String, Integer>> marklist = new ArrayList<>(marks.entrySet());
        // Collections.sort(marklist, Map.Entry.comparingByValue());
        // System.out.println("Sorted Marks List: " + marklist);
        marks.remove("Student2");
        System.out.println("Marks after removal: " + marks);
        
        //Bad idea as it only modifies the list and not the actual map, so now map and list are out of sync
        //marklist.add(new AbstractMap.SimpleEntry<>("Student7",70));

        System.out.println("Marks after adding Student7: " + marks);
        marklist.sort(Map.Entry.comparingByValue());
        System.out.println("Updated Sorted Marks List: " + marklist);

        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
