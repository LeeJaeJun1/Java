package week3;

import java.util.Scanner;

public class week3_5 {
    public static int[][] makeArray() {
        Scanner sc = new Scanner(System.in);
        int [][] temp = new int[3][];
        temp[0] = new int[3];
        temp[1] = new int[1];
        temp[2] = new int[4];

        System.out.println("정수 8개를 입력하세요");
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[i].length; j++){
                temp[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return temp;
    }
    public static void main(String[] args) {

        int [][] m = makeArray();
        System.out.println();
        for(int[] row : m) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
