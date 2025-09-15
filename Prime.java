import java.util.Scanner;

public class Prime
{
   public static void main(String[] args)
     {
        System.out.println("Enter the numbers");
         Scanner sc= new Scanner(System.in);
          int a =sc.nextInt();
           boolean count=true;
           if(a<=1)
          {
             count =false;
             }
    else
{
for(int i=2;i<=a/2;i++)
{
  if(a%2==0)
{  
  count= false;
break;
}}}
 if(count)
{
  System.out.println("its  a prime number");
}
else
{
   System.out.println("its not a prime number");}
}}