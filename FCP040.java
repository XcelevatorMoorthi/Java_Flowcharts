import java.util.*;
public class FCP040 
{
  public static void main(String[] arg)
   {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();   
        int a = sc.nextInt();   
        int b = sc.nextInt();   
        int max1 = 0;
        int max2 = 0;
        if (a > b) {
            max1 = a;
            max2 = b;
        } else {
            max1 = b;
            max2 = a;
        }

        for (int i = 3; i <= n; i++) {
            int c = sc.nextInt(); 
            if (c > max1) {
                max2 = max1;
                max1 = c;
            } else if (c > max2 && c != max1) {
                max2 = c;
            }
        }

        System.out.println(max2);
    }
}
