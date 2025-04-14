package week6;

import java.util.Scanner;

public class week6_25_1_6 {
    private int histoData[] = new int[26];

    private String readString() {
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if(line.equals(";")) {
                break;
            }
            sb.append(line);
        }
        scanner.close();
        return sb.toString();
    }

    public week6_25_1_6() {
        for (int i = 0; i < histoData.length; i++) {
            histoData[i] = 0;
        }
    }

    public void run() {
        String s = readString();
        makeHistogram(s);
        drawHistogram();
    }

    private void makeHistogram(String text) {
        text = text.toUpperCase();

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                int index = c - 'A';
                histoData[index]++;
            }
        }
    }

    private void drawHistogram() {
        System.out.println("\n히스토그램을 그립니다.");
        for(int i = 0; i < histoData.length; i++) {
            System.out.print((char)('A' + i));

            for(int j = 0; j < histoData[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        week6_25_1_6 app = new week6_25_1_6();
        app.run();
    }
}
