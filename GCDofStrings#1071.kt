class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
    var i=0
    val result =StringBuilder()
    var finalRes : String =""

    while (i<str1.length && i<str2.length && str1[i]==str2[i]){
        result.append(str1[i++])
    if (str1.length % result.toString().length ==0 && str2.length % result.toString().length ==0) 
        finalRes=result.toString()
    }
    //result= ABC
    
    if (finalRes.isEmpty()) return ""
    var nrRep1 = str1.length / finalRes.length 
    var nrRep2 = str2.length / finalRes.length 

    val repeatedRes1=finalRes.repeat(nrRep1)
    val repeatedRes2=finalRes.repeat(nrRep2)

    if (repeatedRes1!=str1 || repeatedRes2!=str2) return ""
    else return finalRes


}
}
/*
    ABCABCD  ABC =>ABC

    A  = A  => A
    AB  = AB  => AB
    ABC = ABC  => ABC
    ABCA !=  ABC_ => ABC done

    check count of result in str that has not ended
    => if count*result.length < str.length => BAD
    else ok





    



 */