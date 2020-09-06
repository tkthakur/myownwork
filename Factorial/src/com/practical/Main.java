package com.practical;

import java.util.Scanner;

public class Main {

    public int fact(int a) {
        int fact =1;
        while(a!=0){
        fact = a * fact;
        a--;
        }
        System.out.println(fact);
        return fact;
      }
    public static void main(String[] args) {
        System.out.println("Enter no for factorial");
        Scanner scan=new Scanner(System.in);
        int no=scan.nextInt();

	Main m=new Main();
	m.fact(no);
    }
}
