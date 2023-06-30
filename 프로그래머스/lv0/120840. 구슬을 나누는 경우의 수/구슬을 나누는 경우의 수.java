class Solution {
    public int solution(int balls, int share) {        
        double n = 1;
        double nTwo = balls - share;
        double divideOne = 1;
        double divideTwo = 1;
        
        while(balls > 1){
            n *= balls;
            balls--;
            
            if(nTwo > 1){
                divideOne *= nTwo;
                nTwo--;               
            }
            
            if(share > 1){
                divideTwo *= share;
                share--;     
            }
        }
        
        return (int) Math.round((n / (divideOne * divideTwo)));
    }
}