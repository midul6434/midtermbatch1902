package problems;

public class Reverse_String {
    public static void main(String[] args) {
        String s ="Midul Talukder";

        //USING loop
        int length=s.length();
        String rev=" ";
        for (int i =length-1;i>=0;i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);


   // Using String buffer
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());






    }
}
