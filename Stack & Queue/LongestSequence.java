import java.util.*;

class LongestSequence {
    static int longestConsecutive(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int max = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
