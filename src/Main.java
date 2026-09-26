import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача № 1
        int[] inputArray1 = new int[5];
        double[] outputArray1 = new double[4];
        inputArray1[0] = 35_444;
        inputArray1[1] = 22_443;
        inputArray1[2] = 443_333;
        inputArray1[3] = 2_202;
        inputArray1[4] = 66_356;
        int minSum = inputArray1[0];

        for (int element : inputArray1) {
            //Сумма
            outputArray1[0] += element;

            //Максимум
            if (element > outputArray1[1]) {
                outputArray1[1] = element;
            }

            //Минимум
            if (element < minSum) {
                outputArray1[2] = element;
            }
        }

        // Среднее значение
        outputArray1[3] = outputArray1[0] / inputArray1.length;

        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        // Задача № 2
        int[] inputArray2 = {82_333, 66_234, 234_888, 33_200, 40_800};
        double[] outputArray2 = new double[5];
        float taxValue = 0.13f;
        int next_value = 0;

        for (int element : inputArray2) {
            outputArray2[next_value] = element * taxValue;
            next_value++;
        }

        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        // Задача № 3
        int[] inputArray3 = {1_500, 20_200, 15_500, 2_300, 800};
        boolean[] outputArray3 = new boolean[5];
        next_value = 0;

        for (int element : inputArray3) {
            if (element > 5000) {
                outputArray3[next_value] = true;
            } else {
                outputArray3[next_value] = false;
            }
            next_value++;
        }

        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        // Задача № 4
        int[] inputArray4 = {30_125, 12_800, 60_155, -448, 43_897};
        boolean[] outputArray4 = {true};

        for (int element : inputArray4) {
            if (element < 0) {
                outputArray4[0] = false;
            }
        }

        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        // Задача № 5
        int[] inputArray5 = {1_500, -300, 2_300, 0, 1_800};
        int[] outputArray5 = {0};

        for (int element : inputArray5) {
            if (element > 0) {
                outputArray5[0]++;
            }
        }

        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}