package strategy;

public class Sorter {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        if (strategy == null) {
            throw new IllegalStateException("Стратегия сортировки не установлена!");
        }
        strategy.sort(array);
    }
}
