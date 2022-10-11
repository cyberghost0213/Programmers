package Programmers_Level1.정수제곱근판결_12934;

class Solution {
    public long solution(long n) {
        long answer = 0;

        if(n == Math.pow(Math.floor(Math.sqrt(n)),2)) {
            answer = (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        } else {
            answer = -1;
        }

        return answer;
    }
}

/*
다른 사람의 풀이

// floor메서드 (내림)을 이용해서 제곱근을 확인해서 풀이
class Solution {
  public long solution(long n) {

    double i = Math.sqrt(n);

    return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
  }
}

// 그냥 직관적이여서 적었다.
class Solution {
  public long solution(long n) {
      long answer = 0;

      for (long i = 1; i <= n; i++) {
          if (i * i == n) {
              answer = (i + 1) * (i + 1);
              break;
          }
          else answer = -1;
      }
      return answer;
  }
}
 */
