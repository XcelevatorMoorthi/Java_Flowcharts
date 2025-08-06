import java.util.*;
public class FCP032
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
for(int i=0;i<=n;i++)
{
  if(n%i==0)
  {
    c=c+1;
  }
}
if(c==3)
{
System.out.println("yes");
}
else{
System.out.println("no");
}
}}
 