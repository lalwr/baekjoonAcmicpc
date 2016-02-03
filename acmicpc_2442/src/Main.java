/**
 * Created by admin on 2016-02-03.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int i, j , z =0;

        for (i = 1; i <= count; i++) {

            for (z = count - i; z >= 1; z--) {
                System.out.print(" ");
            }

            for (j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }


}
