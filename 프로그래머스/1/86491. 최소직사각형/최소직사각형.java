import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        int[][] sortedArray = sortArray(sizes);
        
        width = findMaxWidth(sortedArray);
        height = findMinHeight(sortedArray);
        
        return width * height;
    }
    
    public static int[][] sortArray(int[][] sizes){
        int temp = 0;        
        
        for(int i = 0 ; i < sizes.length; i++){
            for(int j = 0; j < sizes[i].length - 1; j++){
                if(sizes[i][j] < sizes[i][j+1]){
                    temp = sizes[i][j+1];
                    sizes[i][j+1] = sizes[i][j];
                    sizes[i][j] = temp;                    
                }
            }
        }  
        return sizes;
    }
    
    public static int findMaxWidth(int[][] sizes){        
        Arrays.sort(sizes, (entry1, entry2) -> Integer.compare(entry1[0], entry2[0]));
        return sizes[sizes.length - 1][0];
    }
    
    public static int findMinHeight(int[][] sizes){
        Arrays.sort(sizes, (entry1, entry2) -> Integer.compare(entry1[1], entry2[1]));
        return sizes[sizes.length - 1][1];
    }
}