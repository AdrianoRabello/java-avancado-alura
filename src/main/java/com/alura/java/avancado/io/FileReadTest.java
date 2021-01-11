package com.alura.java.avancado.io;

import java.io.*;

/**
 * @autor Adriano Rabello 10/01/2021 - 11:11 AM
 */
public class FileReadTest {

    public static void main(String[] args) throws IOException {



        FileInputStream fis = new FileInputStream("lorem.txt");

        InputStreamReader isr = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(isr);

        System.out.println(br.readLine());

        br.close();

        System.out.println("-------------------------");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("lorem.txt")));
        String linha  = bufferedReader.readLine();
        while(linha != null){
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }
    }
}
