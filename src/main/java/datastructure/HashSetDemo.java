package datastructure;

import db.DbConnection;
import sun.jvm.hotspot.utilities.Hashtable;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class HashSetDemo {


    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     */
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        hashcode();
    }

    public static void hashcode() throws SQLException, IOException, ClassNotFoundException {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Midul");
        hashSet.add("Joy");
        hashSet.add("Rahul");
        hashSet.add("Nayem");
        hashSet.add("Apurbo");
        hashSet.add("Prianka");
        System.out.println(hashSet);
        hashSet.remove("Joy");
        for (int i = 0; i < hashSet.size(); i++) ;
        System.out.println(hashSet);
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


            /*DbConnection dbConnection = new DbConnection();
            dbConnection.connectMySql();
            dbConnection.insertDataFromArrayListToMySql((List<String>) hashSet, "Studentname", "none");
            List<String> obj = dbConnection.readDatabase("Studentname", "none");
            for (String str : obj) {
                System.out.println(str);
                ;

        }*/
        }
    }
}


