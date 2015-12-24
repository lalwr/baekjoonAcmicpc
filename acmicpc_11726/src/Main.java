import java.util.Scanner;

/**
 * Created by admin on 2015-12-24.
 * https://www.acmicpc.net/problem/11726 2×n 타일링
 * 참고 url : http://minhard.blogspot.kr/2015/01/java_22.html
 */
public class Main {
    public int[] m=new int[1001];
    public static void main(String[] args) {
        Main sample=new Main();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        for(int i=0;i<1001;i++){
            sample.m[i]=0;
        }

        n = sc.nextInt();
        int fib=sample.Fibonachi(n);

        System.out.println(fib);

    }

    public int Fibonachi(int n){
        m[0]=1; m[1]=2;
        for(int i=2;i<n;i++){
            m[i]=(m[i-1]+m[i-2])%10007;
        }
        return m[n-1];
    }
}
