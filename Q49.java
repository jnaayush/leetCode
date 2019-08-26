class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapStr = new HashMap<>();
        for(String s : strs){
            char []arr = s.toCharArray(); 
            Arrays.sort(arr);
            String sortedS = new String(arr);
            if(!mapStr.containsKey(sortedS)){
                List<String> temp = new ArrayList<>();
                temp.add(s);
                mapStr.put(sortedS,new ArrayList<String>(temp));
            } else {
                List<String> temp = mapStr.get(sortedS);
                temp.add(s);
                mapStr.put(sortedS,temp);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> los : mapStr.values()){
            res.add(los);
        }
        return res;
        
    }
}

// class Solution{
// 	public int getID(String s){
//         int[] counter   =   new int[26];
//         for(char ch : s.toCharArray()){
//             counter[ch - 'a']++;
//         }
        
//         return Arrays.hashCode(counter);    //use the counter array's hash code as this anagram's ID
//     }
    
//     //solution takes 18ms
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> groups   =   new ArrayList<>();
//         Map<Integer, List<String>> anagramMap   =   new HashMap<>();
        
//         for(String word : strs){
//             int id   =   getID(word);   //unique for each anagram
//             List<String> group  =   anagramMap.get(id);
            
//             if(null == group){
//                 group  =   new ArrayList();
//                 anagramMap.put(id, group);
           
//             }
            
//             group.add(word);
//         }
        
//         groups.addAll(anagramMap.values());
        
//         return groups;
//     }
// }
