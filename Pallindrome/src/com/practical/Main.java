package com.practical;

import java.util.Scanner;

public class Main {

    

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner s=new Scanner(System.in);
        int no=s.nextInt();
        int reversed=0;
        while(no!=0){

            int a=no%10;
            reversed=reversed*10+a;
            no=no/10;
        }
        System.out.println(reversed);

    }
}
