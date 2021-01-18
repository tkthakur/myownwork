package com.practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array row and column");
        a=scan.nextInt();
        b=scan.nextInt();
        int[][] arr =new int[a][b];

        System.out.println("Enter array elements");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }

        for(int k=0;k<a;k++)
        {
            for(int l=0;l<b;l++)
            {
                System.out.print(arr[k][l]);
            }
            System.out.println();
        }



    }
}
