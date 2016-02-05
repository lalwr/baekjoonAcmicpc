/**
 * Created by admin on 2016-02-05.
 * https://www.acmicpc.net/problem/11022 A+B - 8
 */
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int j, i, count, sum, f=0;
        count = sc.nextInt();
        String[] val = new String[count];
        int[] result = new int[count];
        sc.nextLine();
        for (i = 0; i < count; i++) {
            val[i] = sc.nextLine();
            String[] sp = val[i].split(" ");
            sum = 0;
            for (j = 0; j < sp.length; j++) {
                sum += Integer.parseInt(sp[j]);
            }
            f++;
            System.out.println("Case #"+f+": "+ sp[0] + " + " + sp[1] + " = " +sum);
        }



    }


}
