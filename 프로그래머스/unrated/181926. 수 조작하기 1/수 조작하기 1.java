class Solution {
    public int solution(int n, String control) {
        String[] arr = control.split("");
        
        for(int i = 0; i < arr.length; i++){
            switch(arr[i]){
                case "w":
                    n++;
                    break;
                case "s":
                    n--;
                    break;
                case "d":
                    n += 10;
                    break;
                case "a":
                    n -= 10;
                    break;
            }            
        }        
        return n;
    }
}