package com.example.demo_Jenkins;

import com.example.demo_Jenkins.model.Hello;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Hello obj = new Hello();
        
        obj.showMessage("Hello This is ankit!!!!!");
    }
}
