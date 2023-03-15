class Solution {
    public int solution(String s) {        
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] strNumber = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < number.length; i++){
            s = s.replaceAll(strNumber[i], number[i]);
        }
        
        return Integer.parseInt(s);
    }
}