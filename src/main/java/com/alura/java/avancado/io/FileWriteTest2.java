package com.alura.java.avancado.io;

import java.io.*;

/**
 * @autor Adriano Rabello 10/01/2021 - 11:11 AM
 */
public class FileWriteTest2 {

    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("lorem2.txt");

        fw.write("Test Loren ipson 2 ");

        /** to separe lines for any Operation System */
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("Test Loren ipson 2 line 2  ");
        fw.close();
    }
}
