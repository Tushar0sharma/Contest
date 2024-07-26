```java
import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static int canYouReduce(int n, int x, int[] a) {
        // Write your code here
        int sum=0;
        for(int i:a) sum+=i;
        int k=0;
        for(int i:a){
            k+=i;
            if(k<x && sum-k<x) return 1;
        }
        return 0;
    }
}

```
