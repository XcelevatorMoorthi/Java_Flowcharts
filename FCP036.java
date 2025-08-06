import java.util.*;
public class FCP036
{
 public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int sum=0;
 int pro=0;
 int ans=0;
 int max=0;
 int min=0;
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
for(int i=1;i<max;i++)
{
  if(a%i==0)
  {
  if(b%i==0)
  {
    sum=i;
    }

}
}
pro=a*b;
ans=pro/sum;
System.out.println(sum);
System.out.println(ans);
}
}