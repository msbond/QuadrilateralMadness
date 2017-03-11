import java.util.Collections;
import java.util.List;


public class possibleQuadrilateral {
    public static int getPossibleQuadrilateralNumber(List<List> input) {
        int noOfQuadrilateralNumber = 0;
        for (List<Integer> element : input) {
            //Sort the list
            Collections.sort(element);
            int maximumLength = element.get(element.size() - 1);

            int sumOfElementsExceptLast = SumOfList.getSumOfList(element) - maximumLength;

            if (sumOfElementsExceptLast > maximumLength)
                noOfQuadrilateralNumber++;
        }

        return noOfQuadrilateralNumber;
    }
}
