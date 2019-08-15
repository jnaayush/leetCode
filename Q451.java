class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        
        PriorityQueue<Character> pq = new PriorityQueue(new Comparator<Character>(){
            @Override
            public int compare(Character c1, Character c2){
                return freq.get(c2)-freq.get(c1);
            }
        });
        
        for(char c: s.toCharArray()){
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            } else {
                freq.put(c,1);
            }
        }
        for(char c: freq.keySet()){
            pq.add(c);
        }
        StringBuilder str = new StringBuilder(); 
		while(pq.peek()!=null){
            char o = pq.poll();
            int f = freq.get(o);
            System.out.println("char: " + o + "freq: "+f);
            for(int i = 0; i < f;i++){
                str.append(o);
            }
		}
        return str.toString();
    }
}
