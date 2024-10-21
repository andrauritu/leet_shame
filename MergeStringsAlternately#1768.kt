class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()
        var i=0
        var j=0

        while (i<word1.length && j<word2.length)
        {
            result.append(word1[i])
            result.append(word2[j])
            i++;
            j++;
        }

            while (j<word2.length)
            {
                result.append(word2[j])
               j++

            }

            while (i<word1.length)
            {
                result.append(word1[i])
                i++
            }
    

    return result.toString()

    }
}