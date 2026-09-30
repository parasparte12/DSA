class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> map =new HashMap<>();
        for(String famt : strs){
            char tanmay[]=famt.toCharArray();
            Arrays.sort(tanmay);
            String again =new String(tanmay);
            if(!map.containsKey(again)){
                map.put(again,new ArrayList<>());
            }
            map.get(again).add(famt);
        }
        return new ArrayList<>(map.values());
        
    }
}