package Programmers_Level1.평균구하기_12944;

public class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        double total = 0;

        for(int e : arr){
            total += e;
        }

        answer = (double)(total / arr.length);

        return answer;
    }

    // 스트림으로 쉽게 풀 수 있다.
}
