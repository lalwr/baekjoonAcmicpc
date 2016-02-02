/**
 * Created by admin on 2016-02-02.
 * https://www.acmicpc.net/problem/2609 최대공약수와 최소공배수
 */
import java.util.*;

public class Main {
    //유클리드 호제법
    static int gcd(int x, int y){
        return (x % y == 0 ? y : gcd(y, x%y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int big, small;

        if( a > b){
            big = a;
            small =b;
        }else{
            big = b;
            small = a;
        }
        int result = gcd(big , small);
        System.out.println(result); //최대공약수
        System.out.println((big*small)/result); //최소공배수
    }


}
