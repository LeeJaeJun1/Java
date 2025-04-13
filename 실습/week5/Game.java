package week5;

import java.util.Scanner;

abstract class GameObject {
    protected int distance;
    protected int x,y;
    protected int end0fx, end0fy;

    public GameObject(int startX, int startY, int distance, int end0fx, int end0fy) {
        this.x = startX;
        this.y = startY;
        this.distance = distance;
        this.end0fx = end0fx;
        this.end0fy = end0fy;
    }
    public int getX() {return x;}
    public int getY() {return y;}

    public boolean collide(GameObject target) {
        if(this.x==target.getX() && this.y==target.getY()){
            return true;
        }
        else {
            return false;
        }
    }
    public void adjustCoordinate() {
        if(x < 0) x = 0;
        else if (x >= end0fx) x= end0fx - 1;

        if(y < 0) y = 0;
        else if (y >= end0fy) y= end0fy - 1;
    }
    protected abstract void move();
    protected abstract char getShape();
}

class Bear extends GameObject {
    private Scanner scanner;

    public Bear(int x, int y, int distance, int end0fx, int end0fy) {
        super(x, y, distance, end0fx, end0fy);
        scanner = new Scanner(System.in);
    }

    @Override
    public void move() {
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
        char input;
        input = scanner.next().charAt(0);
        switch(input) {
            case 'a':
                x--;
                break;
            case 'f':
                x++;
                break;
            case 'd':
                y--;
                break;
            case 's':
                y++;
                break;
        }
        adjustCoordinate();
    }

    @Override
    public char getShape() {
        return 'B';
    }
}

class Fish extends GameObject {
    final int[][] movements = { {0,0}, {1,0}, {-1,0}, {0,1}, {0,-1}};

    public Fish(int x, int y, int distance, int end0fx, int end0fy) {
        super(x, y, distance, end0fx, end0fy);
    }

    @Override
    public void move() {
        int choice = (int) (Math.random() * 5);

        int[] movement = movements[choice];
        x += movement[0];
        y += movement[1];

        adjustCoordinate();
    }
    @Override
    public char getShape() {
        return '@';
    }


}


public class Game {
    public static final int MAX_X = 20;
    public static final int MAX_Y = 10;
    private char map[][] = new char[MAX_Y][MAX_X];
    private GameObject[] gameObject = new GameObject[2];

    public Game() {
        for(int i = 0; i < MAX_Y; i++){
            for(int j = 0; j < MAX_X; j++){
                map[i][j] = '-';
            }
        }
        gameObject[0] = new Bear(0,0,1,MAX_X,MAX_Y);
        gameObject[1] = new Fish(5,5,1,MAX_X,MAX_Y);
    }

    private void update() {
        for(int i = gameObject.length -1; i >= 0; i--){
            map[gameObject[i].getY()][gameObject[i].getX()] = gameObject[i].getShape();
        }
    }

    private void clear() {
        for(int i = 0; i < gameObject.length; i++){
            map[gameObject[i].getY()][gameObject[i].getX()] = '-';
        }
    }

    private void draw() {
        System.out.println();
        for(int i = 0; i < MAX_Y; i++) {
            for(int j = 0; j < MAX_X; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private boolean doesEnd() {
        if(gameObject[0].collide(gameObject[1])) {
            return true;
        }
        return false;
    }

    public void run() {
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");

        update();
        draw();

        while(!doesEnd()) {
            clear();
            for(int i = 0; i < gameObject.length; i++) {
                gameObject[i].move();
            }
            update();
            draw();
        }
        System.out.println("Bear Wins!!");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
