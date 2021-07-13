package com.practical;

import java.util.Scanner;

public class Main {



    int[][] add(int[][] x, int[][] y,int[][] z) {
        if (x.length != y.length || x[0].length != y[0].length)
            System.out.println("Matrices cannot be added");
        else {
            for (int k = 0; k < x.length; k++) {
                for (int l = 0; l < y.length; l++) {
                    z[k][l] = x[k][l] + y[k][l];
                    System.out.print(z[k][l] + " ");
                }
                System.out.println();
            }

        }
        return z;
    }

    int[][] sub(int[][] x, int[][] y,int[][] z)
    {    if(x.length!=y.length||x[0].length!=y[0].length)
        System.out.println("Matricess cannot be subtracted");

        else{
        for(int k=0;k<x.length;k++)
        {
            for(int l=0;l<y.length;l++)
            {
                z[k][l]=x[k][l]-y[k][l];
                System.out.print(z[k][l]+" ");
            }
            System.out.println();
        }

    }
        return z;
    }

        void compare(int[][] x, int[][] y)
    {   boolean flag=true;
        if(x.length!=y.length||x[0].length!=y[0].length)
            System.out.println("Matrices are not equal");

        else
        {

        for(int k=0;k<x.length;k++)
        {
            for(int l=0;l<y.length;l++)
            {
                if(x[k][l]!=y[k][l])
                {flag=false;
                break;
                }
            }

    }
        if(flag)
        {
            System.out.println("Matrices are equal");

        }
        else
            System.out.println("Matrices are not equal");
        }

    }

    void lower_triangular_matrix(int[][] x){
        System.out.println("Lower triangular matrix of ARRAY 1");
        for(int k=0;k<x.length;k++)
        {
            for(int l=0;l<=k;l++)
            {
                System.out.print(x[k][l]);
            }
            System.out.println();
        }

    }
    void upper_triangular_matrix(int[][] x){
        System.out.println("Upper triangular matrix of ARRAY 1");
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

        for(int k=x.length-1;k>=i;k--)
        {

                System.out.print(x[i][k]);
            }
            System.out.println();
        }

    }

    void freq_odd_even(int[][] x){

        int count=0,countodd=0;
        for(int k=0;k<x.length;k++)
        {
            for(int l=0;l<x[0].length;l++)
            {

                if(x[k][l]%2==0)
                    count++;

                if(x[k][l]%2!=0)
                    countodd++;


            }

            System.out.println();
        }
        System.out.println("Number of even numbers are "+count);
        System.out.println("Number of odd numbers are "+countodd);
    }

    void sum_0f_row_col(int[][] x){

        int sumrow=0,sumcol=0;

        for(int k=0;k<x.length;k++)
        {

            for(int l=0;l<x[0].length;l++)
            {
                sumrow=sumrow+x[k][l];

            }
            System.out.println("Sum of row "+k+" is "+sumrow);

            System.out.println();
        }

        for(int l=0;l<x[0].length;l++)
        {

            for(int k=0;k<x.length;k++)
            {
                sumcol=sumcol+x[k][l];

            }
            System.out.println("Sum of column "+l+"is "+sumcol);

            System.out.println();
        }

    }

    void mul(int[][] x,int[][] y,int[][] z) {

        if(x.length!=y[0].length)
            System.out.println("Matrices cannot be multiplied");
        else{
            for(int i=0;i<x.length;i++)
            {
                for(int j=0;j<y[0].length;j++)
                {
                    z[i][j]=0;

                    for(int k=0;k<z.length;k++)
                    {
                        z[i][j]+=x[i][k]*y[k][i];
                    }
                }

            }
            System.out.println("Multiplication of matrices is");
            for(int i=0;i<x.length;i++)
            {
                for(int j=0;j<y[0].length;j++)
                {
                    System.out.print(z[i][j]+" ");}

                System.out.println(" ");
            }


    }
    }



    public static void main(String[] args) {
	// write your code here
        int row1,row2,col1,col2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st array row and column");
        row1=scan.nextInt();
        col1=scan.nextInt();
        System.out.println("Enter 2nd array row and column");
        row2=scan.nextInt();
        col2=scan.nextInt();
        int[][] arr1 =new int[row1][col1];
        int[][] arr2 =new int[row2][col2];
        int[][] arr3 =new int[row2][col2];

        System.out.println("Enter array 1 elements");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                arr1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter array 2 elements");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                arr2[i][j]=scan.nextInt();
            }
        }
        System.out.println("ARRAY 1");
        for(int k=0;k<row1;k++)
        {
            for(int l=0;l<col1;l++)
            {
                System.out.print(arr1[k][l]);
            }
            System.out.println();
        }

        System.out.println("ARRAY 2");
        for(int k=0;k<row2;k++)
        {
            for(int l=0;l<col2;l++)
            {
                System.out.print(arr2[k][l]);
            }
            System.out.println();
        }

        Main m=new Main();
        System.out.println("Addition of both");
        m.add(arr1,arr2,arr3);
        System.out.println("Subtraction of both");
        m.sub(arr1,arr2,arr3);
        m.compare(arr1,arr2);
        m.lower_triangular_matrix(arr1);
        m.upper_triangular_matrix(arr1);
        m.freq_odd_even(arr1);
        m.sum_0f_row_col(arr1);
        m.mul(arr1,arr2,arr3);

      /*  for(int k=0;k<row2;k++)
        {
            for(int l=0;l<col2;l++)
            {
                arr3[k][l]=arr1[k][l]+arr2[k][l];
                System.out.print(arr3[k][l]+" ");
            }
            System.out.println();
        }*/

    }
}
