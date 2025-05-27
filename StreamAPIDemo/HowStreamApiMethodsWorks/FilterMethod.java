package StreamAPIDemo.HowStreamApiMethodsWorks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,85,57,36,52,39,87,29);

        // Longer way to implement Predicate interface
        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                if(n%2==0)
                    return true;
                else
                    return false;
            }
            
        };
        int result = nums.stream()
                        .filter(p)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);
        System.out.println("Result from Longer way: " + result);

        // Using Lambda Function
        Predicate<Integer> p2 = n -> n%2==0;
        int result2 = nums.stream()
                        .filter(p)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);
        System.out.println("Result from Lambda expression: " + result2);
    }
}
