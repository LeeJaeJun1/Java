package week6;

class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x; this.y = y;
    }
    @Override
    public String toString() {
        return "Point (" + x + ", " + y + "), ";
    }
}

class Circle extends Point {
    private int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return super.toString() + "r = " + radius;
    }

    public boolean equls(Object obj) {
        return toString().equals(obj.toString());
    }
}

public class week6_1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3,4,5);
        Circle c2 = new Circle(3,4,5);
        Circle c3 = new Circle(3,4,6);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        if(c1.equls(c2)){
            System.out.println("c1 == c2");
        }
        else{
            System.out.println("c1 != c2");
        }
        if(c1.equls(c3)) {
            System.out.println("c1 == c3");
        }
        else{
            System.out.println("c1 != c3");
        }
    }
}
