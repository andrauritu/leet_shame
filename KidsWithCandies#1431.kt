class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val maxCandies=candies.maxOrNull() ?: 0 //would be 5 in the ex
        val boolList = mutableListOf<Boolean>()
        for (i in 0..candies.size-1){
            if (candies[i]+extraCandies>=maxCandies){
                boolList.add(true)
            }   
            else boolList.add(false)
        }

        return boolList

    }
}




