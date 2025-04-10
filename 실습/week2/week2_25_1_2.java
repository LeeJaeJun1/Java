package week2;

import java.util.Scanner;

public class week2_25_1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");

        int x = input.nextInt();
        int y = input.nextInt();

        if(x>=100 && x<=200 && y>=100 && y<=200) {
            System.out.println("("+ x + "," + y + ")는 사각형 안에 있습니다." );
        }
        else{
            System.out.println("("+ x + "," + y + ")는 사각형 안에 없습니다." );
        }
    }
}
