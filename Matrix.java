import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        int row,column;
        int arr[][]=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        row=sc.nextInt();
        System.out.println("Enter no of column");
        column=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array is");
        {
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<column;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        for(int i=0;i<row;i++)
        {
            System.out.println(arr[i][i]);
        }
        for(int i=0;i<row;i++)
        {
            System.out.println(arr[i][row-i-1]);
        }
    }

}
