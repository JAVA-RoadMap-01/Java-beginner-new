package org;

import java.util.*;

public class Sets {
    
    public static void main(String[] args){

        Set<Integer>numbers=new HashSet<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate, will not be added
        System.out.println("Numbers Set: " + numbers);
        System.out.println("Set Size: " + numbers.size());
        System.out.println("Contains 10: " + numbers.contains(15));
        numbers.remove(30);
        System.out.println("Numbers Set after removal: " + numbers);
        
        //Set -> List -> Sort
        List<Integer>numList = new ArrayList<>(numbers);
        Collections.sort(numList);
        System.out.println("Sorted Numbers List: " + numList);

        //If sorted values are required use TreeSet
        Set<Integer>treeSet=new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5000);
        treeSet.add(50);
        System.out.println("TreeSet (Sorted): " + treeSet);

    }
}
