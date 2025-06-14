
import java.lang.reflect.Array;
import java.util.Vector;

public class Sorting {
    public int[] lista;

    public Sorting(int[] lista){
        this.lista = lista;
    }

    public int[] insertion_sort(){
        int[] lista_ordenada;
        lista_ordenada = this.lista.clone();

        for (int idx = 1; idx < lista_ordenada.length; idx++) {
            int temp = lista_ordenada[idx];
            int new_idx = idx - 1;

            while (new_idx >= 0 && lista_ordenada[new_idx] > temp) {
                lista_ordenada[new_idx + 1] = lista_ordenada[new_idx];
                new_idx--;
            }

            lista_ordenada[new_idx + 1] = temp;
        }

        return lista_ordenada;
    }

    public int[] bubble_sort() {
        int[] lista_ordenada;
        lista_ordenada = this.lista.clone();
        int tamanho = lista_ordenada.length - 1;

        for (int idx = 0; idx < lista_ordenada.length - 1; idx ++){
            for (int id = 0; id < tamanho; id++){
                if (lista_ordenada[id] > lista_ordenada[id+1]) {
                    int temp = lista_ordenada[id+1];
                    lista_ordenada[id+1] = lista_ordenada[id];
                    lista_ordenada[id] = temp;
                }
            }
            tamanho --;
        }
        return lista_ordenada;
    }

    public int[] quick_sort() {
        int[] copy = lista.clone();
        quick_sort_recursive(copy, 0, copy.length - 1);
        return copy;
    }

    private void quick_sort_recursive(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quick_sort_recursive(array, low, pi - 1);
            quick_sort_recursive(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high]; // último elemento como pivô
        int i = low;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
            }
        }

        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;

        return i;
    }

}
