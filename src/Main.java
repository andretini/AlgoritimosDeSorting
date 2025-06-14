public class Main {
    public static void main(String[] args) {

        //int[] array = {7, 2, 12, 8, 3};
        String path = "./src/data/decrescente_10000.csv";
        int[] array = CsvUtils.readCSVToIntArray(path);

        Sorting sorting = new Sorting(array);

        long insertionStartTime = System.nanoTime();
        int[] insertionSort = sorting.insertion_sort();
        long insertionEndTime = System.nanoTime() - insertionStartTime;

        long bubbleStartTime = System.nanoTime();
        int[] bubble = sorting.bubble_sort();
        long bubbleEndTime = System.nanoTime() - bubbleStartTime;

        long quickstartTime = System.nanoTime();
        int[] quick = sorting.quick_sort();
        long quickEndTime = System.nanoTime() - quickstartTime;

        System.out.println(insertionEndTime);
        System.out.println(bubbleEndTime);
        System.out.println(quickEndTime);
    }
}
