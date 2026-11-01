class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        n,m = len(board) , len(board[0])
        
        def validate(i,j) -> bool:
            '''
            so here what i paln to v alidate is use a row set (size 9 ) , colm set (size 9) and box set (size 9) for each cell ans check  no duplicate in each set here 
            so if that is true then we are good to say valid 
            if not we say it is in valid


            for box set 
             we need startx , starty , endx ,endy , size =  3
            1,2
             4,3
             6,6
             1,7

             startx =  >
                    1/3 = 0 , 2/3 =0
                    4/3 =1 , start y = 3/3 =1

                    6/3 = 2 , 6/3 =2

                    0,0 .. 0,1 .. 0,2
                    1,0 .. 1,1 .. 1,2
                    2,0 .. 2,1 .. 2,2


                    

             


            '''




            rowMap = set()
            colMap =set()
            boxMap =set()
            size = 3
            diff =3
            for k in range(0,n):
                if   board[k][j] == ".":
                    continue
                if board[k][j] in colMap:
                    return False
                
                colMap.add(board[k][j])
            
            for k in range(0,m):
                if   board[i][k] == ".":
                    continue
                if board[i][k] in rowMap:
                    return False

                rowMap.add(board[i][k])
            
            startx = int(i/size)*size
            starty = int(j/size)*size

            endx = startx+diff
            endy = starty+diff

            for a in range(startx,endx):
                for b in range(starty,endy):
                    if board[a][b] == ".":
                        continue
                        
                    if board[a][b] in boxMap:
                        return False
                    boxMap.add(board[a][b])









            return True

        
        

        for i in range(0,n):
            for j in range(0,m):
                if board[i][j]!="." and validate(i,j) == False :
                    return False
        
        return True


