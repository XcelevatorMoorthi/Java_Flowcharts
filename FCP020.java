public class FCP020{
public static void main(String[]arg)
{
int min=0;
int max=0;
int a=5;
int b=4;
int c=6;
int d=7;
if(a<b){
min=a;
max=b;
}
else{
min=b;
max=a;
}
if(max<c)
{
min=max;
max=c;
}
else{
min=c;
max=max;
}
if(max<d)
{
System.out.println(max);
}
else{
System.out.println(d);
}
}}