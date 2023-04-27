import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] input = { 0, 1 };
        System.out.println(permute(input));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int[] tempArray = nums.clone();

        for (int index = 0; index < permutation(nums.length); index++) {

            list.add(tempArray[index]);

            for (int i = nums.length - 1; i >= 0; i--) {
                int temp = nums[i];
                tempArray[index] = temp;
            }
            output.add(list);

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