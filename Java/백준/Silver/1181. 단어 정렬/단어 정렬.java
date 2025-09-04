
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            String string = scanner.next().trim();
            arr[i] = string;
        }
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
        String[] resultArr = hashSet.toArray(new String[0]);
        Arrays.sort(resultArr,(o1,o2)-> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
