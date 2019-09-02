package problems;

import java.util.Scanner;

public class FindLeapyear {

    /**2
     * All leap years are divisible by 4 except century years are divisible by 4 and 400
     * If century years are divisible by 4 but not divisible by 400 that will not be leap year
     *
     * */
    public static void main(String[] args) {
        findLeapyear(55);
    }



    private static void findLeapyear(int year) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
       year =scanner.nextInt();
        if(year%4==0) {
            System.out.println("The year is Leap year");

        }  else
            {
                System.out.println("This year is not leap year");


        }
    }
}
