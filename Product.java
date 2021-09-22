import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d= sc.nextInt();
        int e=sc.nextInt();
        int []array=new int[5];
        for(int i=0;i<array.length;i++)
        {
            array[0]=a*a;
            array[1]=b*b;
            array[2]=c*c;
            array[3]=d*d;
            array[4]=e*e;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
