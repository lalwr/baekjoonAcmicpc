/**
 * Created by admin on 2016-02-03.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int i, j = 0, z = 0, g=1,g2=count-1;
        int temp = count * 2;

        for(i=count*2-1; i > 0; i-=2){
            for( z=1; z < g; z++){
                System.out.print(" ");
            }
            g++;
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(i= 3; i <= count*2-1; i+=2){
            for( z=1; z < g2; z++){
                System.out.print(" ");
            }
            g2--;
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
