package org.example;

import java.sql.*;

public class Main {
    

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root" ;
    private static final String  password = "Tweety@663";

    public static void main(String args[]){
             
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
            
            Connection connection =DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Abhijeet");
            preparedStatement.setInt(2,25);
            preparedStatement.setDouble(3,90.1);

            int resultSet = preparedStatement.executeUpdate();
            if(resultSet>0){
                System.out.println("Data Inserted Successfully");
            }
            else{
                System.out.println("Data not inserted");
            }

        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
