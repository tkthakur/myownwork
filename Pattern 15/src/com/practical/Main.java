package com.practical;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<=5; j++) {

                while(i!=1||i!=5)
                { if(j>1&&j<5)
                    System.out.print(" ");
                else
                    System.out.print("*");
                    break;
                }

            }
            System.out.println();

        }
    }
}
