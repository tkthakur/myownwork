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

        int largest ,smallest;
        largest=arr[0];
        for(int i=1;i<a-1;i++)
        {
            if(arr[i]>largest)
                largest=arr[i];
        }
        System.out.println("LArgest="+largest);



        smallest=arr[0];
        for(int i=1;i<a-1;i++)
        {
            if(arr[i]<smallest)
                smallest=arr[i];
        }
        System.out.println("Smallest="+smallest);

    }
}
