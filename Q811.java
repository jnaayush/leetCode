class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> countMap = new HashMap<>();
        for(String cpd : cpdomains){
            String[] numText = cpd.split(" ");
            String s = numText[1];
            do{
                if(countMap.containsKey(s)){
                    countMap.put(s,countMap.get(s)+Integer.parseInt(numText[0]));
                } else {
                    countMap.put(s,Integer.parseInt(numText[0]));
                }
                if(s.indexOf(".") != -1){
                    s = s.substring(s.indexOf(".")+1);    
                }  else {
                    s = null;
                }
            }while(s!=null);
        }
        List<String> result = new ArrayList<>();
        for(String t : countMap.keySet()){
            result.add(countMap.get(t).toString()+" "+t);
        }
        return result;
    }
}
