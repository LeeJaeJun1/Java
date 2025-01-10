package week2;

import java.util.Scanner;

public class week2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.println(age + " " + name);

        scanner.close();
    }
}
