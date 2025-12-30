package org.example;

import java.util.Scanner;

public class RecursiveFact {

    public int recursiveFactorial(int num){
        int result=num;
        for(int i=num;i>1;i--)
        {
            result=result*(i-1);
        }
        return(result);
    }
    public static void main(String[] args) {
        
        int num;
        RecursiveFact obj = new RecursiveFact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        System.out.println(obj.recursiveFactorial(num));
        sc.close();
    }
}