package week2;

import java.util.Scanner;

public class week2_25_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        String c = input.nextLine();
        System.out.print("영희 >> ");
        String d = input.nextLine();

        if(c.equals("가위")) {
            if(d.equals("가위")) {
                System.out.println("비겼습니다.");
            }
            else if(d.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            }
            else{
                System.out.println("철수가 이겼습니다.");
            }
        }
        else if(c.equals("바위")) {
            if(d.equals("가위")) {
                System.out.println("철수가 이겼습니다.");
            }
            else if(d.equals("바위")) {
                System.out.println("비겼습니다.");
            }
            else{
                System.out.println("영희가 이겼습니다.");
            }
        }
        else{ // 철수 보 일 때
            if(d.equals("가위")) {
                System.out.println("영희가 이겼습니다.");
            }
            else if(d.equals("바위")) {
                System.out.println("철수가 이겼습니다.");
            }
            else{
                System.out.println("비겼습니다.");
            }
        }
        input.close();
    }
}
