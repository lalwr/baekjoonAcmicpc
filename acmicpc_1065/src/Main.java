import java.util.Scanner;

/**
 * Created by admin on 2015-12-03.
 * https://www.acmicpc.net/source/1150598 등차수열 한수
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int number = Integer.parseInt(n);
        int cnt = 0;
        for(int i=1;i<=number;i++)
        {
            if(i>=100)
            {
                if((i/100-i/10%10)==(i/10%10-i%10))
                    cnt++;
            }
            else
                cnt++;
        }
        System.out.println(cnt);
    }
}
