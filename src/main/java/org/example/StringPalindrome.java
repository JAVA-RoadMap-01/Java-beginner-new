package org.example;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String reversedWord = "";
        //Palindrome using String
        System.out.println("Palindrome using String");
        for (int i=word.length()-1;i>=0;i--){
            reversedWord += word.charAt(i);
        }
        if(word.equals(reversedWord)){
            System.out.println("IT'S A PALINDROME");
        }
        else {
            System.out.println("IT'S NOT A PALINDROME");
        }

        //Palindrome using String Builder
        System.out.println("Palindrome using String Builder");
        StringBuilder word1 = new StringBuilder(word);
        StringBuilder word2 = new StringBuilder(word);
        word2.reverse();
        if(word1.toString().contentEquals(word2)){
            System.out.println("IT'S A PALINDROME");
        }
        else {
            System.out.println("IT'S NOT A PALINDROME");
        }
        sc.close();
    }
}
