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
            int length = nums.length - 1;
            for (int i = 0; i < nums.length; i++) {
                int temp = tempArray[length];
                tempArray[length] = nums[length];
                temp=nums[length];
                tempArray[length]=temp;
                length--;
            }
            list.add(tempArray[index]);
            output.add(list);
        }
        return output;
    }
}