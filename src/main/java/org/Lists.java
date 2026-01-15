package org;

import java.util.*;

public class Lists {
    
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print each number in the array
        for (int number : numbers) {
            System.out.println(number);
        }

        List<String> fruits = new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        System.out.println("Fruits List: " + fruits);
        System.out.println(fruits.size());
        Collections.sort(fruits);
        System.out.println("Sorted Fruits List: " + fruits);
        System.out.println(fruits.contains("Banana"));
        fruits.remove(0);
        System.out.println("Fruits List after removal: " + fruits);

    }
}

