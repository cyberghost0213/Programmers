package Programmers_Level1.두정수사이의합_12912;

class Solution {
    public long solution(int a, int b) {
        long sum = 0;



        long start = (long)Math.min(a, b);
        long end = (long)Math.max(a, b);

        for(long i = start; i <= end; i++){
            sum += i;
        }

        return sum;
    }
}

/*

다른사람의 풀이
// 등차수열 공식을 사용해서 풀이했다.
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2; // 등차수열 공식
    }
}

// 타입떄문에 메서드를 따로 분리해서 풀이 했다.
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}
 */
