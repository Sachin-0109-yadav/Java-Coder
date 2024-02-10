package com.company;

import java.util.Scanner;

public class User_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", have a good day!");
    }
}