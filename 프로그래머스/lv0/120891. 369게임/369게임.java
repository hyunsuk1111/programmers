class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] tempArray = String.valueOf(order).split("");
                        
        for(int i = 0; i < tempArray.length; i++){
            if(Integer.parseInt(tempArray[i]) % 3 == 0 && Integer.parseInt(tempArray[i]) != 0){
                answer++;
            }
        }
        
        return answer;
    }
}