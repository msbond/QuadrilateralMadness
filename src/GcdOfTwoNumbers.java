/**
 * Created by sushantm on 3/11/17.
 */
public class GcdOfTwoNumbers {

    public static int getGcdOfTwoNumbers(int num1,int num2){
        int r;
        while(num2 != 0)
        {
            r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
    }
}
