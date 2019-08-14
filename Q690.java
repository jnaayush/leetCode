/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Queue<Integer> idQ = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer,Employee> empMap = new HashMap<>();
        int totalImp=0;
        for(Employee emp: employees){
            empMap.put(emp.id,emp);
        }
        idQ.offer(id);
        while(idQ.peek() != null){
            int idC = idQ.poll();
            if(visited.contains(idC)){
                continue;
            }
            Employee e = empMap.get(idC);
            totalImp += e.importance;
            visited.add(idC);
            for(int subId : e.subordinates){
                idQ.offer(subId);
            }
        }
        return totalImp;
    }
}
