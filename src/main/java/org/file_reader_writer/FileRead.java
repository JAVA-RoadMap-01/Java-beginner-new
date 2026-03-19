package org.file_reader_writer;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
    
    public static void main(String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("Write_Data.txt")) ){
        String line = reader.readLine();
        System.out.println(line);
        }
        catch(Exception e){
            e.printStackTrace();
    }
}
}
