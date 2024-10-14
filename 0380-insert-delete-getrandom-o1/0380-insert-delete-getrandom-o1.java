class RandomizedSet {

    private ArrayList<Integer> list;
    private HashMap<Integer,Integer> hash;
    Random rand ;


    public boolean search(int val){
        return hash.containsKey(val);
    }

    public RandomizedSet() {
        list = new ArrayList<>();
        hash = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(search(val)){
            return false;
        }
        list.add(val);
        hash.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!search(val)) return false;

        int index = hash.get(val);
        list.set(index, list.get(list.size()-1));
        hash.put(list.get(index),index);
        list.remove(list.size()-1);
        hash.remove(val);
        return true;
    }
    
    public int getRandom() {
        
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */