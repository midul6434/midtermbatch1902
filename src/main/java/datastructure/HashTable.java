package datastructure;


import java.util.Hashtable;

/**
 * SHow your understanding on HashTable
 * Use some methods from HashTable Class
 * */

class Hash{
    public static void main(String[] args) {
        result();

    }

    private static void result() {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("Midul",90);
        hashtable.put("Rahul",89);
        hashtable.put("joy",88);
        hashtable.put("Apurbo",65);
        hashtable.put("unknown",33);
        //System.out.println(hashtable);
        Hashtable<String,Integer> hashtable1 = (Hashtable<String, Integer>) hashtable.clone();

    hashtable.clear();

        System.out.println(hashtable1);
        System.out.println(hashtable);

        System.out.println(hashtable1.containsKey("Midul"));



    }


}


