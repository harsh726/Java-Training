package StreamAPIDemo.HowStreamApiMethodsWorks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,85,57,36,52,39,87,29);
        
        // Lambda function for filter() and map() method
        Predicate<Integer> p = n -> n%2==0;
        Function<Integer, Integer> fun = n -> n*2;

        int result = nums.stream()
                        .filter(p)
                        .map(fun)
                        .reduce(0, (c,e) -> c+e);
        System.out.println("Result from Longer way: " + result);
        
        // Using Lambda Function
        
        int result2 = nums.stream()
                        .filter(p)
                        .map(fun)
                        .reduce(0, (c,e) -> c+e);
        System.out.println("Result from Lambda expression: " + result2);       
    }
}