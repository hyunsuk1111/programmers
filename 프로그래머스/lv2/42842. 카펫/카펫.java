class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i = brown / 2; i > 0; i--){
            for(int j = 1; j <= i; j++){
                if(i * j == brown + yellow && (i - 2) * (j - 2) == yellow){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }
}