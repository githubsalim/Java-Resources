import java.util.HashMap;
import java.util.Map;

public class MaxOccurredCity {

    public static void main(String[] args) {
        String cities = "'Delhi', 'Mumbai', 'Lucknow', 'Ahmadabad', 'Mumbai', 'Delhi', 'Mumbai', 'Goa', 'Mumbai'";

        // Remove extra quotes and split into an array
        String[] cityArray = cities.replace("'", "").split(", ");

        // Use a HashMap to count city occurrences
        Map<String, Integer> cityCounts = new HashMap<>();
        for (String city : cityArray) {
            cityCounts.put(city, cityCounts.getOrDefault(city, 0) + 1);
        }

        // Find the city with the maximum count
        String maxCity = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : cityCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCity = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Maximum occurred city is: " + maxCity);
        System.out.println("Actual Count: " + maxCount);
    }
}
