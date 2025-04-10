package week3;

import java.util.Scanner;

public class week3_25_1_3 {

    public static boolean check(int n[], int size, int m) {
        for(int i = 0; i < size; i++) {
            if(n[i] == m)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇 개 저장하시겠습니까>>");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                int m = (int) (Math.random() * 101);

                boolean dup = check(arr, i, m);
                if (dup == false) {
                    arr[i] = m;
                    break;
                }
            }
        }
        int sum = 0;
        System.out.print("랜덤한 정수들...");
        for(int k : arr) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println();
        System.out.println("평균은 " + ((double) sum) / arr.length);
    }
}
