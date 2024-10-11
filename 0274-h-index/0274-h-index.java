class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h_index = 0;
        int n = citations.length-1;
        for(int i=n;i>=0;i--){
            if((n-i)+1 > citations[i] ){
                break;
            }
            else{
                h_index++;
            }
        }
        return h_index;
    }
}