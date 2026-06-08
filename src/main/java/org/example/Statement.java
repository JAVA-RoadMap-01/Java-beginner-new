package org.example;

import java.sql.*;

public class Statement {

    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root" ;
    private static final String  password = "Tweety@663";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            java.sql.Statement statement = connection.createStatement();
            String query = "select * from students";
            //String insert_query = String.format("INSERT INTO students(name,age,marks) VALUES('%s',%o,%f)" , "Abhijeet" , 21 , 92.5);
            //String updateQuery = String.format("UPDATE students SET marks = %f WHERE id = %d", 89.1,1);
            String deleteQuery = String.format("DELETE FROM students WHERE id = %d" ,2);

            ResultSet resultSet = statement.executeQuery(query);
            // int insertResultSet = statement.executeUpdate(insert_query);
            //int updateResultSet = statement.executeUpdate(updateQuery);
            int deletedResultSet = statement.executeUpdate(deleteQuery);

//            while(resultSet.next()){
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//                System.out.println("ID"+ id +",NAME :" + name + ",AGE :"+ age +",MARKS:"+ marks);
//            }

//            if(insertResultSet > 0){
//                System.out.println("Data Inserted Successfully");
//            }
//            else{
//                System.out.println("Data not inserted ");
//            }

//            if(insertResultSet > 0){
//                System.out.println("Data Updated Successfully");
//            }
//            else{
//                System.out.println("Data not updated ");
//            }


                if(deletedResultSet > 0){
                    System.out.println("Data Deleted Successfully");
                }
                else{
                    System.out.println("Data not deleted ");
                }

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

}