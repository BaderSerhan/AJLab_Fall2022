/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author bader-aul
 */
public class ReadTextData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");

        Scanner scan = new Scanner(file);

        while (scan.hasNext()) {
            String firstName = scan.next();
            String mi = scan.next();
            String lastName = scan.next();
            int score = scan.nextInt();

            System.out.println("The name is : " + firstName + " " + mi + " " + lastName + " has score: " + score);
        }

        System.out.println("Finished");
        scan.close();
    }

}
