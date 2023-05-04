
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AppTest {

    @Test
    public void test1() {
        int[] test1 = { 1 };
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<List<Integer>> listOutput = new ArrayList<>();
        listOutput.add(list);

        assertEquals(App.permute(test1), listOutput);

    }

    @Test
    public void test2() {
        int[] test2 = { 1, 2, 3 };
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> listOutput2 = new ArrayList<>();

        int[][] test2Result = { { 1, 2, 3 }, { 1, 3, 2 }, { 2, 1, 3 }, { 2, 3, 1 }, { 3, 1, 2 }, { 3, 2, 1 } };

        for (int j = 0; j < test2Result.length; j++) {
            for (int i = 0;i < test2Result.length; i++) {
                list2.add(test2Result[j][i]);

            }
            listOutput2.add(list2);
        }

        assertEquals(App.permute(test2), listOutput2);

    }

    @Test
    public void test3() {
        int[] test3 = { 5, 4, 6, 2 };
        List<Integer> list3 = new ArrayList<>();

        int[][] test3Result = { { 5, 4, 6, 2 }, { 5, 4, 2, 6 }, { 5, 6, 4, 2 }, { 5, 6, 2, 4 }, { 5, 2, 4, 6 },
                { 5, 2, 6, 4 }, { 4, 5, 6, 2 }, { 4, 5, 2, 6 }, { 4, 6, 5, 2 }, { 4, 6, 2, 5 }, { 4, 2, 5, 6 },
                { 4, 2, 6, 5 }, { 6, 5, 4, 2 }, { 6, 5, 2, 4 }, { 6, 4, 5, 2 }, { 6, 4, 2, 5 }, { 6, 2, 5, 4 },
                { 6, 2, 4, 5 }, { 2, 5, 4, 6 }, { 2, 5, 6, 4 }, { 2, 4, 5, 6 }, { 2, 4, 6, 5 }, { 2, 6, 5, 4 },
                { 2, 6, 4, 5 } };
        for (int i = 0; i < test3Result.length; i++) {

            for (Integer integer : test3Result[i]) {
                list3.add(integer);
                
            }
        }
        List<List<Integer>> listOutput3 = new ArrayList<>();

        listOutput3.add(list3);
        assertEquals(App.permute(test3), test3Result);

    }
}