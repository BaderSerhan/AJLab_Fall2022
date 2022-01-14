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

/**
 *
 * @author bader-aul
 */
public class BinaryIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("scores.dat");

        try (FileOutputStream output = new FileOutputStream(file, true)) {
            //writing data into binary file using fileoutputstream
//            String name = "Eddy";
//            byte bytes[] = name.getBytes();
//
//            output.write(bytes);

            DataOutputStream outputStream = new DataOutputStream(output);
            outputStream.writeUTF("Ahmad");
            outputStream.writeInt(50);

            System.out.println("Success");
        }

        FileInputStream input = new FileInputStream(file);

        DataInputStream inputStream = new DataInputStream(input);

        /*
         * int nbBytes = input.available();
         * byte[] bytes = new byte[4];
         * input.read(bytesToRead);
         */
        //reading data from binary file using fileinputstream
//        while (input.available() > 0) {
//            System.out.println((char) input.read());
//        }
        while (inputStream.available() > 0) {
            System.out.println(inputStream.readUTF());
            System.out.println(inputStream.readInt());
        }

        //closing the streams
        input.close();
        inputStream.close();
    }

}
