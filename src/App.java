import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] input = { 0, 1 };
        System.out.println(permute(input));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int[] tempArray = new int[nums.length];

        for (int index = 0; index < nums.length; index++) {
            for (int i = 1; i < nums.length; i++) {
                tempArray[i] = nums[nums.length  - 1];
                int temp = nums[nums.length - i];
                tempArray[nums.length - 1] = temp;
            }
            list.add(tempArray[index]);
            output.add(list);
        }
        return output;
    }
}