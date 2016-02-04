/**
 * Created by admin on 2016-02-04.
 * https://www.acmicpc.net/problem/10953 A+B - 6
 */
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j, i, count, sum;
        count = sc.nextInt();
        String[] val = new String[count];
        int[] result = new int[count];
        sc.nextLine();
        for (i = 0; i < count; i++) {
            val[i] = sc.nextLine();
            String[] sp = val[i].split(",");
            sum = 0;
            for (j = 0; j < sp.length; j++) {
                sum += Integer.parseInt(sp[j]);
            }
            result[i] = sum;
        }

        for (i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }


}
