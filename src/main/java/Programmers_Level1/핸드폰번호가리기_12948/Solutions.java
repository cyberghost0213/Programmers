package Programmers_Level1.핸드폰번호가리기_12948;

class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int length = phone_number.length();

        for(int i=0; i <phone_number.length() - 4; i++){
            answer += "*";
        }

        answer = answer + phone_number.substring(length-4,length);

        return answer;
    }
}

/*
 -다른 사람의 풀이

// CharArray()로 문자 배열로 나눈뒤 풀이
 class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}

// 정규식으로 풀이
class Solution {
  public String solution(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*");
  }
}
 */