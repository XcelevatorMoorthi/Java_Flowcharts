import java.util.*;
public class Space
{
public static void main(String[]args)
{
int count = 1;
for (int i = 1; i <= 2; i++) {
    for (int j = 1; j <= 4; j++) {
        if (count % 3 == 0) {
            count++;
            continue;
        }
        System.out.print(count + " ");
        count++;
    }
}
}}