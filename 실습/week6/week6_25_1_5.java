package week6;

import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.StringTokenizer;

public class week6_25_1_5 {
    private static final int EXPECTED_TOKEN_NUM = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(">>");
        String s = in.nextLine();
        StringBuffer sb = new StringBuffer(s);

        while(true) {
            System.out.print("명령: ");
            String cmd = in.nextLine();
            if(cmd.equals("그만")) {
                System.out.print("종료합니다");
                break;
            }
            String[] tokens = cmd.split("!");
            if(EXPECTED_TOKEN_NUM != tokens.length) {
                System.out.println("잘못된 명령입니다!");
            }
            else {
                if(0==tokens[0].length() || 0 == tokens[1].length()) {
                    System.out.println("잘못된 명령입니다!");
                    continue;
                }
                int index = sb.indexOf(tokens[0]);
                if(index == -1) {
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                sb.replace(index,index+tokens[0].length(),tokens[1]);
                System.out.println(sb.toString());
            }
        }
        in.close();
    }
}
