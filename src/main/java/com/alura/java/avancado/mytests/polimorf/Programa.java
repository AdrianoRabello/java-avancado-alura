package com.alura.java.avancado.mytests.polimorf;

import com.alura.java.avancado.mytests.polimorf.commands.AvancarStatusProjetoCommand;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Programa {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InstantiationException {



        AvancarStatusProjetoCommand avancarStatusProjetoCommand = new AvancarStatusProjetoCommand(1);

        String className = avancarStatusProjetoCommand.getClass().getName();

        System.out.println("className " + className);

        Class myClass = Class.forName(className);


        System.out.println("Contructor " + myClass);

        Object o = Class.forName(className).newInstance();

       o = avancarStatusProjetoCommand;

        System.out.println( "caraca -> " + ((AvancarStatusProjetoCommand) o).getIdProjeto());


        Object classe = avancarStatusProjetoCommand.getClass();

        System.out.println("calsse " + classe);

        classe = avancarStatusProjetoCommand;




        Object clazz = Class.forName(className);
        System.out.println("nome da macasse " + clazz.getClass().getName());






        Method[] declaredMethods = ((Class<?>) clazz).getDeclaredMethods();

        clazz.getClass().getName();

       String name = verify("getIdProjeto", ((Class<?>) clazz).getDeclaredMethods());

        if(name != null){

            System.out.println("name " + name);
            Object obj = clazz;
            System.out.println(obj.getClass().getName());

            System.out.println(" valor " + ((Class<?>) clazz).getMethod(name));

        }


    }




    private static String verify(String name, Method[] declaredMethods ){

        for (Method method : declaredMethods) {

            System.out.println(method.getName());
            if(method.getName().equals(name)) return method.getName();

        }

        return null;
    }


    public Object casting(String name,Object object){

       return null;
    }




    private static Method verify2(String name, Method[] declaredMethods) throws NoSuchMethodException {

        for (Method method : declaredMethods) {

            Method fooMethod = AvancarStatusProjetoCommand.class.getMethod("foo", Integer.class);
            System.out.println(fooMethod);

        }

        return null;
    }
}
