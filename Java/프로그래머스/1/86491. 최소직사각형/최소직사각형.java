import java.util.Arrays;
class Solution {
   public int solution(int[][] sizes) {
        int answer = 0;
        int width = Arrays.stream(sizes).flatMapToInt(Arrays::stream).max().getAsInt();
        int[] min_array = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0]<sizes[i][1]){
                min_array[i]=sizes[i][0];
            }else{
                min_array[i]=sizes[i][1];
            }
        }
        int height = Arrays.stream(min_array).max().getAsInt();
        return width*height;
    }
}