package com.practicebasic;

import java.util.Scanner;

public class Main {
    public void fib()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no of series for fibonacci series");
       int a= scan.nextInt();
        int b=0,c=1,d;
        System.out.println(b+" "+c);
        for(int i=0;i<=a;i++){
            d=b+c;
            System.out.print(d+" ");
            b=c;
            c=d;

        }

    }

    public static void main(String[] args) {
	Main m=new Main();
	m.fib();
    }
}
