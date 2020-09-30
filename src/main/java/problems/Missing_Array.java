package problems;

public class Missing_Array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,11};
        int x=0;
        for(int i=0;i<a.length;i++){
            x= x+ a[i];

        }
        System.out.println(x);
        int y=0;
        for(int j=1;j<=11;j++){
            y=y + j;
        }
        System.out.println(y);
        System.out.println("The missing Number is " + (y-x));

    }
}
