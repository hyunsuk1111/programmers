class Solution {
    final int lamb = 12000;
    final int beverage = 2000;
    
    public int solution(int n, int k) {        
        int service = (n / 10);
        
        return (n * lamb) + ((k-service) * 2000);
    }
}