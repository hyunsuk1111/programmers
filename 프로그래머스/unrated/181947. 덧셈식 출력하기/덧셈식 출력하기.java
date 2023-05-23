import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result  = String.valueOf(a + b);
        
        System.out.println(String.valueOf(a) + " + " + String.valueOf(b) + " = " + result);
    }
}