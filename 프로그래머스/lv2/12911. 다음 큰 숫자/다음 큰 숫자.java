import java.util.*;

class Solution {
    public int solution(int n) {        
        int nCount = Integer.bitCount(n);
        int b = n + 1;
        
        while(true){
            
            if(nCount == Integer.bitCount(b)){
                break;
            }else{
                b++;
            }
        }
        
        return b;
    }
}