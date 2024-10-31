class Solution {
    public int largestAltitude(int[] gain) {
        int ca=0, ma=0, i;
        for (i=0; i<gain.length; i++)
        {
            ca+=gain[i];
            if (ca>ma) ma=ca;
        }
        return ma;
    }
}

/**
n+1 points 
starts at 0 -> alt=0
gain[i]= gain of alt between i and i+1
return highest alt

0
g[i]  alt[i]
-5 => -5
1 => -4
5 => 1
0 => 1
-7 => -6 
=> h=max(alt)=1


0
-4 => -4
-3 => 1 = -3 - (-4) = g[i]-[g[i-1]]
ma=0
ca=0
read -5 => ca+=-5 => ca=-5 
if (ca>ma) ma=ca
read 1 => ca+=1 => ca=-4 
check ca>ma 

 */