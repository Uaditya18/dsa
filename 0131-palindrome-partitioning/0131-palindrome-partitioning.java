class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        findPartition(0,s,result,list);
        return result;
    }

    public void findPartition(int index, String s, List<List<String>> result, List<String> list){
        if(index==s.length()){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPallindrome(s,i,index)){
                list.add(s.substring(index,i+1));
                findPartition(i+1,s,result,list);
                list.remove(list.size()-1);
            }
        }
    }

    public boolean isPallindrome(String s, int i, int index){
        while(index<i){
            if(s.charAt(index)!=s.charAt(i)){
                return false;
            }
            index++;
            i--;
        }
        return true;
    }
}