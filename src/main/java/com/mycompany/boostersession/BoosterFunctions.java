/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boostersession;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class BoosterFunctions {
    //Global declararion
    static int count = 0;
    
    //Create function here
    public static void methodOne(){
        System.out.println("Printing from method One");
        while(count < 10){
            System.out.println(count);        }
    }
    public static void main(String[] args) {
        //Create an object of the scanner
        Scanner sc = new Scanner(System.in);

        //Declaration and prompt
        System.out.print("Enter a number: "); 
        int num = sc.nextInt();
        System.out.print("Enter your name: ");
        String name = sc.next();
        
        int l = count + 8;

//Call your functions here
        
        //Calling a void function
        /*methodThree();
        methodOne();
        methodTwo(num, name);
        methodTwo(18, "Resego");
        methodTwo(21, "Faith");*/
        countNumber();
    }
    //|Or create your function here
    
    public static void methodTwo(int a, String name){
        System.out.println("Number : " + a);
        System.out.println("Name: " + name);
    }
    
    public static void methodThree(){
        methodOne();
        System.out.println("Print from method Three");
    }
    
    public static void countNumber(){
        int count = 1;
        while(count < 5){
            
            System.out.println(count);
            count++;
        }
    }
}
