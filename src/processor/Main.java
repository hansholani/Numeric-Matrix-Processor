package processor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Add matrices\n" + "2. Multiply matrix by a constant\n" + "3. Multiply matrices\n" +"4. Transpose matrix\n"+"5. Calculate a determinant\n"+"6. Inverse matrix\n"+ "0. Exit");
            switch(sc.nextInt())
            {
                case 1: addition();
                    break;
                case 2: multiplyConstant();
                    break;
                case 3: multiplyMatrix();
                    break;
                case 4: transposeMatrix();
                    break;
                case 5: determinantfind();
                    break;
                case 6: inverse();
                    break;
                case 0:return;
            }
        }
    }
    public static void addition()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of first matrix:");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        double[][] one=new double[n1][m1];
        int i,j;
        System.out.println("Enter first matrix:");
        for( i=0;i<n1;i++)
            for( j=0;j<m1;j++)
                one[i][j]=sc.nextDouble();
        System.out.println("Enter size of second matrix:");
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        System.out.println("Enter second matrix:");
        double[][] two=new double[n2][m2];
        double[][] sum=new double[n2][m2];
        for(i=0;i<n2;i++) {
            for (j = 0; j < m2; j++) {
                two[i][j] = sc.nextDouble();
                sum[i][j] = one[i][j] + two[i][j];
            }
        }
        if(n1!=n2||m1!=m2)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println("The result is:");
        for( i=0;i<n1;i++) {
            for( j=0;j<m1;j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void multiplyConstant()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        double[][] one=new double[n1][m1];
        int i,j;
        System.out.println("Enter matrix:");
        for( i=0;i<n1;i++)
            for( j=0;j<m1;j++)
                one[i][j]=sc.nextDouble();
        System.out.println("Enter constant:");
        double multi=sc.nextInt()*1.0;
        System.out.println("The result is:");
        for( i=0;i<n1;i++) {
            for (j = 0; j < m1; j++)
                System.out.print(one[i][j] * multi+" ");
            System.out.println();
        }
    }
    public static void multiplyMatrix()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        double[][] one=new double[n1][m1];
        int i,j,k;
        System.out.println("Enter matrix:");
        for( i=0;i<n1;i++)
            for( j=0;j<m1;j++)
                one[i][j]=sc.nextDouble();
        System.out.println("Enter size of second matrix");
        int n2=sc.nextInt();
        int m2=sc.nextInt();
        double[][] two=new double[n2][m2];
        System.out.println("Enter matrix:");
        for( i=0;i<n2;i++)
            for( j=0;j<m2;j++)
                two[i][j]=sc.nextDouble();
        if(m1!=n2)
        {
            System.out.println("ERROR");
            return;
        }
        System.out.println("The result is:");
        double[][] result=new double[n1][m2];
        for(i=0;i<n1;i++)
        {
            for(j=0;j<m2;j++)
            {
                for(k=0;k<n2;k++)
                    result[i][j]+=(one[i][k]*two[k][j]);
            }
        }
        for(i=0;i<n1;i++)
        {
            for(j=0;j<m2;j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
    }
    public static void transposeMatrix() {
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
        System.out.println("The result is:");
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
    public static void determinantfind()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size:");
        int i,j,N=s.nextInt(),M=s.nextInt();
        double[][] arr=new double[N][N];
        System.out.println("Enter matrix:");
        for(i=0;i<N;i++)
            for(j=0;j<N;j++)
                arr[i][j]=s.nextDouble();
        double det=findDeterminant(arr,N);
        System.out.println("The result is:\n"+det);
    }
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
    public static void inverse()
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
