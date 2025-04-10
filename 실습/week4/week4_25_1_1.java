package week4;

class ArrayUtil {
    public static int[] contact(int [] a, int [] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for(int k = 0; k < b.length; k++) {
            int index = a.length + k;
            c[index] = b[k];
        }
        return c;
    }
    public static void print(int [] d) {
        System.out.print("[ ");
        for(int it : d) {
            System.out.print(it + " ");
        }
        System.out.println("]");
    }
}

public class week4_25_1_1 {
    public static void main(String[] args) {
        int [] array1 = {1,5,7,9};
        int [] array2 = {3,6,-1,100,77};
        int [] array3 = ArrayUtil.contact(array1,array2);
        ArrayUtil.print(array3);
    }
}
