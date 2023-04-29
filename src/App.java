import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] input = { 0, 1 };
        System.out.println(permute(input));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();

        int[] tempArray = new int[nums.length];

        for (int index = 0; index < nums.length; index++) {
            for (int i = 0; i < nums.length; i++) {
                list.add(tempArray[i]);
                int temp = nums[i];
                tempArray[i + 1] = temp;
                System.out.print(tempArray[i + 1]);
                tempArray[i] = nums[i + 1];
                System.out.println(tempArray[i]);
                list.add(tempArray[i++]);
                nums = tempArray.clone();
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