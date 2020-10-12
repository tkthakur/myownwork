package com.practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter no of array elements");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr =new int[a];

        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]);
        }
    }
}
