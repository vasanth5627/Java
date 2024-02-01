package Java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {
    static void findAvg(List<Integer> nums) {
        double val_double = nums.stream().mapToDouble(a -> a.doubleValue()).average().orElse(Double.NaN);
        int val_int = nums.stream().collect(Collectors.averagingInt(a -> a.intValue())).intValue();

        System.out.println(val_double + " " + val_int);
    }

    static void convertCase(List<String> names) {
        List<String> converted_names = names.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());
        System.out.println(converted_names);
    }

    static void calculate_even_odd_sum(List<Integer> nums) {
        int even_sum = nums.stream().filter(e -> e % 2 == 0).reduce(0, Integer::sum);
        int odd_sum = nums.stream().filter(e -> e % 2 != 0).reduce(0, (a, b) -> a + b);
        System.out.println("even_sum: " + even_sum);
        System.out.println("odd_sum: " + odd_sum);
    }

    static void remove_duplicates(List<Integer> nums) {
        List<Integer> distinct = nums.stream().distinct().toList();
        System.out.println(distinct);
    }

    static void count_string_start_with_specific_letter(List<String> names, char letter) {
        int count = (int) names.stream().filter(a -> a.startsWith(letter + "")).count();
        System.out.println(count);
    }

    static void sort_strings(List<String> names){
        System.out.print("ascending order: ");
        names.stream().sorted().forEach(a-> System.out.print(a+", "));
        System.out.print("descending order: ");
        names.stream().sorted(Comparator.reverseOrder()).forEach(a-> System.out.print(a+", "));
        System.out.println();
    }

    static void max_min(List<Integer> nums){
        int min = nums.stream().reduce((a,b)->{
            if(a>b) return b;
            return a;}).get();
        int max = nums.stream().max((a,b)->a-b).get();
        System.out.println("min: "+min+" max: "+max);
    }

    static void second_largest_smallest(List<Integer> nums){
        Integer second_smallest = nums.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        Integer second_largest = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("second smallest: "+second_smallest+", second largest: "+second_largest);
    }



    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 4, 6);
        findAvg(nums);
        List<String> names = Arrays.asList("delhi", "hyderabad", "chennai", "vizag", "vellore", "daman");
        convertCase(names);
        calculate_even_odd_sum(nums);
        remove_duplicates(nums);
        count_string_start_with_specific_letter(names, 'c');
        sort_strings(names);
        max_min(nums);
        second_largest_smallest(nums);
    }

}
