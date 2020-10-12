package com.practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter no of array elements");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr =new int[a];
        int[] rev=new int[a];

        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            rev[i]=arr[a-(i+1)];

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(rev[i]+" ");
        }

    }
}
