import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] input = { 0, 1,2 };
        System.out.println(permute(input));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < permutation(nums.length); i++) {
            for (int integer : nums) {
                list.add(integer);
            }
            for (int j = 0; j < permutation(nums.length) - ((nums.length==2)?1:nums.length*nums.length); j++) {
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }

            output.add(list);
            list = new ArrayList<Integer>();

        }

        return output;
    }

    public static int permutation(int i) {
        for (int j = i - 1; j > 0; j--) {
            i *= j;
        }
        return i;
    }
}