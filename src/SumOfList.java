import java.util.List;

/**
 * Created by sushantm on 3/11/17.
 */
public class SumOfList {

    public static int getSumOfList(List<Integer> input) {
        int sum = 0;
        for (Integer i : input)
            sum = sum + i;

        return sum;
    }
}
