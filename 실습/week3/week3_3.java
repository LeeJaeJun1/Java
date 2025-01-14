package week3;
import java.util.Scanner;

public class week3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        String s;

        do{
            System.out.print("> ");
            s = sc.nextLine();
            System.out.println(s);
        }while(!s.equals("q"));

        System.out.println();
        System.out.print("프로그램 종료");
        sc.close();
    }
}
