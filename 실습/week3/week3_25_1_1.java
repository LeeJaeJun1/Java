package week3;

import java.util.Scanner;

public class week3_25_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] unit = {50000,10000,1000,100,10,1};
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        for(int i = 0; i < unit.length; i++){
            int res = money / unit[i];

            if(res > 0) {
                System.out.println(unit[i] + "원 짜리 : " + res + "개");
                money %= unit[i];
            }
        }
        scanner.close();
    }
}

