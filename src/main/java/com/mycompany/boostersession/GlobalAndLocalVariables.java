/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boostersession;

/**
 *
 * @author RC_Student_lab
 */
public class GlobalAndLocalVariables {
    //Global Declaration
    static int a = 5, b = 10;
    
    
    public static void main(String[] args) {
        int b = a + 5;
        System.out.println(" B inside main = "+b);
        method();
    }
    
    
    public static void method(){
        int a = 2;
        int b = 12;
        System.out.println("A inside method = " + a);
        System.out.println("B inside method = " + b);
    }
}
