import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] input = { 5, 4, 6, 2 };
        System.out.println(permute(input));
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();

        int permitted = permutation(nums.length);

        int currentLength = nums.length - 1;
        int switchFirst = 0;
        int switchIndex=0;

        for (int i = 0; i < permitted; i++) {

            for (int integer : nums) {
                list.add(integer);
            }

            output.add(list);
            list = new ArrayList<Integer>();

            if ((currentLength - 1) == 0)
                currentLength = nums.length - 1;
            int temp2 = nums[currentLength];
            nums[currentLength] = nums[currentLength - 1];
            nums[currentLength - 1] = temp2;
            currentLength--;

            if (switchFirst == permitted / nums.length) {
                int tempFirst = nums[0];
                nums[0] = nums[switchIndex];
                nums[switchIndex] = tempFirst;
                switchFirst = 0;
                switchIndex++;

            } else {
                switchFirst++;
            }

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