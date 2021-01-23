public class Stats <T extends Comparable<? super T>> {

    public T max;
    public T min;

    Stats(T[] array) {
        calcStats(array);
    }

    public void calcStats(T[] array) {

            max = array[0];
            min = array[0];

        for (int i = 0; i < array.length; i++) {

            int minCompare = array[i].compareTo(min);
            int maxCompare = array[i].compareTo(max);

            if (maxCompare > 0) {
                max = array[i];
            }

            if (minCompare < 0) {
                min = array[i];
            }
        }
    }

}
