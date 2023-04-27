import java.util.Arrays;
import java.util.logging.*;

public class task_1 {
    
    private static final Logger = Logger.getLogger(task_1.class.getName());

    public static void main(String[] args) throws Exception {
        // Создаем файловый обработчик
        FileHandler fileHandler = new FileHandler("task01Log.txt");
        // Добавляем обработчик к логгеру
        LOGGER.addHandler(fileHandler);
        int[] arr = { 5, 3, 8, 6, 7, 2, 1, 0, 0, 9, 15 };
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        LOGGER.info("Исходный массив: " + Arrays.toString(arr));
        bubbleSort(arr);
        LOGGER.info("Отсортированный массив: " + Arrays.toString(arr));
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                    swapped = true;
                }
            }
            LOGGER.info("After iteration " + (i + 1) + ": " + Arrays.toString(arr));
            if (!swapped) {
                break;
            }
        }
    }
}