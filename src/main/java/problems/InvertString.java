package problems;

public class InvertString {

    /**
     * Invert a String without using String default reverse() method
     *
     * */


    public static void main(String[] args) {
        String x = "My Name is Midul Talukder";
        char[]b = x.toCharArray();
        int size=b.length;
        char[]a = new char[size];
        int i=0;
        while(i!=size){
            a[size-1-i]=b[i];
            ++i;

        }
        System.out.println(b);
        System.out.println(a);
    }
}
