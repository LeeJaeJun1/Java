package week5;

import java.util.Scanner;

abstract class Calc {
    protected int operand1, operand2;
    public void setValue(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public abstract int calculate();
}

class Add extends Calc {
    public int calculate() {
        return operand1 + operand2;
    }
}

class Sub extends Calc {
    public int calculate() {
        return operand1 - operand2;
    }
}

class Mul extends Calc {
    public int calculate() {
        return operand1 * operand2;
    }
}

class Div extends Calc {
    public int calculate() {
        return operand1 / operand2;
    }
}

public class week5_25_1_2 {
    int a,b;
    char operator;

    private void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하세요>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
        operator = scanner.next().charAt(0);
        scanner.close();
    }

    private Calc getOperatorObj() {
        switch (operator) {
            case '+':
                return new Add();

            case '-':
                return new Sub();

            case '*':
                return new Mul();

            case '/':
                return new Div();

            default:
                System.out.println("잘못된 연산자입니다.");
                return null;
        }
    }

    public void execute() {
        getUserInput();

        Calc exp = getOperatorObj();
        exp.setValue(a, b);
        if((exp instanceof Div) && (b==0)) {
            System.out.println("계산할 수 없습니다.");
        }
        else {
            System.out.println(exp.calculate());
        }
    }
    public static void main(String[] args) {
        week5_25_1_2 obj = new week5_25_1_2();
        obj.execute();
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.next();

        if(c.equals("+")) {
            Calc add = new Add();
            add.setValue(a, b);
            System.out.println(add.calculate());
        }
        else if(c.equals("-")) {
            Calc add = new Sub();
            add.setValue(a, b);
            System.out.println(add.calculate());
        }
        else if(c.equals("*")) {
            Calc add = new Mul();
            add.setValue(a, b);
            System.out.println(add.calculate());
        }
        else if(c.equals("/")) {
            Calc add = new Div();
            add.setValue(a, b);
            System.out.println(add.calculate());
        }
        else {
            System.out.println("잘못된 연산자입니다.");
        }
         */
    }
}

