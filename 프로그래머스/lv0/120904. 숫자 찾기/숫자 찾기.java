class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String[] tempArray = String.valueOf(num).split("");
        
        for(int i = 0; i < tempArray.length; i++){
            if(k == Integer.parseInt(tempArray[i]) && answer == -1){
                answer = i + 1;
            }
        }
        
        return answer;
    }
}