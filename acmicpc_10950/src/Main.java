/**
 * Created by admin on 2016-02-02.
 * https://www.acmicpc.net/problem/10950 A+B - 3
 *
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[] = new int[count*2];

        for (int i = 0; i < count*2; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < count*2; i+=2) {
            System.out.println(arr[i]+arr[i+1]);
        }

    }


}
