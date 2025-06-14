import java.io.*;
import java.util.*;

public class CsvUtils {
    // Function to read a CSV file and return int[] values (skipping header)
    public static int[] readCSVToIntArray(String filePath) {
        List<Integer> values = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip header
            br.readLine();

            // Read and parse the remaining lines
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    values.add(Integer.parseInt(line.trim()));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convert List<Integer> to int[]
        return values.stream().mapToInt(i -> i).toArray();
    }
}
