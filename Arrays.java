package com.company;

public class Arrays {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays(recommended)
         */
      // There are three main ways to create an array in Java
      // 1. Declaration and memory allocation
      //int []marks= new int[5];
      // 2. Declaration and memory allocation
        int [] marks;
        marks = new int[5];
        // Initialization
        marks[0]=100;
        marks[1]=60;
        marks[2]=70;
        marks[3]=98;
        marks[4]=65;
      //marks[5]=89;
        System.out.println(marks[3]);
    }
}
