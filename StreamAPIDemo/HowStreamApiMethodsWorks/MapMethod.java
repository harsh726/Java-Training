package StreamAPIDemo.HowStreamApiMethodsWorks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MapMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,85,57,36,52,39,87,29);
        
        // Lambda function for filter() method
        Predicate<Integer> p = n -> n%2==0;
        
        // Longer way to implement Function interface
        Function<Integer, Integer> fun = new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        int result = nums.stream()
                        .filter(p)
                        .map(fun)
                        .reduce(0, (c,e) -> c+e);
        System.out.println("Result from Longer way: " + result);
        
        // Using Lambda Function
        Function<Integer, Integer> fun2 = n -> n*2;
        int result2 = nums.stream()
                        .filter(p)
                        .map(fun2)
                        .reduce(0, (c,e) -> c+e);
        System.out.println("Result from Lambda expression: " + result2);
    }
}