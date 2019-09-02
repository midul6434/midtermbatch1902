package problems;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValueFromaAnArray {
    public static void main(String[] args) {
        int[] value={100,500,450,2,56,78,0,432};
        int maxixmum=value[0];
        for(int i=0;i<value.length;i++){
            if(value[i]>maxixmum){
                maxixmum=value[i];
                System.out.println(maxixmum);
            }
        }
    }

}
