/**
 * Created by admin on 2016-02-02.
 * https://www.acmicpc.net/problem/1110 더하기사이클
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt(); //26
        int temp1 , temp2, a1, a2, b1, b2 , count = 0;
        int change = result;
        do{
            a1 = change/10; //2
            a2 = change%10; //6
            temp1 = a1+ a2; // 8

            temp2 = a2*10 + temp1%10;
            count++;
            if (result == temp2) {
                break;
            }

            change = temp2;

        }while(true);

        System.out.println(count);




    }


}
