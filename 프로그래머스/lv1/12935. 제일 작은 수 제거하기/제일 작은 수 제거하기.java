class Solution {
    public int[] solution(int[] arr) {                                    
        if(arr.length == 1 || arr[0] == 10){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length - 1];
        int temp = arr[0];
        
        for(int i = 1 ; i < arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
            }
        }
        
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] == temp){
                continue;
            }
            answer[j++] = arr[i];
        }
        
        return answer;
    }
}