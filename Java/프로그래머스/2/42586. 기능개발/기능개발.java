

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressesQueue = new LinkedList<>();
        Queue<Integer> speedsQueue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        // 큐에 넣기
        for (int i = 0; i < progresses.length; i++) {
            progressesQueue.add(progresses[i]);
            speedsQueue.add(speeds[i]); // 
        }

        while (!progressesQueue.isEmpty()) {
            // 하루 작업 진도 증가
            int size = progressesQueue.size();
            for (int i = 0; i < size; i++) {
                int progress = progressesQueue.poll();
                int speed = speedsQueue.poll();
                progressesQueue.add(progress + speed);
                speedsQueue.add(speed);
            }

            // 배포할 기능 수 세기
            int count = 0;
            while (!progressesQueue.isEmpty() && progressesQueue.peek() >= 100) {
                progressesQueue.poll();
                speedsQueue.poll();
                count++;
            }

            if (count > 0) {
                answerList.add(count);
            }
        }

        // 리스트 → 배열 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
