package org.example;

public class StringReverse {
    //Reverse a string using string and loop
    public static void main(String[] args){

        String word = "Hello World";
        String reversedWord = "";
        for(int i=word.length()-1;i>=0;i--){

            reversedWord += word.charAt(i);
        }

        System.out.println("Reversed word is : " + reversedWord);


        //using string builder
        StringBuilder word1 = new StringBuilder("Hello world");
        System.out.println("Reversed Word using String Builder: " + word1.reverse());
    }
}
