import java.util.*;
public class FCP048
 {
   public static void main(String[]args) 
   {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt(); 
   int b=sc.nextInt(); 
   int m=0;
   int R=0;
        for(int j=1;j<=9;j++)
        {
	  System.out.println(j);
	 }
   	for(int i=10;i<=b;i++) 
	{
          int temp=i;
          R=0;
	  while(temp!=0) 
	  {
            m=temp % 10;
            R=R+(m*m*m); 
            temp=temp/10;
            }
		if(R==i) 
		{
                  System.out.println(i); 
                }
      }
   }
}
