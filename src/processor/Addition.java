package processor;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] one = new int[n1][m1];
        int i, j;
        for (i = 0; i < n1; i++)
            for (j = 0; j < m1; j++)
                one[i][j] = sc.nextInt();
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        if (n1 != n2 || m1 != m2) {
            System.out.println("ERROR");
            return;
        }

        int[][] two = new int[n2][m2];
        int[][] sum = new int[n2][m2];
        for (i = 0; i < n2; i++) {
            for (j = 0; j < m2; j++) {
                two[i][j] = sc.nextInt();
                sum[i][j] = one[i][j] + two[i][j];
            }
        }
        for (i = 0; i < n1; i++) {
            for (j = 0; j < m1; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
