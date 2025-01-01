import java.util.HashMap;
import java.util.Map;

// Throwing a hashmap at it
/*
* A hashmap stores key value pairs (K -> V): We store values in a map and a key that matches it to retrieve it.
* Give the map some certain key, and it will retrieve the value that it has stored fer that key.
* The hashmap does this look up for you, it's super-fast. It's called constant time.
* We are looping through the array one time. Each time we are looping we are storing an item in the map, for each iteration.
* For each number that we are iterating, what we are actually storing is the number that we would need to add to that number to achieve the target.

* Hashmap
  K -> V
  {5, 2, 4}
  6

  * Start looping over the array, for the first no. (5), store the number that needs to be added to it, to get the target(6). The number to be added on the map is 1 (i.e: 5+1 = 6);
  * The key is index to that number we are currently on, through that iteration. These Keys we can call them complements.

  K -> V
  1 -> 0;

  * Go to the next no. (Which is 2). The value to store now is (4) - The number that needs to be added to (2) to get (6). The key is (1) - The current index. (Before storing check if the no./value is currently on the map).
   K -> V
   1 -> 0;
   4 -> 1;

   * The next number is 4, which is already on the map. So we terminate and return the indices of the two numbers. We start with the number in the next iteration, and the key to the value that matched. So the indices that match the target in this case is:
   {2, 1}
* */

/*
* Time on leetcode: 3ms.
* Time complexity of:  O(n) - Big O(n);
* Called Linear time complexity.
* Was faster since we only have one iteration.
* However, it may take up a bit more memory, since it has to manage the hashmap. (Memory is 44.56mb)
* */
public class Two_sum_solution_optimized {
    public int[] twoSum(int[] nums, int target ) {
        // Create a hashmap that will store the values and keys.

        // Map has the two types of data, you want to store. In this case, both the  Keys and values are integers. Then initialize them as a hashmap <>

        Map<Integer, Integer> complements = new HashMap<>();

        // Looping through the whole array. (At this point we already know the value of the current index, so within the loop we have to get the complement number stored to achieve the target.)
        for(int i = 0; i < nums.length; i++) {
            // For every number that we are looping over, we want to first see if it exists on that map or not (.get() method). We then pass the number of that current index we are looking at (nums[i]).
            // If the number exists as a key in that map, the method below, will retrieve it for us. Otherwise, it will just return null.
            // Then store result of the call in a variable. Because when we get the value, that is stored at that key in the array, the actual result that is giving us, is the index of the number that has that complement, and not the complement itself.
            Integer complementIndex = complements.get(nums[i]);

            if (complementIndex != null) {
                return new int[] {i, complementIndex};
            }

            // calculate the complement, and add it to the map(key, value).
            complements.put(target - nums[i], i);
        }

        return nums;
    };
}
