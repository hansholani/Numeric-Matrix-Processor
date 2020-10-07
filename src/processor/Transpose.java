package processor;
import java.util.Scanner;
public class Transpose {
    public static void main(String[] args)
    {
        while(true) {
            System.out.println("1. Main diagonal\n" + "2. Side diagonal\n" + "3. Vertical line\n" + "4. Horizontal line");
            Scanner sc=new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("Enter matrix size:");
            int row=sc.nextInt();
            int col=sc.nextInt();
            System.out.println("Enter matrix:");
            int i,j;
            double[][] arr=new double[row][col];
            for(i=0;i<row;i++)
                for(j=0;j<col;j++)
                    arr[i][j]=sc.nextDouble();
            switch (x)
            {
                case 1: mainD(arr,row,col);
                break;
                case 2: sideD(arr,row,col);
                break;
                case 3: vertD(arr,row,col);
                break;
                case 4: horiD(arr,row,col);
            }
        }
    }
    public static void mainD(double[][] arr,int row,int col) {
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col;j++)
                System.out.print(arr[j][i]+" ");
            System.out.println();
        }
    }
    public static void sideD(double[][] arr,int row,int col) {
        int i,j;
        for(i=row-1;i>-1;i--)
        {
            for(j=col-1;j>-1;j--)
                System.out.print(arr[j][i]+" ");
            System.out.println();
        }
    }
    public static void vertD(double[][] arr,int row,int col)
    {
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=col-1;j>-1;j--)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static void horiD(double[][] arr,int row,int col)
    {
        int i,j;
        for(i=row-1;i>-1;i--)
        {
            for(j=0;j<col;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
