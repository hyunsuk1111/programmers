class Solution {
    public long solution(String numbers) {     
        String[] temp = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i < temp.length; i++){
            numbers = numbers.replaceAll(temp[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}