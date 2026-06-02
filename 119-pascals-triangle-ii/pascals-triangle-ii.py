class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        # nCr where n = rowIndex
        # C(n,r) = C(n,r-1) * n-r/r
        row = []
        res = 1
        row.append(res)

        for r in range(1, rowIndex+1):
            res = res*(rowIndex-r+1)//r
            row.append(res)
        return row