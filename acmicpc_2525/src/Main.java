import java.util.Scanner;

/**
 * Created by admin on 2015-12-02.
 * https://www.acmicpc.net/problem/2525 오븐시계
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );

        String message = sc.nextLine();
        int t = sc.nextInt();

        String  m[] =  message.split("\\s+"); //모든 공백제거
        int a = Integer.parseInt(m[0]);
        int b = Integer.parseInt(m[1]);

        System.out.println((a+(b+t)/60)%24 + " " + (b+t)%60 );


    }
}
