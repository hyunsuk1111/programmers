class Solution {
    public String solution(int a, int b) {      
		int[] month = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int date = 0;
        
		for (int i = 0; i < a; i++) {
			date += month[i];
		}
        
		date += b-1;
        
		return day[date % 7];		
    }
}