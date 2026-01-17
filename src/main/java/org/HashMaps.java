package org;

import java.util.*;

public class HashMaps {
    
    public static void main(String[] args){

        Map<String, Integer> wordCounter = new HashMap<>();
        String text = "hello world! Hello everyone";    
        String[] words = text.toLowerCase().split("\\W+");
        for (String word : words) {
            wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Frequencies: " + wordCounter);
    }
}
