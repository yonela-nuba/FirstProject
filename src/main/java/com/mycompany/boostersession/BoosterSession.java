/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boostersession;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class BoosterSession {

    public static void main(String[] args) {
        /*for(int i = 0; i <5; i++){ //Rows
            //System.out.println(i);
            for(int j = 0; j < 5; j++){//Columns
                System.out.print(i + " " + j);
            }
            System.out.println();
        }
        int count = 1;
        while(count < 10){
            System.out.println(count);
            count++; // count = count + 1; count += 1;
        }
        
       //Create an object of the Scanner
       Scanner scv = new Scanner(System.in);
       
       //prompt the user to enter a number and Zero to exit
        System.out.print("Enter a number: ");
        int num = scv.nextInt();
        
        while(num == 0){
            System.out.println("Added : " + num);
            
            System.out.print("Enter a number: ");
            num = scv.nextInt();
        }
        //Create an object of the Scanner
       Scanner scv = new Scanner(System.in);
       
       //Declaration
       String username = "yonelanuba";
       String password = "classbib1";     
       
       int attempt = 0;
       
       //Prompt the user to enter details
        System.out.print("Enter your user name: ");
        String user = scv.next();
        System.out.print("Enter your password: ");
        String pass = scv.next();
       
       while(attempt < 2){
           if(user.equals(username) && pass.equals(password)){
               System.out.println("Welcome " + username);
               break;
           }
           else{
               System.out.println("Incorrect details try again");
               
               attempt++;
           }
            System.out.print("Enter your user name: ");
            user = scv.next();
            System.out.print("Enter your password: ");
            pass = scv.next();
           
       }*/
        int count = 10;
        do{
            System.out.println("Printing from Do While ");
            System.out.println(count);
            count++;
        }
        while(count < 5);
        
        
        
        
        System.out.println("Printing inside the While loop");
        while(count < 5){
            
            System.out.println(count);
            count++;
        }

        
        
    }
}
