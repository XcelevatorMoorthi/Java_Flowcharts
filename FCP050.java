import java.util.*;
public class FCP050
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int c=0;
     int j;
      for(int i=2;i<n;i++)
      { 
        int k=n%i;
	c=0;
	if(k==0)
	{
            for(j=2;j<i;j++)
             {
	       if(i%j==0)
	       {
	         c=c+1;
                }
	       else
	       {
		 }
              }
	 if(c==0)

          {
            System.out.println(j);
           }
         else
           {}
        }
	}
}
}
