package com.practical;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k = 4; k > i; k--) {
                if(i==1)
                {
                    System.out.print("*");
                }else
                System.out.print(" ");
            }
            for (int l = 5; l > i; l--) {
                if(i==1)
                {
                    System.out.print("*");
                }
                else
                System.out.print(" ");

            }
            while(i<5) {
                System.out.print("*");
                break;
            }

            System.out.println();
        }
    }
}
