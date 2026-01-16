package org;

import java.util.*;

public class LinkedLists {
    
    public static void main(String[] args){

        List<String> students = new LinkedList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Aradhana");
        students.add("Alice");
        System.out.println("Students List: " + students);

        for(String student : students){
            if(Collections.frequency(students,student) > 1){
                students.remove(student);
                break;
            }   
        }
        System.out.println("Students List after removing duplicates: " + students);
        //LAMBDA FUNC: students.removeIf(student -> Collections.frequency(students, student) > 1);

    }
}
