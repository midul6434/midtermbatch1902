package problems;

public class FindFactorials {
    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     * */

    public static void main(String[] args) {
midul(4);
    }
public static void midul (int n){
     int    fact = 1;
     for(int i=1;i<=n;i++){
         fact=fact*i;
         System.out.println("the factorial num " + i +" is "+ fact);
     }


}



}
