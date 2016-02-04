/**
 * Created by admin on 2016-02-04.
 * https://www.acmicpc.net/problem/11653 소인수분해
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        int i =2;

        while( true ){

            if( val%i == 0){
                val = val/i;
                System.out.println(i);
            }else{
                i++;
            }
            if( val == 1){
                break;
            }

        }

    }


}
