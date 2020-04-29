import java.util.*;
public class FibonacciSeries
{
 FibonacciSeries(int n)
 {
     int a=0,b=1,temp=0;
  System.out.println("Fibonacci Series is");  
  for(int i=0;i<n;i++)
    {
      System.out.print(a+" ");
      a=a+b;
       temp=a;
       a=b;
       b=temp;
    }
 }
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
   System.out.println("Please insert any number");
   int n=sc.nextInt();
  FibonacciSeries fs=new FibonacciSeries(n); 
  }
}   
     
