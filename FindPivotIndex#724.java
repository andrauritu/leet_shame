class Solution {
    public int pivotIndex(int[] nums) {
        int total=0, ls=0, rs=0;
        for (int i=0; i<nums.length; i++){
            total+=nums[i];
        }
        for (int i=0; i<nums.length; i++){
            if (i>0) ls+=nums[i-1];
            rs=total-ls-nums[i];
            if (ls==rs) return i;
            rs=0;
        }
        return -1;
    }
}

/**
1 2 4 3 
t=10
ls=0, rs=0
i=0 => ls=0, rs=t-nums[i]= 9
if ls=rs great
else ls=rs=0
i=1 => if (i>0) ls+=nums[i-1]
    rs=t-ls-nums[i]
    if ls=rs great
    else rs=ls=0

 */