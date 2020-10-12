package com.practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter no of array elements");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr =new int[a];

        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println("Enter n");
        int n=s.nextInt();


        for(int i=0;i<n;i++)
        {
            int j,first;
            first=arr[0];
            for(j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
