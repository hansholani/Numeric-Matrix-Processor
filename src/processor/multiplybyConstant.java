package processor;

import java.util.Scanner;

public class multiplybyConstant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int[][] one=new int[n1][m1];
        int i,j;
        for( i=0;i<n1;i++)
            for( j=0;j<m1;j++)
                one[i][j]=sc.nextInt();
        int multi=sc.nextInt();
        for( i=0;i<n1;i++) {
            for (j = 0; j < m1; j++)
                System.out.println(one[i][j] * multi+" ");
        System.out.println();
        }
    }
}
