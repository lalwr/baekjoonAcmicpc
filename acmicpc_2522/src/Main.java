/**
 * Created by admin on 2016-02-03.
 * https://www.acmicpc.net/problem/2522 별찍기 - 12
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int i, j = 0, z = 0, i2;

        for (i = 1; i <= count; i++) {
            for (z = 1; z <= count-i; z++) {
                System.out.print(" ");
            }

            for (j = count - i; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i2 = 1; i2 < i; i2++) {
            for (z = 1; z <= i2; z++) {
                System.out.print(" ");
            }
            for (j = i2; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
