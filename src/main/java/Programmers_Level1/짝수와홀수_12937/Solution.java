package Programmers_Level1.짝수와홀수_12937;

class Solution {
    public String solution(int num) {

        String answer = "";

        if(num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}

/*
다른 사람의 풀이

// 삼항 연산자 사용
class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even": "Odd";
    }
}


*/