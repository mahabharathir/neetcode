class Solution {
    public boolean isValidSudoku(char[][] board) {
        //board.length == 9
        //board[i].length == 9
        //board[i][j] is a digit 1-9 or '.'.

        //Approach 1
        //Each row must contain the digits 1-9 without duplicates.
        //Each column must contain the digits 1-9 without duplicates.
        for(int i=0;i<9;i++){
            int[] rowSeen =new int[9];
            int[] colSeen =new int[9];
            for(int j=0;j<9;j++){
                char rowChar = board[i][j];
                char colChar = board[j][i];
                int rowValue = rowChar-'0';
                int colValue = colChar-'0';
                if(rowChar != '.' ){
                    if(rowSeen[rowValue-1]!=0){
                        return false;
                    }
                    rowSeen[rowValue-1]=1;
                }
                
                if(colChar!='.'){
                    if(colSeen[colValue-1]!=0){
                        return false;
                    }
                    colSeen[colValue-1]=1;
                }
            }
        }
        //Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                int[] boxSeen =new int[9];
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        char c = board[i+k][j+l];
                        if(c!='.'){
                            int index =c-'0';
                            if(boxSeen[index-1]!=0){
                                return false;
                            }
                            boxSeen[index-1]=1;
                        }
                    }
                }
            }
        }

        return true;
    }
}
