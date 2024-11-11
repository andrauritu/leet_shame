class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for (int i=0; i<arr.length; i++){
            if (map.containsKey(arr[i])){
                count=map.get(arr[i]);
                count++;
                map.put(arr[i], count);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        HashSet<Integer> set =new HashSet<>(map.values());
       
        if (set.size()==map.size()) return true;
        return false;
    }
}