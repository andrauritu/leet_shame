class Solution {
    public int maxProfit(int[] prices) {
        int minIdx=0;
        int maxIdx=0;
        int minp=prices[0];
        int maxp=prices[0];
        int maxprofit=0;
        int i=0;
        for (i=0; i<prices.length; i++)
        {
            if(prices[i]<minp){
                if (maxp-minp>maxprofit){
                    maxprofit=maxp-minp;}
                minp=prices[i];
                minIdx=i;
                maxIdx=i;
                maxp=minp;
            }
            if (prices[i]>maxp && i>minIdx){
                maxp=prices[i];
                maxIdx=i;
            }
        }
        if (maxp-minp>maxprofit) maxprofit=maxp-minp;
        return maxprofit;
    }

  
}

/*
    minIdx=2;
    maxIdx=5;
    minp=1
    maxp=6
    maxprofit=0
    i=6
    2  7  1  5  3  6  4
    if p[i]<minp => {
        if (maxp-minp>maxprofit) maxprofit=maxp-minp
        minp=p[i]
        minIdx=i
        maxIdx=i
        maxp=minp
        }
    if (p[i]>maxp && i> minIdx) => maxp=p[i] and maxIdx=i

    if (maxp-minp>maxprofit) maxprofit =...

    return maxproit


 */