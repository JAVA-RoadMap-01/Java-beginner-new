package org.example;

import java.util.Scanner;

public class Arrays {
    //Array practice
    public static void main(String[] args){

        //Define an array
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Value "+ (i+1) + " : ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int num:arr){
            System.out.print(num + ",");
        }
        sc.close();
    }
}
