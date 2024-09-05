/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boostersession;

/**
 *
 * @author RC_Student_lab
 */
public class ValueReturningMethods {
        static int a = 4;
        static int b = 6;
    public static int methodOne(){
        
        //int sum = a + b;
       
        return a + b;        
    }
    public static int product(){
        return a * b;
    }
    
    public static void main(String[] args) {
        //Calling a value returning method
        
        System.out.println(methodOne());
        int l = 10;
        int x = l * 2;
        //Manipulating a value returned by our function
        int i = 2 * methodOne();
        System.out.println("Manipulated value : " + i);
        
        System.out.println("Product = " + product());
    }
    
}
