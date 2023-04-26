import java.util.Scanner;
public class Matrix{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("row of matrix1:");
int m=sc.nextInt();
System.out.println("column of matrix1:");
int n=sc.nextInt();
int[][]mat1=new int[m][n];
int[][]mat2=new int[m][n];
int[][]sum=new int[m][n];
System.out.println("enter matrix1:");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
mat1[i][j]=sc.nextInt();
}
}
System.out.println("enter matrix2:");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
mat2[i][j]=sc.nextInt();
}
}
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
sum[i][j]=mat1[i][j]+mat2[i][j];
}
}
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
System.out.print(sum[i][j] + "\t");
}System.out.println();
}
}
}
