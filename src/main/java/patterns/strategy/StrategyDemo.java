package strategy;

import java.util.Arrays;

public class StrategyDemo {
    public void run() {
        Sorter sorter = new Sorter();

        sorter.setStrategy(new BubbleSort());
        int[] array1 = {5, 3, 8, 1, 2};
        sorter.sort(array1);
        System.out.println("Bubble: " + Arrays.toString(array1));

        sorter.setStrategy(new SelectionSort());
        int[] array2 = {5, 3, 8, 1, 2};
        sorter.sort(array2);
        System.out.println("Selection: " + Arrays.toString(array2));
    }
}
