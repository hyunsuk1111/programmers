class Solution {
    public int[] solution(int[][] score) {
        int[] average = new int[score.length];
        int count = 0 ;
        for(int i = 0 ; i < score.length; i++){
            for(int j = 0; j < score[i].length; j++){
                average[count] += score[i][j];
            }
            count++;
        }
        
        int[] answer = new int[score.length];
        
       for(int i = 0 ; i < average.length; i++){
           int order = 1;
           for(int j = 0 ; j < average.length; j++){               
               if(average[i] < average[j]){
                    order++;
               }
              answer[i] = order;
           }
       }
        
        return answer;
    }
}