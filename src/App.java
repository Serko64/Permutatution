import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] input = { 0, 1, 2 };
        System.out.println(permute(input));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();

        int permitted = permutation(nums.length);
        int g = 0;
        for (int i = 0; i < permitted; i++) {
         
                
            for (int integer : nums) {
                list.add(integer);
            }


            for (int j = 1; j < permitted - ((nums.length == 2) ? 1 : nums.length + 1); j++) {
                int temp2= nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp2;
            }

            output.add(list);
            list = new ArrayList<Integer>();
            g++;

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