package com.company;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many no. you wanna print ");
        int num = input.nextInt();
//        for (int i = 0 ; i <= num ; i= i+3) {
//            System.out.println("Ankur");
////            System.out.print(i + "  ");
            
//        }
        int i = 1;
        while ( i <= num){
            System.out.println("hello world");
            i = i+2;

        }
    }
    
}
