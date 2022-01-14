/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09.sec2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bader-aul
 */
public class BinaryIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //create a binary file
        File file = new File("scores.dat");

        //Use Streams to write and read from/to binary files
        FileOutputStream fileOutput = new FileOutputStream(file, true);

        DataOutputStream dataOutput = new DataOutputStream(fileOutput);

        //writing data into the binary file using fileoutput stream
//        String name = "Marc Zgheib";
//        byte bytes[] = name.getBytes();
//
//        fileOutput.write(bytes);
//
//writing data into the binary file using dataoutputstream
//        dataOutput.writeUTF("Elias\t");
//
        File textFile = new File("scores.txt");

        Scanner scan = new Scanner(textFile);

        while (scan.hasNext()) {
            String firstName = scan.next();
            int score = scan.nextInt();

            System.out.println("The name is : " + firstName + " has score: " + score);

            dataOutput.writeUTF(firstName);
            dataOutput.writeInt(score);
        }

        System.out.println("Success");

        FileInputStream fileInput = new FileInputStream(file);

        DataInputStream dataInput = new DataInputStream(fileInput);

        //reading data from the binary file using datainputstream
        while (dataInput.available() > 0) {
            System.out.println(dataInput.readUTF());
            System.out.println(dataInput.readInt());
        }

        fileInput.close();
        fileOutput.close();
        dataInput.close();
        dataOutput.close();
        scan.close();

        //reading data from the binary file using fileinputstream
//        while (fileInput.available() > 0) {
//            System.out.println(fileInput.read());
//        }
    }

}
