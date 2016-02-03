/**
 * Created by admin on 2016-02-03.
 * https://www.acmicpc.net/problem/10828 스택
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String order, cleanVal = "";
        int top =0;
        Stack stack = new Stack();

        for (int i = 0; i <= count; i++) {
            order = sc.nextLine();
            if( order.contains("push")){
                cleanVal = order.replaceAll("[^\\d]", "");
                stack.push(cleanVal);
            }else if(order.equals("top") ){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }else if(order.equals("size") ){
                System.out.println(stack.size());
            }else if(order.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(order.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            }
        }

    }


}
