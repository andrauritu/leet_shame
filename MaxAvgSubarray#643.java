class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0, f=k-1;
        double cs=0;
        for (int i=s; i<=f; i++){
                cs+=nums[i];
            }
        double maxavg=cs/k;
        while (f<nums.length-1){
            cs=cs-nums[s]+nums[f+1];
            s++;
            f++;
            if (maxavg<(cs/k)) maxavg=cs/k;
        }
        return maxavg;
}
}