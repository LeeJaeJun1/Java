package week5;

interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {
    private int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }
    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

class Rect implements Shape {
    private int h,w;
    Rect(int h, int w) {
        this.h = h; this.w = w;
    }
    @Override
    public void draw() {
        System.out.println(h + "x" + w +"크기의 사각형 입니다.");
    }
    @Override
    public double getArea() {
        return h * w;
    }
}

public class week5_25_1_3 {
    public static void main(String[] args) {
        Shape[] list = new Shape[2];
        list[0] = new Circle(10);
        list[1] = new Rect(10,40);

        for(int i = 0; i < list.length; i++) {
            list[i].redraw();
        }
        for(int i = 0; i < list.length; i++) {
            System.out.println("면적은 " + list[i].getArea());
        }
    }
}

