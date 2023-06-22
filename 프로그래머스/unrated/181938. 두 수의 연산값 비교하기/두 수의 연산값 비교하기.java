class Solution {
    public int solution(int a, int b) {
        String tempStr = String.valueOf(a) + String.valueOf(b);
        
        return (2 * a * b) > Integer.parseInt(tempStr) ? (2 * a * b) : Integer.parseInt(tempStr) ;
    }
}