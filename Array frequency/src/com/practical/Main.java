package com.practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter no of array elements");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];

        int fr[]=new int[a];
        int v=-1;

        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        for(int k=0;k<arr.length;k++)
        { int count=1;
            for(int l=k+1;l<arr.length;l++)
            {
                if(arr[k]==arr[l])
                {   count++;
               fr[l]=v;
                    }

        }
            if(fr[k]!=v)
            fr[k]=count;


        }
        for(int i=0;i<arr.length;i++)
            if(fr[i]!=v)
        System.out.println(arr[i]+"repeated"+fr[i]+"times");

    }
}
