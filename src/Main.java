public class Main {
    public static void main(String[] args) {
        int[] array = {7, 2, 12, 8, 3};

        Sorting sorting = new Sorting(array);

        for (int x : sorting.quick_sort()){
            System.out.println(x);
        }
    }
}