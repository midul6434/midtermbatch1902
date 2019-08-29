package problems;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

      String   st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
    String[] stairway = st.split(" ");
    HashMap<String,Integer> map = new HashMap<>();
    for(String str : stairway) {
        if (map.containsKey(str)) {
            map.put(str, map.get(str)+1);
        } else {
            map.put(str, 1);
        }
      //  System.out.println(map);


        }
        Set<String> set = map.keySet();
        for (String std : set) {
            System.out.println(" Word ;" +std + " Repeted " + map.get(std) + " times");
    }
    }


    }

