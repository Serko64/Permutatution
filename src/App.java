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
        int firstArray = 0;
        int changeFirstArray = 1;
int e=0;
        for (int i = 0; i < permitted; i++) {

            for (int integer : nums) {
                list.add(integer);
            }
            output.add(list);
            list = new ArrayList<Integer>();


            for (int j = ((nums.length == 2) ? 0 : 1); j < nums.length-1; j++) {
                int temp2 = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp2;
            }

            firstArray++;
            if (firstArray == 2||firstArray==4 ) {
            
                int temp2 = nums[e];
                nums[e] = nums[changeFirstArray];
                nums[changeFirstArray] = temp2;
                changeFirstArray++;e++;
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