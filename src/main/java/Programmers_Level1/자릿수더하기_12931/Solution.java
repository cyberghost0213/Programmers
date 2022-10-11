package Programmers_Level1.자릿수더하기_12931;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int total = 0;

        while(true)
        {
            total += n % 10;
            n = n / 10;

            if(n < 10){
                total += n;
                break;
            }
        }

        answer = total;

        return answer;
    }
}

/*
다른 사람의 풀이

// while을 이욯해서 풀이
class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }

        return answer;
    }
}

// 아스키 코드로 풀이
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        char[] arr = Integer.toString(n).toCharArray();

        for(int i = 0; i < arr.length; i++){
            answer += arr[i] - 48;
        }

        return answer;
    }
}

*/


