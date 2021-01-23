public class Algorithms {
    public static <T extends Comparable<? super T>> Stats calcStats(T[] array) {
        Stats<T> newStats = new Stats<>(array);
        return newStats;
    }
}
