import java.util.stream.Stream;

class Solution {
    public int[] solution(String my_string) {        
        return Stream.of(my_string.replaceAll("[aA-zZ]","").split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}