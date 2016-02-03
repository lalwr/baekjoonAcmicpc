/**
 * Created by admin on 2016-02-03.
 * https://www.acmicpc.net/problem/11655 ROT13
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        int[] ascii = new int[value.length()];
        int asciiVal, changeAscii = 0;

        for (int i = 0; i < value.length(); i++) {
            ascii[i] = value.charAt(i);
            asciiVal = ascii[i];

            if(65 <= asciiVal && asciiVal <= 90){
                changeAscii = asciiVal +13;
                if(changeAscii > 90){
                    changeAscii = 64 + changeAscii - 90;
                }
            }else if(97 <= asciiVal && asciiVal <= 122){
                changeAscii = asciiVal +13;
                if(changeAscii > 122){
                    changeAscii = 96 + changeAscii - 122;
                }
            }else{
                changeAscii = asciiVal;
            }

            System.out.print(String.valueOf((char)changeAscii));

        }


    }


}
