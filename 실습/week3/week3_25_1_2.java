package week3;

public class week3_25_1_2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = 0;
            }
        }
        int ans = 0;
        while(ans < 10) {
            int a = (int)(Math.random() * 4);
            int b = (int)(Math.random() * 4);
            if(arr[a][b] != 0) {
                continue;
            }
            arr[a][b] = (int)(Math.random() * 10 + 1);
            ans++;
        }
        for(int[] ite : arr) { // arr[0]
            for(int a : ite) { // arr[0][0], arr[0][1], arr[0][2], arr[0][3]
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }
}

