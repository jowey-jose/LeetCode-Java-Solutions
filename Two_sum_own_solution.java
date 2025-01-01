import java.util.Arrays;

public class Two_sum_own_solution {
//    Array of integers. E.g: int[] nums;
//    Integer target. E.g: int target;

    public static void main(String[] args) {
//        Array of Integers
        int[] numbers; // Declare the array
        numbers = new int[]{3,4,5,6}; // Initialize the array

//        Integer target
        int target;
        target = 9;

        System.out.println("Target: " + 9);

//        Print the elements of the array
        for (int number: numbers) {
            System.out.println("Array Values: " + number);
        }

//        Question: Return indices of the two numbers, such that they add up to target.

//        My Attempt: -> Brute Force
        /*
         * Step 1: Add the first number in the array to the 2nd number in the array and check if the sum is equal to the target
         * - Keep looping till all numbers are added to each other from left to right.
         * Step 2: Print the indices of the two numbers in the array that add up to the target.
         * */

//      Step 1: return the first element in the array, and the second number following it and their sum.
        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Elements in the Array(index): " + i);

            for (int j = i+1; j < numbers.length; j++) {
//                System.out.println("Elements following the First Number Selected(index): " + j);


                int sum = numbers[i] + numbers[j];

//                System.out.println("Sum of the values: " + sum);

                if (sum == target) {
                    System.out.println("Sum Details: " + "index: " +  i + " , " + " index: " + j + " total number value = " + sum);
                    
                   int[] indices = new int[]{i,j};

                   System.out.println("Indices of the numbers that add up to target: "  + Arrays.toString(indices));
                }

            }
        }


    }

}
