import java.util.Random;

public class RandomArrayGenerator{
    public static int[] generateRandomArray(int min, int max){
        int[] array = new int[max - min + 1];
        for (int i = 0; i < array.length; i++){
            array[i] = min + i;
        }
        
        Random random = new Random();
        for (int i =array.length - 1; i > 0; i--){
            int j = random.nextInt(i+1);
            Swap.swap(array[i], array[j]);
        }

        return array;
    }
}