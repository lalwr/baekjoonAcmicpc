import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by admin on 2015-12-03.
 * https://www.acmicpc.net/problem/3052 나머지
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );
        ArrayList<Integer> num = new ArrayList<>();
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);
        num.add(sc.nextInt()%42);

        int cnt =0;
        ArrayList<Integer> check = new ArrayList<>();
        for(Iterator<Integer> it = num.iterator() ; it.hasNext() ; )
        {

           int value = it.next();
            if(!check.contains(value) ){
                cnt++;
                check.add(value);
            }

        }

        System.out.println(cnt);
    }
}
