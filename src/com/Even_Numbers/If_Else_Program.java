package com.Even_Numbers;
import java.util.Scanner;
public class If_Else_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password ;

        System.out.println("Enter Your password");
        password = input.nextInt();

        if(password == 123){
            int num;
            System.out.println("Welcome to the program");
            System.out.println("Enter your number");
            num = input.nextInt();
            if(num%2 == 0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }

        }
        else{
            System.out.println("try again");
        }
    }
}
