import java.util.Scanner;
public class MatrixAddition1{
    public static void main(String[]args){
        int N=Integer.parseInt(args[0]);
        int[][] matrix1=new int[N][N];
        int[][] matrix2=new int[N][N];
        int[][] result=new int[N][N];

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the elements of first matrix :");
        for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
          matrix1[i][j]=scanner.nextInt();}
         }
          System.out.println();
        System.out.println("enter the elements of second matrix :");
        for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
          matrix2[i][j]=scanner.nextInt();}
          }
           System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
}}
         for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
          System.out.print(result[i][j]+" ");}
            System.out.println();}

          


}}