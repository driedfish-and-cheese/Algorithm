
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String br = bufferedReader.readLine();
        String k[] = br.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(k[i]);
        }
        int crtMaxLength = 1;
        int crtMinLength = 1;
        int maxLength = 1;
        int minLength = 1;
        int answer =1;
        for (int i = 1; i < n; i++) {
            if(arr[i]>arr[i-1]){
                crtMaxLength ++;
                crtMinLength = 1;
            }else if(arr[i]<arr[i-1]){
                crtMinLength++;
                crtMaxLength = 1;
            }else{
                crtMaxLength ++;
                crtMinLength ++;
            }
            answer = Math.max(answer,Math.max(crtMaxLength,crtMinLength));
        }

        System.out.println(answer);
    }
}
