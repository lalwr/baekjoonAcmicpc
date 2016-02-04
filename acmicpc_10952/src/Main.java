/**
 * Created by admin on 2016-02-04.
 * https://www.acmicpc.net/problem/10952 A+B - 5
 */
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(a+b);

        }


    }


}
