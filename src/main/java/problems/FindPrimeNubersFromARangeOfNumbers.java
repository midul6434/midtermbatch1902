package problems;

import java.util.Scanner;

public class FindPrimeNubersFromARangeOfNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Number please");
            int n =scanner.nextInt();
            if (Tohard(n)){
                System.out.println(n+"this is a prime Number");
            }
            else{
                System.out.println(n + " "+" this is not a prime number" );
            }

        }

        public static boolean Tohard(int n){
            if ( n <= 1) {
                return false;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n % i==0){
                    return false;
                }
            }

            return true;
        }




    }





