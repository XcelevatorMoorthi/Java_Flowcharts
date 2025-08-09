import java.util.*;
public class FCP045
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   int s=0;
   int space=0;
  for(int i=1;i<=n;i++)
  {
   if(i<=n)
   { 
     space=n-i;

    }
   for(int j=1;j<=space;j++)
   { 
     System.out.print(" ");
     }
   for(int j=1;j<=s;j++)
   { 
     System.out.print("*");
     }
      System.out.println();
       s=s+2;
     
    }
   
  }
}   