package org.file_reader_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrtie {
    
    public static void main(String[] args){
        try{
            /**
             * Creates a FileWriter instance to write data to a file named "Data.txt".
             * The file will be created in the current working directory.
             * 
             * @throws IOException if an I/O error occurs
             */
            FileWriter writer = new FileWriter("Write_Data.txt");
            writer.write("Hello World!!\\n" + //
                                "Welcome to Java Programming.");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
