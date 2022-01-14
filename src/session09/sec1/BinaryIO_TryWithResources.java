/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09.sec1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bader-aul
 */
public class BinaryIO_TryWithResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File textFile = new File("scores.txt");
        File binaryFile = new File("scores.dat");

        try (
                FileOutputStream output = new FileOutputStream(binaryFile, true);
                DataOutputStream outputStream = new DataOutputStream(output);
                FileInputStream input = new FileInputStream(binaryFile);
                DataInputStream inputStream = new DataInputStream(input);
                Scanner scan = new Scanner(textFile);) {

            while (scan.hasNext()) {
                String firstName = scan.next();
                int score = scan.nextInt();

//                System.out.println("The name is : " + firstName + " has score: " + score);
                outputStream.writeUTF(firstName);
                outputStream.writeInt(score);
            }

            System.out.println("Finished writing");

            System.out.println("Reading from binary file: ");

            while (inputStream.available() > 0) {
                System.out.println(inputStream.readUTF());
                System.out.println(inputStream.readInt());
            }

            System.out.println("Finished reading");
        }

    }

}
