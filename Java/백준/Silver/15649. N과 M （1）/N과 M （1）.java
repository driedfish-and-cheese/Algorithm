
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int[]arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        Perm(arr, output, visited, 0, n, r);

        System.out.println();
    }

    static void Perm(int[]arr,int[] output ,boolean[]visited,int depth , int n ,int r){
        if(depth == r){
            print(output,r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if(visited[i] != true){
                visited[i] = true;
                output[depth] = arr[i];
                Perm(arr,output ,visited,depth+1,n,r);
                output[depth] = 0;
                visited[i] = false;
            }
        }
    }

    static void print(int[] output, int r){
        for (int i = 0; i < r; i++) {
            System.out.print(output[i]+" ");
        }
        System.out.println();
    }
}
