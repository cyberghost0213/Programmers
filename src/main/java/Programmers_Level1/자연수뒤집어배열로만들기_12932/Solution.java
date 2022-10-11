package Programmers_Level1.자연수뒤집어배열로만들기_12932;

class Solution {
    public int[] solution(long n) {

        String s = "" + n;
        int[] answer = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            answer[i] = (int)(n % 10);
            n = n / 10;
        }
        return answer;
    }
}

/*
다른 사람의 풀이

// while문으로 풀이
class Solution {
  public int[] solution(long n) {
      String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
  }
}


// StringBUilder클래스와 메서드를 이용해서 풀이
class Solution {
  public int[] solution(long n) {
      String s = String.valueOf(n);
      StringBuilder sb = new StringBuilder(s);
      sb = sb.reverse();
      String[] ss = sb.toString().split("");

      int[] answer = new int[ss.length];
      for (int i=0; i<ss.length; i++) {
          answer[i] = Integer.parseInt(ss[i]);
      }
      return answer;
  }
}

*/