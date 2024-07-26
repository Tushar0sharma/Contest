```
  public class Solution {
    public static int zamnTriplets(int n, int[] a) {
        // Write your code here
        int ans=0;
        for(int i=1;i<n-1;i++){
            if(a[i]%2==0){
                int oddbefore=0;
                int oddafter=0;
                for(int j=i-1;j>=0;j--){
                    if(a[j]%2!=0) oddbefore++;
                }
                for(int j=i+1;j<n;j++){
                    if(a[j]%2!=0) oddafter++;
                }
                ans+=oddafter*oddbefore;
            }
            else{
                int evenbefore=0;
                int evenafter=0;
                for(int j=i-1;j>=0;j--){
                    if(a[j]%2==0) evenbefore++;
                }
                for(int j=i+1;j<n;j++){
                    if(a[j]%2==0) evenafter++;
                }
                ans+=evenafter*evenbefore;
            }
        }
        return ans;
    }
}
```
