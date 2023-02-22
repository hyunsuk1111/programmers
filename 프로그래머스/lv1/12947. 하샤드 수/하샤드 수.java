class Solution {
    public boolean solution(int x) {
        int y = 0;
        int z = x;
        boolean answer = true;
		while(x != 0) {
			y = y +(x % 10); 
			x = x / 10;	
		}
		if((z % y) != 0) {
			answer = false; 
		}
        return answer;
    }
}