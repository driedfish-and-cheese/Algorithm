public class Solution {
    public int[] solution(int N, int[] stages) {
        double[] percent = new double[N];
        int length = stages.length;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < stages.length; j++) {
                if(stages[j] == i+1) {
                    count++;
                }
            }
            percent[i] = (double) count / length;
            length -= count;
            if(length<=0){
                length = 1;
            }
        }
        double max = percent[0];
        int maxIndex = 0;
        int[] answer = new int[percent.length];
        for (int i = 0; i < percent.length; i++) {
            max = -1;
        
            for (int j = 0; j < percent.length; j++) {
                if(percent[j]>max){
                    max = percent[j];
                    maxIndex = j;
                }
            }
            answer[i] = maxIndex +1;
            percent[maxIndex] = -100;
        }
        return answer;
    }

}
