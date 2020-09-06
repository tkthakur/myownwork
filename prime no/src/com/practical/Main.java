package com.practical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter no");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a == 1 || a == 0)
            System.out.println("not a prime no");
        if(a==3)
        {
            System.out.println("Prime no");
        }
        int n = a / 2;

        for (int i = 2; i <= n; i++) {
            if (a%i == 0) {
                System.out.println("not a prime no");
                break;
            }
            else
            {System.out.println("Prime no");
            break;
            }
        }


    }}