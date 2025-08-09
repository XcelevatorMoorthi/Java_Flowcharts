import java.util.*;
public class FCP047
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
     int max=0;
     int min=0;
     int sum=0;
 	if(a>b)
	{
 	  max=a;
 	  min=b;
 	}
	else
	{
	 max=b;
	 min=a;
	}
	 for(int j=1;j<max;j++)
	 {
  	  if(a%j==0)
  	  {
            if(b%j==0)
 	    {
   	     sum=j;
   	     }

	  }
        }
     for(int i=3;i<=n;i++)
       {
           int c=sc.nextInt();
	    if(sum>c)
	   {
 	 	 max=sum;
 	 	 min=c;
 		}
	    else
	    {
	 	max=c;
	 	min=max;
	     }
	for(int k=1;k<max;k++)
	 {
  	  if(a%k==0)
  	  {
            if(b%k==0)
 	    {
   	     sum=k;
   	     }

	  }
        }
     }
   System.out.println(sum);
}}
            
    