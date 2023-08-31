import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

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
}
