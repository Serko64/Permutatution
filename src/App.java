import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] input = { 6, 3, 2, 7, 4, -1 };
        System.out.println(permute(input));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();

        int permitted = permutation(nums.length);
        int currentLength = 1;
        int switchFirst = 0;
        int switchIndex = 1;
        int switchLastIndex = nums.length - 1;

        int j = 1;

        for (int i = 0; i < permitted; i++) {
            boolean bool = false;

            List<Integer> list = new ArrayList<Integer>();

            for (int integer : nums) {
                list.add(integer);
            }
            if (!output.contains(list)) {
                output.add(list);
                bool = true;
            }

            if (currentLength == 1) {
                currentLength = nums.length - j;
            }
            if (nums.length == 2) {
                int temp2 = nums[0];
                nums[0] = nums[1];
                nums[1] = temp2;
            }
            if (nums.length > 2) {
                int temp2 = nums[currentLength];
                nums[currentLength] = nums[currentLength - 1];
                nums[currentLength - 1] = temp2;
                currentLength -= 1;

                if (switchFirst == (permitted / nums.length) - 1) {

                    int tempFirst = nums[0];
                    nums[0] = nums[switchIndex];
                    nums[switchIndex] = tempFirst;
                    switchFirst = 0;
                    switchIndex += 1;
                    if (switchIndex == nums.length)
                        switchIndex = 1;

                    if (bool) {
                        int tempFirst2 = nums[switchLastIndex - (i-2)];
                        nums[switchLastIndex--] = nums[switchLastIndex -(i- 2)];
                        nums[switchIndex] = tempFirst2;
                        switchLastIndex -= 1;
                        if (switchLastIndex - 1 == 0)
                            switchLastIndex = nums.length - 1;
                    }
                } else {
                    switchFirst += 1;
                }
            }
        }
        System.out.println(output.size());
        return output;
    }

    public static int permutation(int i) {
        int result = 1;
        for (int j = i; j > 1; j--) {
            result *= j;
        }
        return result;
    }
}
