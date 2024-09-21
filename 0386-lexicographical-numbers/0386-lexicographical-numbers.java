class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>(); // result to return 
       for(int i =1;i<=9;i++){
        dfsForResult(i,n,result);
       }
       return result;
    }

    void dfsForResult(int curr,int n,List<Integer> result){
        if(curr>n)
            return;
        
        result.add(curr);

        for(int i =0;i<=9;i++){
            dfsForResult(curr*10+i,n,result);
        }
    }
}