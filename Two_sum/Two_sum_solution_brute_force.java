package Two_sum;// Brute Force approach

/*
 * Time on leetcode: 46ms.
 * Time complexity of:  O(n^2) - Big O(n^2);
 * */
public class Two_sum_solution_brute_force {
    public int[] twoSum(int[] nums, int target) {
        // iterating through the whole array (loop through each element in the nums array.)
        for(int i = 0; i < nums.length; i++) {
            // for each item in the array, check for satisfaction of the condition (that is: we now loop after every number after the first no.)
            for(int j = i + 1; j < nums.length; j++ ) {
                // we can't add a number to itself so we start from the next number after the first number on the outer loop
                int sum = nums[i] + nums[j];

                if(sum == target) {
                    return new int [] {i, j};
                }
            }
        }

        // since we can only have one solution, we will just return the list of the passed array
        return nums;
    }
}
