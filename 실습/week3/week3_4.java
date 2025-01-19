package week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class week3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];
        System.out.println("정수 6개를 하나씩 입력하세요");
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print("> ");
                try{
                    arr[i][j] = sc.nextInt();
                }
                catch (InputMismatchException e){
                    System.out.println("정수가 아닙니다. 다시 입력하세요!");
                    sc.nextLine();
                    j--;
                }
            }
        }
        System.out.println();
        for(int a = 0; a < arr.length; a++){
            for(int b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }

        /*
        for(int[] row : arr) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
         */

        sc.close();
    }
}
