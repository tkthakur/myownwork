package com.practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter no of array elements");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] arr = new int[a];

        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int j,visited=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            for(j=i+1;j<arr.length-1;j++)
            {
                if(arr[j]==arr[i])
                    System.out.println(arr[j]);

            }

        }


    }
}
