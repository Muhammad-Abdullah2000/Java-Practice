package com.Even_Numbers;
import java.util.Scanner;
public class Login_Module {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String Email,password,password1,Email1;


        System.out.println("Enter your E-mail");
        Email = str.nextLine();
        System.out.println("Enter your password");
        password = str.nextLine();
        System.out.println("Enter your Email to re-conform");
        Email1 = str.nextLine();
        System.out.println("Enter your password to re-confirm");
        password1 = str.nextLine();

        if(password == password1){

            System.out.println("you Logged in successfully");
        }
        else{

            System.out.println("Try again");
        }
    }
}
