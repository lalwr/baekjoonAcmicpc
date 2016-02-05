/**
 * Created by admin on 2016-02-05.
 * https://www.acmicpc.net/problem/3047 ABC
 */
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int[] array = new int[3];
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a < b && a < c){
            if(b < c){
                array[0] = a;
                array[1] = b;
                array[2] = c;
            }else if(b > c){
                array[0] = a;
                array[1] = c;
                array[2] = b;
            }
        }else if(a > b && a > c){
            if(b < c){
                array[0] = b;
                array[1] = c;
                array[2] = a;
            }else if(b > c){
                array[0] = c;
                array[1] = b;
                array[2] = a;
            }
        }else if(a > b && a < c){
            array[0] = b;
            array[1] = a;
            array[2] = c;
        }else if(a < b && a > c){
            array[0] = c;
            array[1] = a;
            array[2] = b;
        }

        String sort = sc.next();



        if(sort.equals("ABC")){
            System.out.print(array[0] + " " + array[1] + " " + array[2]);
        }else if(sort.equals("ACB")){
            System.out.print(array[0] + " " + array[2] + " " + array[1]);
        }else if(sort.equals("BAC")){
            System.out.print(array[1] + " " + array[0] + " " + array[2]);
        }else if(sort.equals("BCA")){
            System.out.print(array[1] + " " + array[2] + " " + array[0]);
        }else if(sort.equals("CAB")){
            System.out.print(array[2] + " " + array[0] + " " + array[1]);
        }else if(sort.equals("CBA")){
            System.out.print(array[2] + " " + array[1] + " " + array[0]);
        }

    }


}
