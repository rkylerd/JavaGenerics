public class Maximizer <T extends Comparable<? super T>> {

    private T MAX;

    Maximizer() { }

    public void updateValue(T value) {

        if (MAX == null) {
            MAX = value;
            return;
        }

        int comp = value.compareTo(MAX);

        if (comp > 0) {
            MAX = value;
        }
    }

    public T getValue() {
        return MAX;
    }
}
