/**
 * Created by admin on 2016-02-03.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int i, j = 0;

        for (i = 1; i <= count; i++) {
            for (j = count-i; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (i = 1; i <= count-1; i++) {
            for (j = 1; j <= count-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
