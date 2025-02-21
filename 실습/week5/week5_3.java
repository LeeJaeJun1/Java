package week5;

import java.util.Scanner;

abstract class Stack{
    public abstract int length();
    public abstract int capacity();
    public abstract String pop();
    public abstract boolean push(String str);
}

class StringStack extends Stack {
    private String[] strs;
    private int tos; // index

    public StringStack(int capacity) {
        strs = new String[capacity];
        tos = -1;
    }

    @Override
    public int length() {
        return tos + 1;
    }

    @Override
    public int capacity() {
        return strs.length;
    }

    @Override
    public String pop() {
        if (tos == -1) {
            return null;
        }
        String s = strs[tos];
        tos -= 1;
        return s;
    }

    @Override
    public boolean push(String str) {
        if (tos == strs.length-1) {
            return false;
        }
        else {
            tos++;
            strs[tos] = str;
            return true;
        }
    }
}

public class week5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("size of stack: ");
        int n = scanner.nextInt();

        StringStack stack = new StringStack(n);

        while(true) {
            System.out.print("input: ");
            String s = scanner.next();
            if(s.equals("exit"))
                break;

            boolean b = stack.push(s);
            if(b==false) {
                System.out.println("stack is full");
            }
        }
        System.out.print("pop all strings: ");
        int len = stack.length();
        for(int i = 0; i < len; i++) {
            System.out.print(stack.pop() + " ");
        }
        scanner.close();
    }
}
