package com.mavenproject;

import com.second.example.MyClass;

import java.awt.*;
import java.lang.reflect.Field;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnotherClass another = new AnotherClass(3);
        Field[] variables = another.getClass().getDeclaredFields();

        for (Field field : variables){
            System.out.println("Field name: " + field.getName());
        }

        MyClass.myClassMethod();
        com.example.quickstart.App.getAccessToMyOtherProject();
        com.example.quickstart.App.javaDoc();
        com.example.quickstart.App.printParamFormatted("test");


    }
}
