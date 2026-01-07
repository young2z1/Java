import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String[] arr_str = my_string.split("");
        return Arrays.stream(arr_str).distinct().collect(Collectors.joining());
    }
}