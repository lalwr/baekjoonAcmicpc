/**
 * Created by admin on 2016-02-02.
 * https://www.acmicpc.net/problem/1924 2007년
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        int a = sc.nextInt()-1;
        int b = sc.nextInt();

        int monthDay = 0;

        for (int i = 0; i < a; i++) {
            monthDay += arr[i];
        }
        monthDay += b-1;
        monthDay %= 7;
        System.out.println(day[monthDay]);

    }


}
