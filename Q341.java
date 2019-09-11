/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    List<Integer> res = new ArrayList<>();
    int index = 0;
    
    private void getRecInt(List<NestedInteger> nList){
        for(NestedInteger n : nList){
            if(n.isInteger()){
                res.add(n.getInteger());
            } else {
                getRecInt(n.getList());
            }
        }
        
    }
    
    public NestedIterator(List<NestedInteger> nestedList) {
        this.getRecInt(nestedList);
    }

    @Override
    public Integer next() {
        int i = res.get(index);
        index++;
        return i;
        
    }

    @Override
    public boolean hasNext() {
        return index < res.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
