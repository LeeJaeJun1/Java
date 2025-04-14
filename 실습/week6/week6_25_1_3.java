package week6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class week6_25_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


            /*
             int count = 0;
            System.out.print(">>");
            StringTokenizer st = new StringTokenizer(in.nextLine()," ");

            while(st.hasMoreTokens()) {
                count += 1;
                if(st.nextToken().equals("그만")) {
                    System.out.println("종료합니다...");
                    return;
                }
            }

            System.out.print(">>");
            System.out.println("어절 개수는 " + count);
             */
        while(true) {
            System.out.print(">>");
            String s = in.nextLine();
            if(s.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(s, " ");
            System.out.println("어절 개수는 " + st.countTokens());
        }
        in.close();
    }
}
