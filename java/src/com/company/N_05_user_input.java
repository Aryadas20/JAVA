package com.company;
import java.util.Scanner;

public class N_05_user_input {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1");

        String str = sc.nextLine();
        System.out.println(str);

    }
}

