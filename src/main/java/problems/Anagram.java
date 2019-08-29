package problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
   String anagram ="MARY";
   String anagram2="ARMY";
   char [] x = anagram.toCharArray();
   char[] y = anagram2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        boolean result = Arrays.equals(x,y);
        if(result == true){
            System.out.println("This is anagram");
        }
        else {
            System.out.println("This is not an a anagram");
        }
















    }
}
