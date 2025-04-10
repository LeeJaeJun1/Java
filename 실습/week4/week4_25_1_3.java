package week4;

import java.util.Scanner;

class Add {
    private int operand1, operand2;
    public void setValue(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public int calculate() {
        return operand1 + operand2;
    }
}

class Sub {
    private int operand1, operand2;
    public void setValue(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public int calculate() {
        return operand1 - operand2;
    }
}

class Mul {
    private int operand1, operand2;
    public void setValue(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public int calculate() {
        return operand1 * operand2;
    }
}

class Div {
    private int operand1, operand2;
    public void setValue(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public int calculate() {
        int res = 0;
        try{
            res = operand1 / operand2;
        }
        catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return res;
    }
}

public class week4_25_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        String operator = input.next();

        if(operator.equals("+")) {
            Add add = new Add();
            add.setValue(num1, num2);
            System.out.print(add.calculate());
        }
        else if(operator.equals("-")) {
            Sub sub = new Sub();
            sub.setValue(num1, num2);
            System.out.print(sub.calculate());
        }
        else if(operator.equals("*")) {
            Mul mul = new Mul();
            mul.setValue(num1, num2);
            System.out.print(mul.calculate());
        }
        else if(operator.equals("/")) {
            Div div = new Div();
            div.setValue(num1, num2);
            System.out.print(div.calculate());
        }
        else{
            System.out.println("잘못된 연산자입니다.");
        }
        input.close();
    }
}

