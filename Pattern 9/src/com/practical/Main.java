package com.practical;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {  System.out.print(" ");}

            for(int k=4;k>=i;k--)
            {
                System.out.print("*");
            }
            for(int l=3;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}