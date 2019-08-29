package problems;

import java.util.*;

public class FindDuplicates {

    /**
     * Write Code To Filter Duplicate Elements From An Array?
     * */


    public static void main(String[] args) {
        int [] arry = {1,2,2,2,3,4,5,5,6,7,8,9,};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i =0; i<arry.length;i++){
            if(hashMap.containsKey(arry[i])) {
                hashMap.put(arry[i], hashMap.get(arry[i]) + 1);
            }
            else {
                hashMap.put(arry[i],1);
            }
        }
        Set<Map.Entry<Integer, Integer>> set=hashMap.entrySet();
        for(Map.Entry<Integer,Integer> in:set){
            if (in.getValue()>1){
                System.out.println(in.getValue());
            }
        }



        }




    }


