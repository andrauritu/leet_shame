class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ncopy=n, i=0, cnt=0;
        if (flowerbed.length==1 && n==1){
            return flowerbed[0]==0;
        }
        for (i=0; i<flowerbed.length; i++){
            if (flowerbed[i]==1){
                ncopy=ncopy-Math.abs ((cnt-1)/2);
                cnt=0;
            }
            else{
                if (i==0 || i==(flowerbed.length-1))cnt++;
                cnt++;
            }
            }  
        ncopy=ncopy-Math.abs ((cnt-1)/2);

        return ncopy<=0;
        }
}
       
/**
i=1
fi=0
cnt=1
 */
        // while (i<n){
        //     while (flowerbed[i]==1) i++;
        //     while (flowerbed[i]==0){
        //         if (i==0 || i==n-1) cnt++;
        //         cnt++;
        //         i++;
        //         System.out.println("cnt when i is "+i+": "+cnt);

        //     }
        //     ncopy=ncopy-Math.abs ((cnt-1)/2);
        //     cnt=0;
        // }

/**
1 0 1 => 1 0 => 0 1
1 0 0 1 => 2 0 => 0 1
1 0 0 0 1 => 3*0 => 1*1
1 0 0 0 0 1 => 4 0 => 1 1
1 0 0 0 0 0 1 => 5 0 => 2 1
1 0 0 0 0 0 0 1 => 6 0 => 2 1
1 0 0 0 0 0 0 0 1 = 7 0 => 3 1
1 0 0 0 0 0 0 0 0 1 = 8 0 => 3 1
1 0 0 0 0 0 0 0 0 0 1 = 9 0 => 4 1
for 1, 2 => 0  = abs (i-1)/2
for 3, 4 => 1
for 5, 6 => 2
    7, 8 => 3
    9, 10 => 4

0 1 => 0
0 0 1 => 1
0 0 0 1 => 1
0 0 0 0 1 => 2

1 0 0 0 1 0 0
while (copyOfN>0){
if (f[i] != 0) i++
while (f[i]==0)
{
    if i==0 || i==n-1 => cnt++;
    cnt++
    i++
}
copyOfN=-abs(cnt-1)/2;
}




0 0 1 0 0 0 1 0 0 0 => if 
for p : flowerbed

 */