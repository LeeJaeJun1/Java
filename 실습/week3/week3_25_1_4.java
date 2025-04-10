package week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class week3_25_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("곱하고자 하는 두 수 입력>>");

            try {
                int input1 = scanner.nextInt();
                int input2 = scanner.nextInt();
                System.out.println(input1 + "x" + input2 + "=" + input1 * input2);
                break;
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다.");
                String s = scanner.nextLine();
                continue;
            }
        } while (true);

        scanner.close();
    }
}
