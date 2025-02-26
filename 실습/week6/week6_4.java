package week6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class week6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = sc.nextLine();

        int startIndex = (int)(Math.random()*s.length());
        String sub = s.substring(startIndex);

        StringTokenizer st = new StringTokenizer(sub);
        int count = 0;
        while(st.hasMoreTokens()){
            st.nextToken();
            count++;
        }

        System.out.printf("startIndex = %d, #words = %d\n", startIndex, count);
        System.out.println(sub);

        sc.close();
    }
}
