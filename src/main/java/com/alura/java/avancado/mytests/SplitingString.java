package com.alura.java.avancado.mytests;

import java.util.ArrayList;
import java.util.List;

public class SplitingString {

    private static String commandName = "AvancarStatusProjetoCommandHandler";
    public static void main(String[] args) {


        tranformCommandName(commandName);

    }





    public String splitString(String name){



        return null;
    }


    public static String tranformCommandName(String input) {


        String[] split = input.split("(?=\\p{Upper})");

        List<String> name = new ArrayList<>();

        for (int x = 0; x < split.length - 2; x++){
            name.add(split[x]);
        }

        return String.join(" ", name);



    }


}
