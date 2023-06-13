import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        StringBuffer strBfr = new StringBuffer();
        
        Scanner sc = new Scanner(System.in);        
        String a = sc.next();
        
        String[] strArr = a.split("");
        
        for(int i = 0 ; i < strArr.length; i++){
            if(strArr[i].charAt(0) >= 'a' && strArr[i].charAt(0) <= 'z'){       
                strBfr.append(strArr[i].toUpperCase());
            }else{                
                strBfr.append(strArr[i].toLowerCase());
            }
        }
        System.out.println(strBfr);
    }
}