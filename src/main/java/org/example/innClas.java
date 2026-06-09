package org.example;

public class innClas {


    static class inner{

        public void display(){
            System.out.println("You are in INNER Class");
        }
    }

    public static void main(String[] args){
        System.out.println("Hi");
        //innClas inobj = new innClas();
        innClas.inner obj = new innClas.inner();

        obj.display();
    }
}
