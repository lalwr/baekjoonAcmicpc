import java.io.*;

import java.util.StringTokenizer;

/**
 * Created by admin on 2016-02-15.
 * https://www.acmicpc.net/problem/11728 배열 합치기
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer in_size_arr_ = new StringTokenizer(in.readLine());

        int a_size = Integer.parseInt(in_size_arr_.nextToken());
        int b_size = Integer.parseInt(in_size_arr_.nextToken());

        int i= 0, j =0 , z=0 , k=0;
        int[] a_val = new int[a_size];
        int[] b_val = new int[b_size];
        StringTokenizer a_arr_ = new StringTokenizer(in.readLine());
        while(a_arr_.hasMoreTokens()) {
            a_val[z++] = Integer.parseInt(a_arr_.nextToken());
        }
        StringTokenizer b_arr_ = new StringTokenizer(in.readLine());
        while(b_arr_.hasMoreTokens()) {
            b_val[k++] = Integer.parseInt(b_arr_.nextToken());
        }

        while (i < a_size && j < b_size)
        {
            if (a_val[i] >= b_val[j])
            {
                out.write(b_val[j++] + " ");
            }
            else if (a_val[i] < b_val[j])
            {
                out.write(a_val[i++] + " ");
            }

        }

        if ( i == a_size ) {
            for ( z = j; z < b_size; z++)
                out.write(b_val[z] + " ");
        }
        else if ( j == b_size ) {
            for ( k = i; k < a_size; k++)
                out.write(a_val[k] + " ");
        }

        out.close();

    }
}