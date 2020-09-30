package problems;
/*
*How to Reverse an Integer :
Java reverse an int value - Pseudocode:
Let's say number = 12345
a. Extract the rightmost digit of your input number. (12345 % 10) = 5
b. Take that digit (5) and add it into a new reversedNum.
c. Multiply reversedNum by 10 (5 * 10) = 50, this exposes a zero to the right of your (5). d. Divide the input by 10, (removing the rightmost digit). (12345 / 10) = 1234
e. Repeat at step a with 1234
*
* */

public class Reverse_Integer {
    public static void main(String[] args) {


        long x = 123456;
        long y = 0;
    while (x!=0){
        y=    y*10   +   x % 10;
        x=x/10;


    }
        System.out.print(y);
    }
}