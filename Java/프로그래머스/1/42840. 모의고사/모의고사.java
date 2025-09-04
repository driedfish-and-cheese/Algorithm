import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;


public class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if(answers[i]==(student1[i% student1.length])) score[0]++;
            if(answers[i]==(student2[i% student2.length])) score[1]++;
            if(answers[i]==(student3[i% student3.length])) score[2]++;
        }
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(score[i] == max){
                arrayList.add(i+1);
            }
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
