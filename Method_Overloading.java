package com.company;

public class Method_Overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning" + a + " bro!" );
    }
    static void change(int a){
        a=98;
    }
    static void change2(int []arr){
        arr[0]=98;
    }
        static void tellJoke(){
            System.out.println("I invented a new word!\n" + "Plagiarism!");
        }

        public static void main(String[] args) {
          //  tellJoke();

            // Case1: Changing the Integer
             int x = 45;
             change(x);
             System.out.println("The value of x after running change is - "+x);

            // Case1: Changing the Array
             int [] marks = {52, 73, 77, 89, 94 };
             change2(marks);
             System.out.println("The value of x after running change is - "+ marks[0]);

            // Method Overloading
            foo();
            foo(3000);

    }
}