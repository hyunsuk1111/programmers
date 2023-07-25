class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuffer buffer = new StringBuffer();
        String word = A;
        for(int i = 0; i < A.length(); i++){
            if(word.equals(B)){
                return answer;
            }
                                  
            buffer.append(word.substring(word.length() - 1)).append(word, 0, word.length() -1);
            word = buffer.toString();
            buffer.delete(0, buffer.length());  
            
            answer++;
            
        }
        return -1;
    }
}