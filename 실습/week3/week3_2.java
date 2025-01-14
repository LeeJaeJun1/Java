package week3;

import java.util.Scanner;

public class week3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = {};
        intArray = new int[5];
        int sum = 0;

        System.out.print(intArray.length + "개의 정수를 입력하세요: ");
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = sc.nextInt();
            sum += intArray[i];
        }
        System.out.print("평균은 " + (double)sum / intArray.length);
        sc.close();
    }
}
