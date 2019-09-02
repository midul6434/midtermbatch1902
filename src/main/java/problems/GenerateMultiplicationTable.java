package problems;

import java.util.Scanner;

public class GenerateMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number please");
        int n = scanner.nextInt();
        for (int i=1;i<11;i++){
            int multiplication=i*n;
            System.out.println(n+"*"+i+" = "+multiplication);
        }












            }
}
