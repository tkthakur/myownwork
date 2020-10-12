package com.practical;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        int i,d;
        d=0;
        int[] arr= {800, 500, 400, 300 }  ;
        int[] arr1= {600, 350 };   	 	int max=arr[0];  	 	int max1=arr1[0];  	 	float pipeline=0;  	 	float pipeline1=0;  	 	float t1,t2,ti;
        Scanner scan= new Scanner(System.in);
        for(i=0;i<4;i++)
        {
            if(arr[i] > max)     	 	 	{
                max = arr[i];
            }     	 	}
        pipeline=max+d;              t1=(1/pipeline);
        System.out.print("Execution Time in 4 Stage Pipeline: "+pipeline);            System.out.print("\nThroughput in 4 Stage Pipeline: "+t1);            for(i=0;i<2;i++)
        {
            if(arr1[i] > max1)
            {
                max1 = arr1[i];
            }
        }
        pipeline1=max1+d;              t2=(1/pipeline1);
        System.out.print("\nExecution Time in 2 Stage Pipeline: "+pipeline1);            System.out.print("\nThroughput in 2 Stage Pipeline: "+t2);            ti=((t2-t1)/t1)*100;
        System.out.print("\nThroughput Increase: "+ti+"%");

    }
}
