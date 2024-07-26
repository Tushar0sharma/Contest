```java


class Solution {
    public static long countSubarrays(int n, int[] arr) {
        // code here
        long ans=0;
        for(int i=0;i<n;i++){
            int min=27;
            int max=0;
            for(int j=i;j<Math.min(i+52,n);j++){
                min=Math.min(min,arr[j]);
                max=Math.max(max,arr[j]);
                if((min+max)%(j-i+1)==0) ans++;
            }
        }
        return ans;
    }
}
```
