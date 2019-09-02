package datastructure;

import db.DbConnection;

import java.util.*;

/**
 * @author Jahidul Islam
 * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
 * Store map in DB
 *
 * */

public class MapDemo {
    public static void main(String[] args) {
        price();
    }

    public static void price() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Car","Honda");
        hashMap.put("Model","Accord");
        hashMap.put("Cylinder","Six");
        hashMap.put("Year","2019");
        hashMap.put("Price","39000");
        System.out.println(hashMap);
        hashMap.replace("Price","39000","44000");

            System.out.println(hashMap);

        //Collections.sort();
     //   System.out.println();
        //List list = new ArrayList();
        //list = (List) hashMap;






        }

    }



