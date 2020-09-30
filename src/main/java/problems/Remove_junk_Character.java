package problems;
/*How to Remove Junk/Special Characters in a String by using Regular Expression: -Remove special chars/Chinese/Japanese chars from a String.
We use this Regular Expression: [^a-zA-Z0-9] to remove the Junk Characters from a String.
*
* */

public class Remove_junk_Character {
    public static void main(String[] args) {
        String x= "調子どう joy String 01234";
        String x1=" midul 23455656 مجھے چھٹی چاہئے";

        x=x.replaceAll("[^a-zA-z0-9]","");
        x1=x1.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(x);
        System.out.println(x1);
    }


}
