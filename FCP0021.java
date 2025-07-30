public class FCP0021{
public static void main(String []arg){
int max1=0;
int max2=0;
int a=5;
int b=4;
int c=6;
int d=7;
int e=8;
int f=9;
int g=2;
int h=3;
if(a>b){
max1=a;
max2=b;
}
else{
max1=b;
max2=a;
}
if(max1<c){
max2=max1;
max1=c;
}
else{
if(max2<c){
max2=c;
}}
if(max1<d){
max2=max1;
max1=d;
}
else{
if(max2>d)
{
max2=d;
}}

if(max1<e)
{
max2=max1;
max1=f;}
else{
if(max2<e){
max2=e;}
}
if(max1>f)
{
max2=max1;
max1=f;
}
else{
if(max1>f){
max2=f;
}}
if(max1<g){
max2=max2;
max1=g;
}
else{
if(max2>g){
max2=g;
}}
if(max1<h)
{
 if(max2>h)
{
System.out.println(max2);
}
else{
System.out.println(h);}}
else
{
System.out.println(max1);}
}}



