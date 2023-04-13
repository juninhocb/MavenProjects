package com.example.quickstart;
import com.second.example.MyClass;

/**
 * Maven Project!
 *
 */
public class App 
{
    /**
     * Get access from success message
     *
     */
    public static void getAccessToMyOtherProject (){
        System.out.println("Success");
    }
    /**
     * Print formatted
     *
     */
    public static void printParamFormatted(String str){
        System.out.println("Formatted: " + str);
    }

    /**
     * Print Test
     */
    public static void javaDoc(){
        MyClass.myClassMethod();
        System.out.println("Test");
    }

}
