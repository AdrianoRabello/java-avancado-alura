package com.alura.java.avancado.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @autor Adriano Rabello 11/01/2021 - 4:36 PM
 */
public class ScannerTest {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()){
            String b = scanner.nextLine();
            System.out.println(b);
        }

        scanner.close();

    }
}
