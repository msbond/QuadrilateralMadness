import java.util.List;
import java.util.Scanner;

public class QuadrilateralMadness {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        for (int k = 0; k < M; k++) {
            int N = scanner.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            //arr[] = {19 ,3 ,17 ,1 ,16 ,14 ,4 ,12 ,2 ,5 ,11};
            int r = 4;
            int n = arr.length;
            List result = combination.printCombination(arr, n, r);
            int denominator = result.size();
            int numerator = possibleQuadrilateral.getPossibleQuadrilateralNumber(result);
            int gcd = GcdOfTwoNumbers.getGcdOfTwoNumbers(numerator, denominator);
            System.out.print(numerator / gcd);
            System.out.print("/");
            System.out.print(denominator / gcd);
            System.out.println();
        }

    }
}
