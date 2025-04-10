package week1;

import java.util.Scanner;

public class week1_25_1 {
    public static void main(String[] args) {
        String name = "";
        String dept = "";
        int studentId = 0;

        //String add = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        name = scanner.nextLine();

        System.out.print("학과를 입력하세요: ");
        dept = scanner.nextLine();

        System.out.print("학번을 입력하세요: "); //enter까지 치면, enter는 가겨가지 못함. 따라서 enter 남음
        studentId = scanner.nextInt();

        // System.out.print("주소를 입력하세요: "); //enter까지 치면, enter는 가겨가지 못함. 따라서 enter 남음

        //add = scanner.nextLine(); // enter가 남아서, enter입력되고 끝난다.

        System.out.println("이름: " + name);
        System.out.println("학과: " + dept);
        System.out.println("학번: " + studentId);
    }
}
