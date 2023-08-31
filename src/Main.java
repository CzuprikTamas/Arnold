import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {23,5,4,56,567,8,3};
        System.out.println(minimum(array1));

        int[] array = new int[20];
        System.out.println(Arrays.toString(method(array)));
    }

    public static int[] method(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int rndNum = random.nextInt(100) + 1;
            array[i] = rndNum;
        }
        return array;
    }

    public static int minimum(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
       return minNum;
    }
}
