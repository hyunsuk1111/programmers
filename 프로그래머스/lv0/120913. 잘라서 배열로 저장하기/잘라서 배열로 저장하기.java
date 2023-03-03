class Solution {
    public String[] solution(String my_str, int n) {        
        String[] answer = new String[((my_str.length() % n) == 0) ? (my_str.length() / n) : (my_str.length() / n) + 1];
        
       for(int i = 0; i < answer.length; i++){
           int start = n * i;
             int end = 0;
          if(start + n >= my_str.length()){
              end = my_str.length();
          } else {
              end = start + n;
          }
           answer[i] = my_str.substring(start,end);
       }
        
            
        return answer;
    }
}