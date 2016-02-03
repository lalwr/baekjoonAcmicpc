/**
 * Created by admin on 2016-02-03.
 * https://www.acmicpc.net/problem/2445 별찍기 - 8
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int i, j = 0, z =0;
        int temp = count*2-2;

        for (i = 1; i <= count; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(z =i*2; z < count*2; z++){
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (i = count-1; i >=1 ; i--) {
            for (j = i; j >=1; j--) {
                System.out.print("*");
            }
            for(z =i*2; z < count*2; z++){
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }




    }


}
