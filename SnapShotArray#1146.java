class SnapshotArray {
    private ArrayList<Integer>[] currentArray;
    private ArrayList<Integer> setVal;
    private int snap_id=0;

    public SnapshotArray(int length) {
        currentArray=new ArrayList[length];
        snap_id=0;
        setVal = new ArrayList<>(); 
         for (int i = 0; i < length; i++) {
            currentArray[i] = new ArrayList<>();  
            setVal.add(0);  
        }
    }
    
    public void set(int index, int val) {
        setVal.set(index,val);
    }
    
     public int snap() {
        for (int i = 0; i < setVal.size(); i++) {
            currentArray[i].add(setVal.get(i)); 
        }
        snap_id++;
        return snap_id - 1;  
    }

    
    public int get(int index, int snap_id) {
        if (snap_id >= currentArray[index].size()) {
            return currentArray[index].get(currentArray[index].size() - 1);  
        }
        return currentArray[index].get(snap_id);  
    }
}

/**
    currArr: ArrayList<Integer> setVal = new Arraylist<>();
            [0] [1]
            set (0,15) snap snap get set(0, 4) set (0,37) snap get (0,0) snap get(0,3)
            set (0, 15)
            setVal.set(0, 15) => setval = {15}

            snap=> snap_id=0
            for (el in setVal){
                cA[setVal.indexOf(el)].add(el);
            }
            => cA[0] = {15}
            RETURN 0
            snap_id++ => snap_id=1 

            snap => snap_id=1
            for (el in setVal){
                cA[setVal.indexOf(el)].add(el);
            }
            => cA[0] = {15, 15}
            snap => id =1 RETURN 1
            id ++ => id=2 

            get (0, 1) => 15

            set (0,4) => setVal.set(0,4) => setVal={4}

            set (0, 37) => setVal.set(0,37) => setVal={37}

            snap => snap_id=2 
            for (el in setVal){
                cA[setVal.indexOf(el)].add(el);
            }
            => cA[0] = {15, 15, 37}
            

 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */