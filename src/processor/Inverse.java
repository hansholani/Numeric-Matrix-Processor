package processor;

import java.util.Scanner;

public class Inverse {
    public static double findDeterminant(double[][] arr,int N)
    {
        if(N==1)
        {
            return arr[0][0];
        }
        if(N==2)
        {
            return arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0];
        }
        int i,j;
        double det=0;
        double[][] temp=new double[N-1][N-1];
        for(i=0;i<N;i++)
        {
            int a=0,b=0;
            for(j=0;j<N;j++)
            {
                for (int k = 0; k < N; k++)
                {
                    if (j != 0 && k != i) {
                        temp[a][b] = arr[j][k];
                        b++;
                        if(b==N-1)
                        {
                            a++;
                            b=0;
                        }
                    }
                }
            }
            det+=Math.pow(-1,i)*arr[0][i]*findDeterminant(temp,N-1);
        }
        return det;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int i,j,N=s.nextInt(),M=s.nextInt();
        System.out.println("Enter matrix:");
        double[][] arr=new double[N][N];
        for(i=0;i<N;i++)
            for(j=0;j<N;j++)
                arr[i][j]=s.nextDouble();
        if(N==2)
        {
            System.out.println("This matrix doesn't have an inverse");
            return;
        }
        inverseFinder(arr,N);
    }
    public static void inverseFinder(double[][] arr,int N)
    {
        int i,j,z,k;
        double det=findDeterminant(arr,N);
        double[][] temp=new double[N-1][N-1];
        double[][] cofactorarr=new double[N][N];
        for(i=0;i<N;i++)
        {
            for (j = 0; j < N; j++)
            {
                int a = 0, b = 0;
                for (z = 0; z < N; z++)
                {
                    for (k = 0; k < N; k++)
                    {
                        if (z != i && k != j)
                        {
                            temp[a][b] = arr[z][k];
                            b++;
                            if (b == N - 1)
                            {
                                a++;
                                b = 0;
                            }
                        }
                    }
                }
                cofactorarr[j][i]=Math.pow(-1,i+ j)* findDeterminant(temp, N - 1);
            }
        }
        if(det==0)
        {
            System.out.println("The inverse of this matrix does not exist");
            return;
        }
        System.out.println("the result is:");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
                if(cofactorarr[i][j]!=-0.0)
                {
                    System.out.print(cofactorarr[i][j]/det + " ");
                }
                else
                    System.out.print("0.0 ");
            System.out.println();
        }
    }
}
