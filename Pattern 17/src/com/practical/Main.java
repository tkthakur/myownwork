package com.practical;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k = 1; k < i; k++) {
                if(i==5){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");}
            }
            for (int l = 2; l < i; l++) {
                if(i==5)
                    System.out.print("*");
                else
                System.out.print(" ");

            }
            while(i!=1)
            {
                System.out.print("*");
                break;
            }




            System.out.println();


        }
    }
}
