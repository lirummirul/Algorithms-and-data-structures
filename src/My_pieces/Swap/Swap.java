package My_pieces.Swap;

import java.util.ArrayList;

public class Swap<T> {
    public void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}