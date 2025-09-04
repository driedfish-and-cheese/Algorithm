

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int avg = (int)Math.round(n * 0.15);
        double sum = 0.0;
        int answer = 0;
        if(avg == 0){
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            answer = (int)Math.round(sum/n);
        }else{
            for (int i = 0; i < n-(2*avg); i++) {
                sum += arr[i+avg];
            }
            answer = (int)Math.round(sum/(n-(2*avg)));
        }
        System.out.println(answer);
    }
}
