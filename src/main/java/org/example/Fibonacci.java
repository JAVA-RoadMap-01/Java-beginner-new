package org.example;

import java.util.Scanner;

public class Fibonacci {
    
    private void fibonacciNum(Integer num){
        Integer n1=0,n2=1,n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=1;i<=num;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
    public static void main(String[] args){
        Integer num;
        Scanner sc = new Scanner(System.in);
        Fibonacci obj = new Fibonacci();
        System.out.println("Enter a number :");
        num = sc.nextInt();
        obj.fibonacciNum(num);
        sc.close();

    }
}
