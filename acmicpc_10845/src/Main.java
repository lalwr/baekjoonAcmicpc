/**
 * Created by admin on 2016-02-04.
 * https://www.acmicpc.net/problem/10845 큐
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String order, cleanVal = "";
        int top =0; String backValue = "";
        Queue Myque = new LinkedList();

        for (int i = 0; i <= count; i++) {
            order = sc.nextLine();
            if( order.contains("push")){
                cleanVal = order.replaceAll("[^\\d]", "");
                backValue = cleanVal;
                Myque.offer(cleanVal);
            }else if(order.equals("size") ){
                System.out.println(Myque.size());
            }else if(order.equals("empty")){
                if(Myque.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(order.equals("pop")){
                if(Myque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(Myque.poll());
                }
            }else if(order.equals("front")){
                if(Myque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(Myque.element());
                }
            }else if(order.equals("back")){
                if(Myque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(backValue);
                }
            }
        }

    }


}
