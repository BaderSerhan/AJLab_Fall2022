/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author bader-aul
 */
public class WriteData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);
        output.print("Ahmad H Said\t");
        output.print(89);
        output.println();

        output.print("Johnny R Noun\t");
        output.print(79);
        output.print("\n");

        output.print("Eddy T Khoury\t");
        output.println(99);

        System.out.println("Success");

        output.close();

    }

}
