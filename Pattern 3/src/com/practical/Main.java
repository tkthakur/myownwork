package com.practical;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {  System.out.print("*");}

            System.out.println();

        }
        for(int i=1;i<=4;i++)
        {
            for (int j=4;j>=i;j--)
            {  System.out.print("*");}

            System.out.println();

        }
    }
}
