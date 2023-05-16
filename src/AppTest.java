
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AppTest {

    @Test
    public void test() {
        int[] test = { 1, 2 };
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> listOutput2 = new ArrayList<>();

        int[][] test2Result = { { 1, 2 }, { 2, 1 } };

        for (int i = 0; i < test2Result.length; i++) {
            for (int j = 0; j < test2Result[i].length; j++) {
                list2.add(test2Result[i][j]);
            }
            listOutput2.add(list2);
            list2 = new ArrayList<>();

        }

        assertEquals(listOutput2, App.permute(test));

    }

    @Test
    public void test1() {
        int[] test1 = { 1 };
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<List<Integer>> listOutput = new ArrayList<>();
        listOutput.add(list);

        assertEquals(listOutput, App.permute(test1));

    }

    @Test
    public void test2() {
        int[] test2 = { 1, 2, 3 };
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> listOutput2 = new ArrayList<>();

        int[][] test2Result = { { 1, 2, 3 }, { 1, 3, 2 }, { 2, 1, 3 }, { 2, 3, 1 }, { 3, 1, 2 }, { 3, 2, 1 } };

        for (int i = 0; i < test2Result.length; i++) {
            for (int j = 0; j < test2Result[i].length; j++) {
                list2.add(test2Result[i][j]);
            }
            listOutput2.add(list2);
            list2 = new ArrayList<>();
        }

        assertEquals(listOutput2, App.permute(test2));

    }

    @Test
    public void test3() {
        int[] test3 = { 5, 4, 6, 2 };
        List<Integer> list3 = new ArrayList<>();
        List<List<Integer>> listOutput3 = new ArrayList<>();

        int[][] test3Result = { { 5, 4, 6, 2 }, { 5, 4, 2, 6 }, { 5, 2, 4, 6 }, { 5, 2, 6, 4 }, { 5, 6, 2, 4 },
                { 5, 6, 4, 2 }, { 4, 5, 6, 2 }, { 4, 5, 2, 6 }, { 4, 2, 5, 6 }, { 4, 2, 6, 5 }, { 4, 6, 2, 5 },
                { 4, 6, 5, 2 }, { 6, 5, 4, 2 }, { 6, 5, 2, 4 }, { 6, 2, 5, 4 }, { 6, 2, 4, 5 },
                { 6, 4, 2, 5 }, { 6, 4, 5, 2 }, { 2, 5, 4, 6 }, { 2, 5, 6, 4 }, { 2, 6, 5, 4 }, { 2, 6, 4, 5 },
                { 2, 4, 6, 5 }, { 2, 4, 5, 6 } };
        for (int i = 0; i < test3Result.length; i++) {
            for (int j = 0; j < test3Result[i].length; j++) {
                list3.add(test3Result[i][j]);
            }
            listOutput3.add(list3);
            list3 = new ArrayList<>();

        }

        assertEquals(listOutput3, App.permute(test3));

    }

    @Test
    public void test4() {
        int[] test4 = { 6, 3, 2, 7, 4, -1 };
        List<Integer> list4 = new ArrayList<>();
        List<List<Integer>> listOutput4 = new ArrayList<>();

        int[][] test4Result = { { 6, 3, 2, 7, 4, -1 }, { 6, 3, 2, 7, -1, 4 }, { 6, 3, 2, 4, 7, -1 },
                { 6, 3, 2, 4, -1, 7 }, { 6, 3, 2, -1, 7, 4 }, { 6, 3, 2, -1, 4, 7 }, { 6, 3, 7, 2, 4, -1 },
                { 6, 3, 7, 2, -1, 4 }, { 6, 3, 7, 4, 2, -1 }, { 6, 3, 7, 4, -1, 2 }, { 6, 3, 7, -1, 2, 4 },
                { 6, 3, 7, -1, 4, 2 }, { 6, 3, 4, 2, 7, -1 }, { 6, 3, 4, 2, -1, 7 }, { 6, 3, 4, 7, 2, -1 },
                { 6, 3, 4, 7, -1, 2 }, { 6, 3, 4, -1, 2, 7 }, { 6, 3, 4, -1, 7, 2 }, { 6, 3, -1, 2, 7, 4 },
                { 6, 3, -1, 2, 4, 7 }, { 6, 3, -1, 7, 2, 4 }, { 6, 3, -1, 7, 4, 2 }, { 6, 3, -1, 4, 2, 7 },
                { 6, 3, -1, 4, 7, 2 }, { 6, 2, 3, 7, 4, -1 }, { 6, 2, 3, 7, -1, 4 }, { 6, 2, 3, 4, 7, -1 },
                { 6, 2, 3, 4, -1, 7 }, { 6, 2, 3, -1, 7, 4 }, { 6, 2, 3, -1, 4, 7 }, { 6, 2, 7, 3, 4, -1 },
                { 6, 2, 7, 3, -1, 4 }, { 6, 2, 7, 4, 3, -1 }, { 6, 2, 7, 4, -1, 3 }, { 6, 2, 7, -1, 3, 4 },
                { 6, 2, 7, -1, 4, 3 }, { 6, 2, 4, 3, 7, -1 }, { 6, 2, 4, 3, -1, 7 }, { 6, 2, 4, 7, 3, -1 },
                { 6, 2, 4, 7, -1, 3 }, { 6, 2, 4, -1, 3, 7 }, { 6, 2, 4, -1, 7, 3 }, { 6, 2, -1, 3, 7, 4 },
                { 6, 2, -1, 3, 4, 7 }, { 6, 2, -1, 7, 3, 4 }, { 6, 2, -1, 7, 4, 3 }, { 6, 2, -1, 4, 3, 7 },
                { 6, 2, -1, 4, 7, 3 }, { 6, 7, 3, 2, 4, -1 }, { 6, 7, 3, 2, -1, 4 }, { 6, 7, 3, 4, 2, -1 },
                { 6, 7, 3, 4, -1, 2 }, { 6, 7, 3, -1, 2, 4 }, { 6, 7, 3, -1, 4, 2 }, { 6, 7, 2, 3, 4, -1 },
                { 6, 7, 2, 3, -1, 4 }, { 6, 7, 2, 4, 3, -1 }, { 6, 7, 2, 4, -1, 3 }, { 6, 7, 2, -1, 3, 4 },
                { 6, 7, 2, -1, 4, 3 }, { 6, 7, 4, 3, 2, -1 }, { 6, 7, 4, 3, -1, 2 }, { 6, 7, 4, 2, 3, -1 },
                { 6, 7, 4, 2, -1, 3 }, { 6, 7, 4, -1, 3, 2 }, { 6, 7, 4, -1, 2, 3 }, { 6, 7, -1, 3, 2, 4 },
                { 6, 7, -1, 3, 4, 2 }, { 6, 7, -1, 2, 3, 4 }, { 6, 7, -1, 2, 4, 3 }, { 6, 7, -1, 4, 3, 2 },
                { 6, 7, -1, 4, 2, 3 }, { 6, 4, 3, 2, 7, -1 }, { 6, 4, 3, 2, -1, 7 }, { 6, 4, 3, 7, 2, -1 },
                { 6, 4, 3, 7, -1, 2 }, { 6, 4, 3, -1, 2, 7 }, { 6, 4, 3, -1, 7, 2 }, { 6, 4, 2, 3, 7, -1 },
                { 6, 4, 2, 3, -1, 7 }, { 6, 4, 2, 7, 3, -1 }, { 6, 4, 2, 7, -1, 3 }, { 6, 4, 2, -1, 3, 7 },
                { 6, 4, 2, -1, 7, 3 }, { 6, 4, 7, 3, 2, -1 }, { 6, 4, 7, 3, -1, 2 }, { 6, 4, 7, 2, 3, -1 },
                { 6, 4, 7, 2, -1, 3 }, { 6, 4, 7, -1, 3, 2 }, { 6, 4, 7, -1, 2, 3 }, { 6, 4, -1, 3, 2, 7 },
                { 6, 4, -1, 3, 7, 2 }, { 6, 4, -1, 2, 3, 7 }, { 6, 4, -1, 2, 7, 3 }, { 6, 4, -1, 7, 3, 2 },
                { 6, 4, -1, 7, 2, 3 }, { 6, -1, 3, 2, 7, 4 }, { 6, -1, 3, 2, 4, 7 }, { 6, -1, 3, 7, 2, 4 },
                { 6, -1, 3, 7, 4, 2 }, { 6, -1, 3, 4, 2, 7 }, { 6, -1, 3, 4, 7, 2 }, { 6, -1, 2, 3, 7, 4 },
                { 6, -1, 2, 3, 4, 7 }, { 6, -1, 2, 7, 3, 4 }, { 6, -1, 2, 7, 4, 3 }, { 6, -1, 2, 4, 3, 7 },
                { 6, -1, 2, 4, 7, 3 }, { 6, -1, 7, 3, 2, 4 }, { 6, -1, 7, 3, 4, 2 }, { 6, -1, 7, 2, 3, 4 },
                { 6, -1, 7, 2, 4, 3 }, { 6, -1, 7, 4, 3, 2 }, { 6, -1, 7, 4, 2, 3 }, { 6, -1, 4, 3, 2, 7 },
                { 6, -1, 4, 3, 7, 2 }, { 6, -1, 4, 2, 3, 7 }, { 6, -1, 4, 2, 7, 3 }, { 6, -1, 4, 7, 3, 2 },
                { 6, -1, 4, 7, 2, 3 }, { 3, 6, 2, 7, 4, -1 }, { 3, 6, 2, 7, -1, 4 }, { 3, 6, 2, 4, 7, -1 },
                { 3, 6, 2, 4, -1, 7 }, { 3, 6, 2, -1, 7, 4 }, { 3, 6, 2, -1, 4, 7 }, { 3, 6, 7, 2, 4, -1 },
                { 3, 6, 7, 2, -1, 4 }, { 3, 6, 7, 4, 2, -1 }, { 3, 6, 7, 4, -1, 2 }, { 3, 6, 7, -1, 2, 4 },
                { 3, 6, 7, -1, 4, 2 }, { 3, 6, 4, 2, 7, -1 }, { 3, 6, 4, 2, -1, 7 }, { 3, 6, 4, 7, 2, -1 },
                { 3, 6, 4, 7, -1, 2 }, { 3, 6, 4, -1, 2, 7 }, { 3, 6, 4, -1, 7, 2 }, { 3, 6, -1, 2, 7, 4 },
                { 3, 6, -1, 2, 4, 7 }, { 3, 6, -1, 7, 2, 4 }, { 3, 6, -1, 7, 4, 2 }, { 3, 6, -1, 4, 2, 7 },
                { 3, 6, -1, 4, 7, 2 }, { 3, 2, 6, 7, 4, -1 }, { 3, 2, 6, 7, -1, 4 }, { 3, 2, 6, 4, 7, -1 },
                { 3, 2, 6, 4, -1, 7 }, { 3, 2, 6, -1, 7, 4 }, { 3, 2, 6, -1, 4, 7 }, { 3, 2, 7, 6, 4, -1 },
                { 3, 2, 7, 6, -1, 4 }, { 3, 2, 7, 4, 6, -1 }, { 3, 2, 7, 4, -1, 6 }, { 3, 2, 7, -1, 6, 4 },
                { 3, 2, 7, -1, 4, 6 }, { 3, 2, 4, 6, 7, -1 }, { 3, 2, 4, 6, -1, 7 }, { 3, 2, 4, 7, 6, -1 },
                { 3, 2, 4, 7, -1, 6 }, { 3, 2, 4, -1, 6, 7 }, { 3, 2, 4, -1, 7, 6 }, { 3, 2, -1, 6, 7, 4 },
                { 3, 2, -1, 6, 4, 7 }, { 3, 2, -1, 7, 6, 4 }, { 3, 2, -1, 7, 4, 6 }, { 3, 2, -1, 4, 6, 7 },
                { 3, 2, -1, 4, 7, 6 }, { 3, 7, 6, 2, 4, -1 }, { 3, 7, 6, 2, -1, 4 }, { 3, 7, 6, 4, 2, -1 },
                { 3, 7, 6, 4, -1, 2 }, { 3, 7, 6, -1, 2, 4 }, { 3, 7, 6, -1, 4, 2 }, { 3, 7, 2, 6, 4, -1 },
                { 3, 7, 2, 6, -1, 4 }, { 3, 7, 2, 4, 6, -1 }, { 3, 7, 2, 4, -1, 6 }, { 3, 7, 2, -1, 6, 4 },
                { 3, 7, 2, -1, 4, 6 }, { 3, 7, 4, 6, 2, -1 }, { 3, 7, 4, 6, -1, 2 }, { 3, 7, 4, 2, 6, -1 },
                { 3, 7, 4, 2, -1, 6 }, { 3, 7, 4, -1, 6, 2 }, { 3, 7, 4, -1, 2, 6 }, { 3, 7, -1, 6, 2, 4 },
                { 3, 7, -1, 6, 4, 2 }, { 3, 7, -1, 2, 6, 4 }, { 3, 7, -1, 2, 4, 6 }, { 3, 7, -1, 4, 6, 2 },
                { 3, 7, -1, 4, 2, 6 }, { 3, 4, 6, 2, 7, -1 }, { 3, 4, 6, 2, -1, 7 }, { 3, 4, 6, 7, 2, -1 },
                { 3, 4, 6, 7, -1, 2 }, { 3, 4, 6, -1, 2, 7 }, { 3, 4, 6, -1, 7, 2 }, { 3, 4, 2, 6, 7, -1 },
                { 3, 4, 2, 6, -1, 7 }, { 3, 4, 2, 7, 6, -1 }, { 3, 4, 2, 7, -1, 6 }, { 3, 4, 2, -1, 6, 7 },
                { 3, 4, 2, -1, 7, 6 }, { 3, 4, 7, 6, 2, -1 }, { 3, 4, 7, 6, -1, 2 }, { 3, 4, 7, 2, 6, -1 },
                { 3, 4, 7, 2, -1, 6 }, { 3, 4, 7, -1, 6, 2 }, { 3, 4, 7, -1, 2, 6 }, { 3, 4, -1, 6, 2, 7 },
                { 3, 4, -1, 6, 7, 2 }, { 3, 4, -1, 2, 6, 7 }, { 3, 4, -1, 2, 7, 6 }, { 3, 4, -1, 7, 6, 2 },
                { 3, 4, -1, 7, 2, 6 }, { 3, -1, 6, 2, 7, 4 }, { 3, -1, 6, 2, 4, 7 }, { 3, -1, 6, 7, 2, 4 },
                { 3, -1, 6, 7, 4, 2 }, { 3, -1, 6, 4, 2, 7 }, { 3, -1, 6, 4, 7, 2 }, { 3, -1, 2, 6, 7, 4 },
                { 3, -1, 2, 6, 4, 7 }, { 3, -1, 2, 7, 6, 4 }, { 3, -1, 2, 7, 4, 6 }, { 3, -1, 2, 4, 6, 7 },
                { 3, -1, 2, 4, 7, 6 }, { 3, -1, 7, 6, 2, 4 }, { 3, -1, 7, 6, 4, 2 }, { 3, -1, 7, 2, 6, 4 },
                { 3, -1, 7, 2, 4, 6 }, { 3, -1, 7, 4, 6, 2 }, { 3, -1, 7, 4, 2, 6 }, { 3, -1, 4, 6, 2, 7 },
                { 3, -1, 4, 6, 7, 2 }, { 3, -1, 4, 2, 6, 7 }, { 3, -1, 4, 2, 7, 6 }, { 3, -1, 4, 7, 6, 2 },
                { 3, -1, 4, 7, 2, 6 }, { 2, 6, 3, 7, 4, -1 }, { 2, 6, 3, 7, -1, 4 }, { 2, 6, 3, 4, 7, -1 },
                { 2, 6, 3, 4, -1, 7 }, { 2, 6, 3, -1, 7, 4 }, { 2, 6, 3, -1, 4, 7 }, { 2, 6, 7, 3, 4, -1 },
                { 2, 6, 7, 3, -1, 4 }, { 2, 6, 7, 4, 3, -1 }, { 2, 6, 7, 4, -1, 3 }, { 2, 6, 7, -1, 3, 4 },
                { 2, 6, 7, -1, 4, 3 }, { 2, 6, 4, 3, 7, -1 }, { 2, 6, 4, 3, -1, 7 }, { 2, 6, 4, 7, 3, -1 },
                { 2, 6, 4, 7, -1, 3 }, { 2, 6, 4, -1, 3, 7 }, { 2, 6, 4, -1, 7, 3 }, { 2, 6, -1, 3, 7, 4 },
                { 2, 6, -1, 3, 4, 7 }, { 2, 6, -1, 7, 3, 4 }, { 2, 6, -1, 7, 4, 3 }, { 2, 6, -1, 4, 3, 7 },
                { 2, 6, -1, 4, 7, 3 }, { 2, 3, 6, 7, 4, -1 }, { 2, 3, 6, 7, -1, 4 }, { 2, 3, 6, 4, 7, -1 },
                { 2, 3, 6, 4, -1, 7 }, { 2, 3, 6, -1, 7, 4 }, { 2, 3, 6, -1, 4, 7 }, { 2, 3, 7, 6, 4, -1 },
                { 2, 3, 7, 6, -1, 4 }, { 2, 3, 7, 4, 6, -1 }, { 2, 3, 7, 4, -1, 6 }, { 2, 3, 7, -1, 6, 4 },
                { 2, 3, 7, -1, 4, 6 }, { 2, 3, 4, 6, 7, -1 }, { 2, 3, 4, 6, -1, 7 }, { 2, 3, 4, 7, 6, -1 },
                { 2, 3, 4, 7, -1, 6 }, { 2, 3, 4, -1, 6, 7 }, { 2, 3, 4, -1, 7, 6 }, { 2, 3, -1, 6, 7, 4 },
                { 2, 3, -1, 6, 4, 7 }, { 2, 3, -1, 7, 6, 4 }, { 2, 3, -1, 7, 4, 6 }, { 2, 3, -1, 4, 6, 7 },
                { 2, 3, -1, 4, 7, 6 }, { 2, 7, 6, 3, 4, -1 }, { 2, 7, 6, 3, -1, 4 }, { 2, 7, 6, 4, 3, -1 },
                { 2, 7, 6, 4, -1, 3 }, { 2, 7, 6, -1, 3, 4 }, { 2, 7, 6, -1, 4, 3 }, { 2, 7, 3, 6, 4, -1 },
                { 2, 7, 3, 6, -1, 4 }, { 2, 7, 3, 4, 6, -1 }, { 2, 7, 3, 4, -1, 6 }, { 2, 7, 3, -1, 6, 4 },
                { 2, 7, 3, -1, 4, 6 }, { 2, 7, 4, 6, 3, -1 }, { 2, 7, 4, 6, -1, 3 }, { 2, 7, 4, 3, 6, -1 },
                { 2, 7, 4, 3, -1, 6 }, { 2, 7, 4, -1, 6, 3 }, { 2, 7, 4, -1, 3, 6 }, { 2, 7, -1, 6, 3, 4 },
                { 2, 7, -1, 6, 4, 3 }, { 2, 7, -1, 3, 6, 4 }, { 2, 7, -1, 3, 4, 6 }, { 2, 7, -1, 4, 6, 3 },
                { 2, 7, -1, 4, 3, 6 }, { 2, 4, 6, 3, 7, -1 }, { 2, 4, 6, 3, -1, 7 }, { 2, 4, 6, 7, 3, -1 },
                { 2, 4, 6, 7, -1, 3 }, { 2, 4, 6, -1, 3, 7 }, { 2, 4, 6, -1, 7, 3 }, { 2, 4, 3, 6, 7, -1 },
                { 2, 4, 3, 6, -1, 7 }, { 2, 4, 3, 7, 6, -1 }, { 2, 4, 3, 7, -1, 6 }, { 2, 4, 3, -1, 6, 7 },
                { 2, 4, 3, -1, 7, 6 }, { 2, 4, 7, 6, 3, -1 }, { 2, 4, 7, 6, -1, 3 }, { 2, 4, 7, 3, 6, -1 },
                { 2, 4, 7, 3, -1, 6 }, { 2, 4, 7, -1, 6, 3 }, { 2, 4, 7, -1, 3, 6 }, { 2, 4, -1, 6, 3, 7 },
                { 2, 4, -1, 6, 7, 3 }, { 2, 4, -1, 3, 6, 7 }, { 2, 4, -1, 3, 7, 6 }, { 2, 4, -1, 7, 6, 3 },
                { 2, 4, -1, 7, 3, 6 }, { 2, -1, 6, 3, 7, 4 }, { 2, -1, 6, 3, 4, 7 }, { 2, -1, 6, 7, 3, 4 },
                { 2, -1, 6, 7, 4, 3 }, { 2, -1, 6, 4, 3, 7 }, { 2, -1, 6, 4, 7, 3 }, { 2, -1, 3, 6, 7, 4 },
                { 2, -1, 3, 6, 4, 7 }, { 2, -1, 3, 7, 6, 4 }, { 2, -1, 3, 7, 4, 6 }, { 2, -1, 3, 4, 6, 7 },
                { 2, -1, 3, 4, 7, 6 }, { 2, -1, 7, 6, 3, 4 }, { 2, -1, 7, 6, 4, 3 }, { 2, -1, 7, 3, 6, 4 },
                { 2, -1, 7, 3, 4, 6 }, { 2, -1, 7, 4, 6, 3 }, { 2, -1, 7, 4, 3, 6 }, { 2, -1, 4, 6, 3, 7 },
                { 2, -1, 4, 6, 7, 3 }, { 2, -1, 4, 3, 6, 7 }, { 2, -1, 4, 3, 7, 6 }, { 2, -1, 4, 7, 6, 3 },
                { 2, -1, 4, 7, 3, 6 }, { 7, 6, 3, 2, 4, -1 }, { 7, 6, 3, 2, -1, 4 }, { 7, 6, 3, 4, 2, -1 },
                { 7, 6, 3, 4, -1, 2 }, { 7, 6, 3, -1, 2, 4 }, { 7, 6, 3, -1, 4, 2 }, { 7, 6, 2, 3, 4, -1 },
                { 7, 6, 2, 3, -1, 4 }, { 7, 6, 2, 4, 3, -1 }, { 7, 6, 2, 4, -1, 3 }, { 7, 6, 2, -1, 3, 4 },
                { 7, 6, 2, -1, 4, 3 }, { 7, 6, 4, 3, 2, -1 }, { 7, 6, 4, 3, -1, 2 }, { 7, 6, 4, 2, 3, -1 },
                { 7, 6, 4, 2, -1, 3 }, { 7, 6, 4, -1, 3, 2 }, { 7, 6, 4, -1, 2, 3 }, { 7, 6, -1, 3, 2, 4 },
                { 7, 6, -1, 3, 4, 2 }, { 7, 6, -1, 2, 3, 4 }, { 7, 6, -1, 2, 4, 3 }, { 7, 6, -1, 4, 3, 2 },
                { 7, 6, -1, 4, 2, 3 }, { 7, 3, 6, 2, 4, -1 }, { 7, 3, 6, 2, -1, 4 }, { 7, 3, 6, 4, 2, -1 },
                { 7, 3, 6, 4, -1, 2 }, { 7, 3, 6, -1, 2, 4 }, { 7, 3, 6, -1, 4, 2 }, { 7, 3, 2, 6, 4, -1 },
                { 7, 3, 2, 6, -1, 4 }, { 7, 3, 2, 4, 6, -1 }, { 7, 3, 2, 4, -1, 6 }, { 7, 3, 2, -1, 6, 4 },
                { 7, 3, 2, -1, 4, 6 }, { 7, 3, 4, 6, 2, -1 }, { 7, 3, 4, 6, -1, 2 }, { 7, 3, 4, 2, 6, -1 },
                { 7, 3, 4, 2, -1, 6 }, { 7, 3, 4, -1, 6, 2 }, { 7, 3, 4, -1, 2, 6 }, { 7, 3, -1, 6, 2, 4 },
                { 7, 3, -1, 6, 4, 2 }, { 7, 3, -1, 2, 6, 4 }, { 7, 3, -1, 2, 4, 6 }, { 7, 3, -1, 4, 6, 2 },
                { 7, 3, -1, 4, 2, 6 }, { 7, 2, 6, 3, 4, -1 }, { 7, 2, 6, 3, -1, 4 }, { 7, 2, 6, 4, 3, -1 },
                { 7, 2, 6, 4, -1, 3 }, { 7, 2, 6, -1, 3, 4 }, { 7, 2, 6, -1, 4, 3 }, { 7, 2, 3, 6, 4, -1 },
                { 7, 2, 3, 6, -1, 4 }, { 7, 2, 3, 4, 6, -1 }, { 7, 2, 3, 4, -1, 6 }, { 7, 2, 3, -1, 6, 4 },
                { 7, 2, 3, -1, 4, 6 }, { 7, 2, 4, 6, 3, -1 }, { 7, 2, 4, 6, -1, 3 }, { 7, 2, 4, 3, 6, -1 },
                { 7, 2, 4, 3, -1, 6 }, { 7, 2, 4, -1, 6, 3 }, { 7, 2, 4, -1, 3, 6 }, { 7, 2, -1, 6, 3, 4 },
                { 7, 2, -1, 6, 4, 3 }, { 7, 2, -1, 3, 6, 4 }, { 7, 2, -1, 3, 4, 6 }, { 7, 2, -1, 4, 6, 3 },
                { 7, 2, -1, 4, 3, 6 }, { 7, 4, 6, 3, 2, -1 }, { 7, 4, 6, 3, -1, 2 }, { 7, 4, 6, 2, 3, -1 },
                { 7, 4, 6, 2, -1, 3 }, { 7, 4, 6, -1, 3, 2 }, { 7, 4, 6, -1, 2, 3 }, { 7, 4, 3, 6, 2, -1 },
                { 7, 4, 3, 6, -1, 2 }, { 7, 4, 3, 2, 6, -1 }, { 7, 4, 3, 2, -1, 6 }, { 7, 4, 3, -1, 6, 2 },
                { 7, 4, 3, -1, 2, 6 }, { 7, 4, 2, 6, 3, -1 }, { 7, 4, 2, 6, -1, 3 }, { 7, 4, 2, 3, 6, -1 },
                { 7, 4, 2, 3, -1, 6 }, { 7, 4, 2, -1, 6, 3 }, { 7, 4, 2, -1, 3, 6 }, { 7, 4, -1, 6, 3, 2 },
                { 7, 4, -1, 6, 2, 3 }, { 7, 4, -1, 3, 6, 2 }, { 7, 4, -1, 3, 2, 6 }, { 7, 4, -1, 2, 6, 3 },
                { 7, 4, -1, 2, 3, 6 }, { 7, -1, 6, 3, 2, 4 }, { 7, -1, 6, 3, 4, 2 }, { 7, -1, 6, 2, 3, 4 },
                { 7, -1, 6, 2, 4, 3 }, { 7, -1, 6, 4, 3, 2 }, { 7, -1, 6, 4, 2, 3 }, { 7, -1, 3, 6, 2, 4 },
                { 7, -1, 3, 6, 4, 2 }, { 7, -1, 3, 2, 6, 4 }, { 7, -1, 3, 2, 4, 6 }, { 7, -1, 3, 4, 6, 2 },
                { 7, -1, 3, 4, 2, 6 }, { 7, -1, 2, 6, 3, 4 }, { 7, -1, 2, 6, 4, 3 }, { 7, -1, 2, 3, 6, 4 },
                { 7, -1, 2, 3, 4, 6 }, { 7, -1, 2, 4, 6, 3 }, { 7, -1, 2, 4, 3, 6 }, { 7, -1, 4, 6, 3, 2 },
                { 7, -1, 4, 6, 2, 3 }, { 7, -1, 4, 3, 6, 2 }, { 7, -1, 4, 3, 2, 6 }, { 7, -1, 4, 2, 6, 3 },
                { 7, -1, 4, 2, 3, 6 }, { 4, 6, 3, 2, 7, -1 }, { 4, 6, 3, 2, -1, 7 }, { 4, 6, 3, 7, 2, -1 },
                { 4, 6, 3, 7, -1, 2 }, { 4, 6, 3, -1, 2, 7 }, { 4, 6, 3, -1, 7, 2 }, { 4, 6, 2, 3, 7, -1 },
                { 4, 6, 2, 3, -1, 7 }, { 4, 6, 2, 7, 3, -1 }, { 4, 6, 2, 7, -1, 3 }, { 4, 6, 2, -1, 3, 7 },
                { 4, 6, 2, -1, 7, 3 }, { 4, 6, 7, 3, 2, -1 }, { 4, 6, 7, 3, -1, 2 }, { 4, 6, 7, 2, 3, -1 },
                { 4, 6, 7, 2, -1, 3 }, { 4, 6, 7, -1, 3, 2 }, { 4, 6, 7, -1, 2, 3 }, { 4, 6, -1, 3, 2, 7 },
                { 4, 6, -1, 3, 7, 2 }, { 4, 6, -1, 2, 3, 7 }, { 4, 6, -1, 2, 7, 3 }, { 4, 6, -1, 7, 3, 2 },
                { 4, 6, -1, 7, 2, 3 }, { 4, 3, 6, 2, 7, -1 }, { 4, 3, 6, 2, -1, 7 }, { 4, 3, 6, 7, 2, -1 },
                { 4, 3, 6, 7, -1, 2 }, { 4, 3, 6, -1, 2, 7 }, { 4, 3, 6, -1, 7, 2 }, { 4, 3, 2, 6, 7, -1 },
                { 4, 3, 2, 6, -1, 7 }, { 4, 3, 2, 7, 6, -1 }, { 4, 3, 2, 7, -1, 6 }, { 4, 3, 2, -1, 6, 7 },
                { 4, 3, 2, -1, 7, 6 }, { 4, 3, 7, 6, 2, -1 }, { 4, 3, 7, 6, -1, 2 }, { 4, 3, 7, 2, 6, -1 },
                { 4, 3, 7, 2, -1, 6 }, { 4, 3, 7, -1, 6, 2 }, { 4, 3, 7, -1, 2, 6 }, { 4, 3, -1, 6, 2, 7 },
                { 4, 3, -1, 6, 7, 2 }, { 4, 3, -1, 2, 6, 7 }, { 4, 3, -1, 2, 7, 6 }, { 4, 3, -1, 7, 6, 2 },
                { 4, 3, -1, 7, 2, 6 }, { 4, 2, 6, 3, 7, -1 }, { 4, 2, 6, 3, -1, 7 }, { 4, 2, 6, 7, 3, -1 },
                { 4, 2, 6, 7, -1, 3 }, { 4, 2, 6, -1, 3, 7 }, { 4, 2, 6, -1, 7, 3 }, { 4, 2, 3, 6, 7, -1 },
                { 4, 2, 3, 6, -1, 7 }, { 4, 2, 3, 7, 6, -1 }, { 4, 2, 3, 7, -1, 6 }, { 4, 2, 3, -1, 6, 7 },
                { 4, 2, 3, -1, 7, 6 }, { 4, 2, 7, 6, 3, -1 }, { 4, 2, 7, 6, -1, 3 }, { 4, 2, 7, 3, 6, -1 },
                { 4, 2, 7, 3, -1, 6 }, { 4, 2, 7, -1, 6, 3 }, { 4, 2, 7, -1, 3, 6 }, { 4, 2, -1, 6, 3, 7 },
                { 4, 2, -1, 6, 7, 3 }, { 4, 2, -1, 3, 6, 7 }, { 4, 2, -1, 3, 7, 6 }, { 4, 2, -1, 7, 6, 3 },
                { 4, 2, -1, 7, 3, 6 }, { 4, 7, 6, 3, 2, -1 }, { 4, 7, 6, 3, -1, 2 }, { 4, 7, 6, 2, 3, -1 },
                { 4, 7, 6, 2, -1, 3 }, { 4, 7, 6, -1, 3, 2 }, { 4, 7, 6, -1, 2, 3 }, { 4, 7, 3, 6, 2, -1 },
                { 4, 7, 3, 6, -1, 2 }, { 4, 7, 3, 2, 6, -1 }, { 4, 7, 3, 2, -1, 6 }, { 4, 7, 3, -1, 6, 2 },
                { 4, 7, 3, -1, 2, 6 }, { 4, 7, 2, 6, 3, -1 }, { 4, 7, 2, 6, -1, 3 }, { 4, 7, 2, 3, 6, -1 },
                { 4, 7, 2, 3, -1, 6 }, { 4, 7, 2, -1, 6, 3 }, { 4, 7, 2, -1, 3, 6 }, { 4, 7, -1, 6, 3, 2 },
                { 4, 7, -1, 6, 2, 3 }, { 4, 7, -1, 3, 6, 2 }, { 4, 7, -1, 3, 2, 6 }, { 4, 7, -1, 2, 6, 3 },
                { 4, 7, -1, 2, 3, 6 }, { 4, -1, 6, 3, 2, 7 }, { 4, -1, 6, 3, 7, 2 }, { 4, -1, 6, 2, 3, 7 },
                { 4, -1, 6, 2, 7, 3 }, { 4, -1, 6, 7, 3, 2 }, { 4, -1, 6, 7, 2, 3 }, { 4, -1, 3, 6, 2, 7 },
                { 4, -1, 3, 6, 7, 2 }, { 4, -1, 3, 2, 6, 7 }, { 4, -1, 3, 2, 7, 6 }, { 4, -1, 3, 7, 6, 2 },
                { 4, -1, 3, 7, 2, 6 }, { 4, -1, 2, 6, 3, 7 }, { 4, -1, 2, 6, 7, 3 }, { 4, -1, 2, 3, 6, 7 },
                { 4, -1, 2, 3, 7, 6 }, { 4, -1, 2, 7, 6, 3 }, { 4, -1, 2, 7, 3, 6 }, { 4, -1, 7, 6, 3, 2 },
                { 4, -1, 7, 6, 2, 3 }, { 4, -1, 7, 3, 6, 2 }, { 4, -1, 7, 3, 2, 6 }, { 4, -1, 7, 2, 6, 3 },
                { 4, -1, 7, 2, 3, 6 }, { -1, 6, 3, 2, 7, 4 }, { -1, 6, 3, 2, 4, 7 }, { -1, 6, 3, 7, 2, 4 },
                { -1, 6, 3, 7, 4, 2 }, { -1, 6, 3, 4, 2, 7 }, { -1, 6, 3, 4, 7, 2 }, { -1, 6, 2, 3, 7, 4 },
                { -1, 6, 2, 3, 4, 7 }, { -1, 6, 2, 7, 3, 4 }, { -1, 6, 2, 7, 4, 3 }, { -1, 6, 2, 4, 3, 7 },
                { -1, 6, 2, 4, 7, 3 }, { -1, 6, 7, 3, 2, 4 }, { -1, 6, 7, 3, 4, 2 }, { -1, 6, 7, 2, 3, 4 },
                { -1, 6, 7, 2, 4, 3 }, { -1, 6, 7, 4, 3, 2 }, { -1, 6, 7, 4, 2, 3 }, { -1, 6, 4, 3, 2, 7 },
                { -1, 6, 4, 3, 7, 2 }, { -1, 6, 4, 2, 3, 7 }, { -1, 6, 4, 2, 7, 3 }, { -1, 6, 4, 7, 3, 2 },
                { -1, 6, 4, 7, 2, 3 }, { -1, 3, 6, 2, 7, 4 }, { -1, 3, 6, 2, 4, 7 }, { -1, 3, 6, 7, 2, 4 },
                { -1, 3, 6, 7, 4, 2 }, { -1, 3, 6, 4, 2, 7 }, { -1, 3, 6, 4, 7, 2 }, { -1, 3, 2, 6, 7, 4 },
                { -1, 3, 2, 6, 4, 7 }, { -1, 3, 2, 7, 6, 4 }, { -1, 3, 2, 7, 4, 6 }, { -1, 3, 2, 4, 6, 7 },
                { -1, 3, 2, 4, 7, 6 }, { -1, 3, 7, 6, 2, 4 }, { -1, 3, 7, 6, 4, 2 }, { -1, 3, 7, 2, 6, 4 },
                { -1, 3, 7, 2, 4, 6 }, { -1, 3, 7, 4, 6, 2 }, { -1, 3, 7, 4, 2, 6 }, { -1, 3, 4, 6, 2, 7 },
                { -1, 3, 4, 6, 7, 2 }, { -1, 3, 4, 2, 6, 7 }, { -1, 3, 4, 2, 7, 6 }, { -1, 3, 4, 7, 6, 2 },
                { -1, 3, 4, 7, 2, 6 }, { -1, 2, 6, 3, 7, 4 }, { -1, 2, 6, 3, 4, 7 }, { -1, 2, 6, 7, 3, 4 },
                { -1, 2, 6, 7, 4, 3 }, { -1, 2, 6, 4, 3, 7 }, { -1, 2, 6, 4, 7, 3 }, { -1, 2, 3, 6, 7, 4 },
                { -1, 2, 3, 6, 4, 7 }, { -1, 2, 3, 7, 6, 4 }, { -1, 2, 3, 7, 4, 6 }, { -1, 2, 3, 4, 6, 7 },
                { -1, 2, 3, 4, 7, 6 }, { -1, 2, 7, 6, 3, 4 }, { -1, 2, 7, 6, 4, 3 }, { -1, 2, 7, 3, 6, 4 },
                { -1, 2, 7, 3, 4, 6 }, { -1, 2, 7, 4, 6, 3 }, { -1, 2, 7, 4, 3, 6 }, { -1, 2, 4, 6, 3, 7 },
                { -1, 2, 4, 6, 7, 3 }, { -1, 2, 4, 3, 6, 7 }, { -1, 2, 4, 3, 7, 6 }, { -1, 2, 4, 7, 6, 3 },
                { -1, 2, 4, 7, 3, 6 }, { -1, 7, 6, 3, 2, 4 }, { -1, 7, 6, 3, 4, 2 }, { -1, 7, 6, 2, 3, 4 },
                { -1, 7, 6, 2, 4, 3 }, { -1, 7, 6, 4, 3, 2 }, { -1, 7, 6, 4, 2, 3 }, { -1, 7, 3, 6, 2, 4 },
                { -1, 7, 3, 6, 4, 2 }, { -1, 7, 3, 2, 6, 4 }, { -1, 7, 3, 2, 4, 6 }, { -1, 7, 3, 4, 6, 2 },
                { -1, 7, 3, 4, 2, 6 }, { -1, 7, 2, 6, 3, 4 }, { -1, 7, 2, 6, 4, 3 }, { -1, 7, 2, 3, 6, 4 },
                { -1, 7, 2, 3, 4, 6 }, { -1, 7, 2, 4, 6, 3 }, { -1, 7, 2, 4, 3, 6 }, { -1, 7, 4, 6, 3, 2 },
                { -1, 7, 4, 6, 2, 3 }, { -1, 7, 4, 3, 6, 2 }, { -1, 7, 4, 3, 2, 6 }, { -1, 7, 4, 2, 6, 3 },
                { -1, 7, 4, 2, 3, 6 }, { -1, 4, 6, 3, 2, 7 }, { -1, 4, 6, 3, 7, 2 }, { -1, 4, 6, 2, 3, 7 },
                { -1, 4, 6, 2, 7, 3 }, { -1, 4, 6, 7, 3, 2 }, { -1, 4, 6, 7, 2, 3 }, { -1, 4, 3, 6, 2, 7 },
                { -1, 4, 3, 6, 7, 2 }, { -1, 4, 3, 2, 6, 7 }, { -1, 4, 3, 2, 7, 6 }, { -1, 4, 3, 7, 6, 2 },
                { -1, 4, 3, 7, 2, 6 }, { -1, 4, 2, 6, 3, 7 }, { -1, 4, 2, 6, 7, 3 }, { -1, 4, 2, 3, 6, 7 },
                { -1, 4, 2, 3, 7, 6 }, { -1, 4, 2, 7, 6, 3 }, { -1, 4, 2, 7, 3, 6 }, { -1, 4, 7, 6, 3, 2 },
                { -1, 4, 7, 6, 2, 3 }, { -1, 4, 7, 3, 6, 2 }, { -1, 4, 7, 3, 2, 6 }, { -1, 4, 7, 2, 6, 3 },
                { -1, 4, 7, 2, 3, 6 } };
        for (int i = 0; i < test4Result.length; i++) {
            for (int j = 0; j < test4Result[i].length; j++) {
                list4.add(test4Result[i][j]);
            }
            listOutput4.add(list4);
            list4 = new ArrayList<>();

        }
        assertEquals( App.permute(test4),(listOutput4));

    }
}