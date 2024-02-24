package com.company;

public class Break_and_Continue {
    public static void main(String[] args) {
        // Break and Continue using loops!
        for (int i=0; i<50; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("Loop ends here");
    }
}
