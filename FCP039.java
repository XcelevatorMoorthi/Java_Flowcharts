import java.util.*;
public class FCP039
{
 public static void main(String[]arg)
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a=sc.nextInt();
  int b=sc.nextInt();
  int max=0;
  int min=0;
           
  if(a>b)
  {
   max=a;
   min=b;
 }
  else
  {
    min=a;
    max=b;
   }

  for(int i=3;i<=n;i++)
  {
    int c=sc.nextInt();
     if(c<max)
      { 
        if(c<min)
        {
        max=max;
        min=c;
       }
      else
       {
        max=max;
        min=min;
       }  
      }
     else
       {
         max=c;
         min=min;
       }
  }
System.out.println(max);
System.out.println(min);
}}