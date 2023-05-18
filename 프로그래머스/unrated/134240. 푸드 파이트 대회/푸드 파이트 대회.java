class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sbReverse = new StringBuffer();
        
        for(int i = 1; i < food.length; i++){                        
            for(int j = 0; j < food[i] / 2; j++){
                sb.append(i);
                sbReverse.append(i);
            }           
     
        }
        sb.insert(sb.length(), sbReverse.reverse());
        sb.insert((sb.length() / 2), '0');
                    
        return sb.toString();
    }
}