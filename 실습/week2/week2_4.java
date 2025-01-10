package week2;
import java.util.Scanner;

public class week2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double r = scanner.nextDouble();

        System.out.print("점 입력: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if(a-r <= x && a+r >= x && b-r <= y && b+r >= y){
            System.out.print("점 (" + x + ", " + y + ")는 원 안에 있다.");
        }
        else{
            System.out.print("점 (" + x + ", " + y + ")는 원 안에 없다.");
        }

        /*
        double distance = Math.sqrt((x - a) * (x-a)) + (y-b) * (y-b));
        if(distance <= r)
         */
    }
}
