package com.alura.java.avancado.io;

import java.io.*;

/**
 * @autor Adriano Rabello 10/01/2021 - 11:11 AM
 */
public class FileWriteTest {

    public static void main(String[] args) throws IOException {



        FileOutputStream fos = new FileOutputStream("lorem.txt");

        Writer osw = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Nova linha escrita ");
        bw.newLine();

        bw.close();
    }
}
