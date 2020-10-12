package com.practical;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=1;i<=8;i++) {

            for (int j = 1; j<=5; j++) {
                if((i==2||i==3||i==4||i==6||i==7||i==8)&&(j==2||j==3||j==4))
                {
                    System.out.print(" ");
                }

                else
                    System.out.print("*");

            }
            System.out.println();

        }
    }
}
