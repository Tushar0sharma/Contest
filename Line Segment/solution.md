```java
/*
    Time Complexity: O(n)
    Space Complexity: O(1)

    Where 'n' is the number of segments.
*/

public class Solution {
    public static int isPossible(int n, int k, int[] l, int[] r) {
        // Initialize two integer variables 'left' with '0', and 'right' with 'Integer.MAX_VALUE'.
        int left = 0, right = Integer.MAX_VALUE;

        // For 'i' in the range '0' to 'n - 1':
        for (int i = 0; i < n; i++) {
            // If 'l[i]' is less than or equal to 'k', and 'r[i]' is greater than or equal to 'k':
            if (l[i] <= k && r[i] >= k) {
                // Set 'left' equal to 'max(left, l[i])'.
                left = Math.max(left, l[i]);
                // Set 'right' equal to 'min(right, r[i])'.
                right = Math.min(right, r[i]);
            }
        }

        // If 'left' is equal to 'right', then return '1'.
        if (left == right) {
            return 1;
        }

        // Return '0'.
        return 0;
    }
}
```
