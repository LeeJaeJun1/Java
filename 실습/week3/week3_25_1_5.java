package week3;

import java.util.Scanner;

public class week3_25_1_5 {
    public static boolean isValid(String choice) {
        if(choice.equals("가위") || choice.equals("바위") || choice.equals("보")) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String choice[] = {"가위", "바위", "보"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while (true) {
            System.out.print("가위 바위 보!>>");
            String user = scanner.nextLine();

            if(user.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            if(!isValid(user)) {
                System.out.println("다시 하세요.");
                continue;
            }

            int n = (int) (Math.random() * 3);
            String computer = choice[n];

            System.out.print("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", ");

            if (user.equals(computer)) {
                System.out.println("비겼습니다");
            } else if (
                    (user.equals("가위") && computer.equals("보")) || (user.equals("바위") && computer.equals("가위"))
                            || (user.equals("보") && computer.equals("주먹"))) {
                System.out.println("사용자가 이겼습니다.");
            } else {
                System.out.println("컴퓨터가 이겼습니다.");
            }
        }
        scanner.close();
    }
}

