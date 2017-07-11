package base.java;

import base.kotlin.Person;
import base.kotlin.StringFunctions;

import java.util.ArrayList;
import java.util.Collections;


public class HelloWorld {
    private Singleton singleton = null;

    public Singleton getSingleton() {
        return singleton;
    }

    public void setSingleton(Singleton singleton) {
        this.singleton = singleton;
    }

    public static void main(String... args) {
        base.kotlin.Person person = new Person("xx");
        person.getAge();


        /**
         * java  kotlin
         */
        char c = StringFunctions.lastChar("Java");


        /*String[] strs = new String[] {"aa", "bb"};
        Object[] objects = strs;
        objects[0] = new Object();


        List<String> strList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();
        objList.addAll(strList);
        // boolean addAll(Collection<? extends E> var1)

        objList = strList;
        objList.add(5);
        String str = strList.get(0);*//*
        Collections.copy(new ArrayList<Object>(), new ArrayList<String>());
*/

        /*try {
            Class<?> aClass = Class.forName("base.java.Singleton");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.getSingleton();
        //System.out.println(Singleton.foo);
        //System.out.println(LazySingleton.foo);
    }


}

