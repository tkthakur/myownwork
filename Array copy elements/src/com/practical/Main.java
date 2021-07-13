package com.practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of array elements");
        int arr=s.nextInt();
        int a[]=new int[arr];
        System.out.println("Enter array 1 elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Array 1 elements");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Array 2 elements are");
        int b[]=new int[arr];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];

        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }


    }
}
