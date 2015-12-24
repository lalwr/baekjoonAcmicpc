import java.util.Scanner;
/**
 * Created by admin on 2015-12-24.
 * https://www.acmicpc.net/problem/1032 명령 프롬프트
 */
public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, len;
        char dstr[] = new char[51];
        char src[] = new char[51];

       n = sc.nextInt();
       dstr = sc.next().toCharArray();
       len = dstr.length;
      for (i = 0; i < n - 1; i++) {
          src = sc.next().toCharArray();
          for (j = 0; j < len; j++) {
              if (dstr[j] != src[j]) {
                  dstr[j] = '?';
              }
          }
      }
      System.out.println(dstr);



   }


}