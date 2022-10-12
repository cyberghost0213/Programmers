package Programmers_Level1.문자열을정수로만들기_12925;

class Solution {
    public int solution(String s) {
        int answer = 0;

        String arr[] = String.valueOf(s).split("");

        String str = "";

        for(String e : arr){
            str+= e;
        }

        answer = Integer.parseInt(str);

        return answer;
    }
}

/*
자바의 내장 함수를 사용해도 된다.
부호도 변환이 가능하다.
public class Solution {
    public int solution(String s) {
                return Integer.parseInt(s);
    }
}

 */