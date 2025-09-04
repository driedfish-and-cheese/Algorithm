
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int j = 0; j < testCase; j++) {
            int n1 = Integer.parseInt(bufferedReader.readLine());
            String br = bufferedReader.readLine();
            String k[] = br.split(" ");
            int[] note1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                note1[i] = Integer.parseInt(k[i]);
            }
            int n2 = Integer.parseInt(bufferedReader.readLine());
            int[] answer = new int[n2];
            String br2 = bufferedReader.readLine();
            String k2[] = br2.split(" ");
            int[] note2 = new int[n2];
            for (int i = 0; i < n2; i++) {
                note2[i] = Integer.parseInt(k2[i]);
            }
            Set<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < note1.length; i++) {
                hashSet.add(note1[i]);
            }
            for (int i = 0; i < note2.length; i++) {
                if(hashSet.contains(note2[i])){
                    answer[i] = 1;
                }else answer[i] = 0;
            }
            for (int i = 0; i < n2; i++) {
                System.out.println(answer[i]);
            }
        }
        
    }
}
