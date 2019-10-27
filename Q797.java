class Solution:
    def depthsearch(self,graph, res, cur):
        # print(cur)
        if(cur[-1] == len(graph) - 1):
            res.append(cur.copy())
            return
        for i in graph[cur[-1]]:
            cur.append(i)
            self.depthsearch(graph,res,cur)
            cur.remove(i)
            
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        N = len(graph)
        res = []
        cur = [0]
        self.depthsearch(graph,res,cur)
        return res
    

        
