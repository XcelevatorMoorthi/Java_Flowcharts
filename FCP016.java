public class FCP016{
public static void main(String[]arg)
{
int a=1800;
if(a%4==0)
{
  if(a!=100)
{
  if(a%400==0)
{
  System.out.println("leap");
}else{
 System.out.println("non leap");
}
}
else{
  System.out.println("non leap");
}
}
else{
System.out.println("non leap");
}
}}