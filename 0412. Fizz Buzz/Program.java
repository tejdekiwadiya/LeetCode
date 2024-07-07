// https://leetcode.com/problems/fizz-buzz/description/

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> s = new ArrayList<>();
        for (int index = 1; index <= n; index++) {
            if (index % 3 == 0 && index % 5 != 0) {
                s.add("Fizz");
            } else if (index % 5 == 0 && index % 3 != 0) {
                s.add("Buzz");
            } else if (index % 3 == 0 && index % 5 == 0) {
                s.add("FizzBuzz");
            } else {
                s.add("" + index);
            }
        }
        return s;
    }
}
