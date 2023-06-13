class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int index = (num % 2 != 0) ? ((total / num) - (num / 2)) : ((total / num) - ((num - 1 ) / 2)) ;
        
        for(int i = 0; i < num; i++){
            answer[i] = index;
            index++;
        }
        
        return answer;
    }
}