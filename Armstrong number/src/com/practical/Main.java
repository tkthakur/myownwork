package com.practical;

import java.util.Scanner;

public class Main {

    public int armstrong(int x)
    { int a,c=0,temp;
       temp=x;
        while(x>0){
            a=x%10;
            x=x/10;
            c=c+(a*a*a);
        }
        System.out.println(c);

        if(temp==c){
            System.out.println("Armstrong no");}
        else {System.out.println("Not an Armstrong no");}
        return c;
    }



    public static void main(String[] args) {

        System.out.println("Enter no to check");
        Scanner scan=new Scanner(System.in);
        int no=scan.nextInt();

        Main m=new Main();
        m.armstrong(no);
    }
}
