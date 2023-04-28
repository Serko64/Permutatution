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

        for (int index = 0; index < permutation(nums.length); index++) {
            for (int i = nums.length-1 ; i > 0; i--) {
                System.out.println(i);
                
                int temp = nums[i];
                tempArray[i - 1] = temp;
                tempArray[i] = nums[i];
                System.out.println("hello");
                for (int p : tempArray) {
                    list.add(p);
                    System.out.println("h");
                }

            }
            
           
            output.add(list);}
      

        return output;
    }

    public static int permutation(int i) {
        for (int j = i - 1; j > 0; j--) {
            i *= j;
        }
        return i;
    }
}