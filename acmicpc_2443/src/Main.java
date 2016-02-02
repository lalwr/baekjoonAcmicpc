/**
 * Created by admin on 2016-02-02.
 * https://www.acmicpc.net/problem/2443 별찍기 - 6
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int j, i = 0;
        for (i = count; i > 0; i--) {
            for ( j = 0; j < i * 2 - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int k = 0; k <= count-i; k++) {
                System.out.print(" ");
            }
        }

    }


}
