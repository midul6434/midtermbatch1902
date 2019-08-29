package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a function to find fibonacciSerie of 100
 * */
public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(100);
    }

    private static void fibonacciSeries(int n) {
       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Write the number to get the fibonacci number");
        //int f = scanner.nextInt();
        int  a, b;
        a = 1;
        b = 1;
        System.out.print("1 1 ");
        while (n <= 100) {

            n=a+b;
             a=b;
            b=n;
            System.out.print(n + " ");


            }

        }
    }

