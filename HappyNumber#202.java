class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen_elems = new HashSet<>();
        while (n!=1 && !seen_elems.contains(n)){
           seen_elems.add(n);
           n=sum_square_digits(n);
        }
        if (n==1) return true;
        else return false;
    }
    

    public int sum_square_digits(int n){
        int s=0;
        int cpy=n;
        int digit;
        while (n>0){
            digit=n%10;
            s+=digit*digit;
            n=n/10;
        }
        return s;
    }
}

/*
n=23
=> 4+9 = 13
=> 1 + 9 = 10
=> 1 + 0 => 1 => HAPPY

n=22
=> 4+4=8
=> 64
=> 36 + 16 = 52
=> 25+4 => 29
=> 4+81 => 85
=> 64 + 25 =>79 => 49+81 = 130 => 1+9 = 10 => 1 HAPPY

n=21 => 4 => 16 => 37 => 58 => 89 => 64+81= 145 => 1+16+25 =42 => 20 => 4 => ...




 */