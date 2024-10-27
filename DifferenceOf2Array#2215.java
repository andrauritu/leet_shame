class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> hs1=new HashSet<>();
        Set<Integer> hs2=new HashSet<>();
        for (int nr : nums1){
            hs1.add(nr);
        }
        for (int nr : nums2){
            hs2.add(nr);
        }
        Set<Integer> uniq1 = new HashSet<>(hs1);
        Set<Integer> uniq2= new HashSet<>(hs2);

        uniq1.removeAll(hs2); 
        uniq2.removeAll(hs1);
        
        List<List<Integer>> answer = Arrays.asList(new ArrayList<>(uniq1), new ArrayList<>(uniq2));
        return answer;
    }
}