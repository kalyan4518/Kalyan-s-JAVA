import java.util.Scanner;

public class Max
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A , b,c");
        int  a= sc.nextInt();
        int  b= sc.nextInt();
        int  c= sc.nextInt();
        int max;
        max = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Maximum Number is = "+max);


    }
    
}
    