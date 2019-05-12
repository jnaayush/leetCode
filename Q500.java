class Solution {
    public String[] findWords(String[] words) {
        
        Set<Character> row1 = new HashSet<>();
        row1.add('q');
        row1.add('w');
        row1.add('e');
        row1.add('r');
        row1.add('t');
        row1.add('y');
        row1.add('u');
        row1.add('i');
        row1.add('o');
        row1.add('p');
        
        Set<Character> row2 = new HashSet<>();
        row2.add('a');
        row2.add('s');
        row2.add('d');
        row2.add('f');
        row2.add('g');
        row2.add('h');
        row2.add('j');
        row2.add('k');
        row2.add('l');
        
        Set<Character> row3 = new HashSet<>();
        row3.add('z');
        row3.add('x');
        row3.add('c');
        row3.add('v');
        row3.add('b');
        row3.add('n');
        row3.add('m');
        
        Set<Character> row = null;
        List<String> result = new ArrayList<>();
        int index = 0;
        
        for(String s : words){
            
            if(row1.contains(s.toLowerCase().charAt(0))){
                row = row1;
            } else if (row2.contains(s.toLowerCase().charAt(0))){
                row = row2;
            } else if (row3.contains(s.toLowerCase().charAt(0))){
                row = row3;
            }
            boolean isSame = true;
            for(int i = 1; i < s.length(); i++){
                if(!row.contains(s.toLowerCase().charAt(i))){
                    isSame = false;
                    break;
                }
            }
            if(!isSame){
                continue;
            } else{
                result.add(s);
            }
        }
        String[] resultS = new String[result.size()];
        for(int i = 0; i < resultS.length; i++){
            resultS[i] = result.get(i);
        }
        return resultS;
    }
}
