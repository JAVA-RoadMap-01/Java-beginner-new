package org.example;

import java.util.Scanner;

public class WordCount {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String sentence = sc.nextLine();

        int wordCount = 1;
        //Word count
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i) == ' '){
                wordCount++;
            }
        }
        System.out.println("Total Words : " + wordCount);
        sc.close();

    }
}
