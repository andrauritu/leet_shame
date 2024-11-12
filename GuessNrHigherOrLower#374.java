/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1; 
        int r=n;
        int m=l+(r-l)/2;
        if (guess(l)==0) return l;
        if (guess(r)==0) return r;
        if (guess(m)==0) return m;
        
        while (guess(m)!=0){
            m=l+(r-l)/2;
            if (guess(m)<0)
                r=m-1;
            else if (guess(m)>0)
                l=m+1;
            else return m;
        }
    return m;
}
}