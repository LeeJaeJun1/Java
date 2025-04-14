package week6;

import java.util.Scanner;

public class week6_25_1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String s = in.nextLine();
            if(s.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            String[] words = s.split(" ");
            System.out.println("어절 개수는" + words.length);
        }
        in.close();
    }

}
