package Two_sum;

import java.util.HashMap;
import java.util.Arrays;

public class Two_sum_own_solution {
    public static void main(String[] args) {
        // Call the method from main
        int[] result = mainMethod();
        System.out.println("Final result: " + Arrays.toString(result));
    }

    public static int[] mainMethod() {
        HashMap<Integer, Integer> capitalCities = new HashMap<>();
        int[] capitalCityValues = new int[] {50, 60, 80, 45};
        int target = 140;

        for (int i = 0; i < capitalCityValues.length; i++) {
            capitalCities.put(capitalCityValues[i], i);
            System.out.println(capitalCities);

            int diffBtnTargetNValue = target - capitalCityValues[i];
            System.out.println("Difference Between target and key-value: " + diffBtnTargetNValue);

            // Check if the hashmap contains the needed value
            if (capitalCities.containsKey(diffBtnTargetNValue)) {
                int[] result = new int[] {i, capitalCities.get(diffBtnTargetNValue)};
                System.out.println("Resulting index array: " + Arrays.toString(result));
                return result;  // Return the result immediately when found
            }
            
        }

        // Return empty array if no solution found
        return new int[]{};
    }
}