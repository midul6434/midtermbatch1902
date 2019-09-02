package problems;

public class Palindrome {
    public static void main(String[] args) {
        joy();
        midul();
    }

    /**
     * If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
     * Palindrome. So write java code to check if a given String is Palindrome or not.
     **/

    public static void midul() {
        String x = "MOM";
        char[] y = x.toCharArray();
        int z = y.length;
        char[] a = new char[z];

        int i = 0;
        while (i != z) {
            a[z - 1 - i] = y[i];
            ++i;
        }
        i = 0;
        while (i != z) {
            if (a[i] != y[i]) {
                System.out.println("This is not a palidrome");
                System.exit(0);
            } else {
                ++i;
            }
        }
        System.out.println("This is palidrome");
    }

    public static void joy() {

        String x = "MADAM";
        char[] b = x.toCharArray();
        int size = b.length;
        char[] y = new char[size];
        int i = 0;
        while (i != size) {
            y[size - 1 - i] = b[i];
            ++i;
        }

        i = 0;
        while (i != size) {
            if (b[i] != y[i]) {
                System.out.print("This is not the palindrome");
                System.exit(0);


            } else {
                ++i;

            }
            System.out.print("Palindrome");
            System.exit(0);

        }
    }
}






