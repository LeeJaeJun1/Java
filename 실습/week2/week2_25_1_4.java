package week2;

import java.util.Scanner;

public class week2_25_1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("자동차 상태 입력>>");
        int status = input.nextInt();
        // int는 32비트이기 때문에, 0b0100_0000 8비트 이진수도 같은 크기의 32비트 정수로 처리된다.
        int temperature = status % 32; // 0 ~ 31값이기 때문에 범위 밖에 나가는 수 %32해준다.
        int aircon = status & 0b0100_0000; // 6비트 1이면 aircon 켜진거다. &는 두 비트 모두 1이면 true.
        int running = status & 0b1000_0000; // 7비트 1이면 달리는 상태, 0이면 멈춘 상태

        System.out.print("자동차는 ");
        if(running == 0) {
            System.out.print("정지 상태이고 ");
        }
        else{
            System.out.print("달리는 상태이고 ");
        }

        if(aircon==0) {
            System.out.print("에어컨이 꺼진 상태이고 ");
        }
        else{
            System.out.print("에어컨이 켜진 상태이고 ");
        }
        System.out.print("온도는 " + temperature + "도이다.");
    }
}
