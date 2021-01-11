package com.alura.java.avancado.io;


import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @autor Adriano Rabello 10/01/2021 - 11:11 AM
 */
public class PrintStreamTest {

    public PrintStreamTest(String s) {
    }

    public static void main(String[] args) throws FileNotFoundException {


        PrintStream ps = new PrintStream("printstream.txt");

        ps.println("Test imputstream ");
        /** to separe lines for any Operation System */
        ps.println();
        ps.println();
        ps.close();
    }
}
