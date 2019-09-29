class Solution:
    def findOcurrences(self, text: str, first: str, second: str) -> List[str]:
        res = []
        txtLst = text.split()
        print(txtLst)
        for i in range(0,len(txtLst)-1):
            if  txtLst[i] == first and txtLst[i+1] == second and i+2 < len(txtLst):
                res.append(txtLst[i+2])
        return res
