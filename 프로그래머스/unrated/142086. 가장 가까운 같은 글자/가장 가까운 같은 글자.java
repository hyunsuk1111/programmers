class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int index = 0;
        
        for(int i = 0 ; i < s.length(); i++){
            index = s.substring(0, i).lastIndexOf(s.charAt(i));
            if(index != -1){
                answer[i] = i - index;   
            }else{
                answer[i] = index;
            }            
        }
       
        return answer;
    }
}