import java.util.*;
class Sumarray
{
public static void main(String [] args)
{
  int arr[]={1,4,5,6,7};
  Sum(arr);
}
public static void Sum(int arr[])
{
  int sum=0,i;
for(i=0;i<arr.length;i++)
{
 sum+=arr[i];
}
System.out.println("Sum: " +sum);
}
}