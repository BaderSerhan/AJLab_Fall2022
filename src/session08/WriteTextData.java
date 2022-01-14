/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author bader-aul
 */
public class WriteTextData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(new FileOutputStream(file, true));
        output.print("Andree\t");
        output.println(19);
        output.print("Kassandra\t");
        output.println(29);
        output.print("JeanMarc\t");
        output.println(89);

        System.out.println("Success");

        output.close();

    }

}
