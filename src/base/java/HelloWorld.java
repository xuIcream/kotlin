package base.java;

import base.kotlin.Person;
import base.kotlin.StringFunctions;

import java.util.ArrayList;
import java.util.Collections;


public class HelloWorld {

    public static void main(String... args) {
        System.out.println("vvvvvv");
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
*/

        Collections.copy(new ArrayList<Object>(), new ArrayList<String>());
    }


}

