import java.util.*;
public class FCP037
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a=0;
  int i=1;
  for(;i<n;i++)
  {
  if(n%i==0)
  {
    a=a+i;
   }
  else
   {
    
    }
  }

if(n==a)
{
  System.out.println("yes");
 }
else
{
 System.out.println("no");
 }
}
}



   