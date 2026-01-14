package org;
import java.util.Scanner;

public class Exceptions {

    Scanner scanner = new Scanner(System.in);

    private void userInput(){
        System.out.println("User Input Method");
        try{
            String name = scanner.nextLine();
            Integer age= scanner.nextInt();
            if (age < 0 || age > 120 ) {
                throw new InvalidAgeException("Age must be a valid integer between 0 and 120.");
            }
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    public static void main(String[] args) {
        Exceptions ex = new Exceptions();
        ex.userInput();
    }
}
