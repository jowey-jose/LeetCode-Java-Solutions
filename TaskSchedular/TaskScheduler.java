package TaskSchedular;

import java.util.Arrays;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        // Count frequency of each task
        int[] frequencies = new int[26];
        for (char task : tasks) {
            frequencies[task - 'A']++;

            System.out.println("frequencies"+ Arrays.toString(tasks));
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int freq : frequencies) {
            maxFrequency = Math.max(maxFrequency, freq);
        }

        // Count how many tasks have the max frequency
        int numMaxTasks = 0;
        for (int freq : frequencies) {
            if (freq == maxFrequency) {
                numMaxTasks++;
            }
        }

        // Calculate minimum time required
        int minTime = (maxFrequency - 1) * (n + 1) + numMaxTasks;

        // The answer is the maximum between the calculated minTime and total tasks
        return Math.max(minTime, tasks.length);
    }

    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','C','D'};
        int n = 3;
        System.out.println(leastInterval(tasks, n)); // Output: 7
    }
}