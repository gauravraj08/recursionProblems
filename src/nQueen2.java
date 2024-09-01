import java.util.ArrayList;
import java.util.List;

public class nQueen2 {
    private static List<String> construct(char[][] chessBoard){
        List<String> res=new ArrayList<>();
        System.out.println("construction");
        for (int i=0;i< chessBoard.length;i++){
            String s=new String(chessBoard[i]);
            System.out.println(s+" ");
            res.add(s);
        }
        System.out.println();
        return res;
    }

//    static boolean validate(char[][] chessBoard,int row,int col){
//        int dupRow=row;
//        int dupCol=col;
//
//        //diagonal check
//        while (row>=0 && col>=0){
//            if(chessBoard[row][col]=='Q') return false;
//            row--;
//            col--;
//        }
//
//        row=dupRow;
//        col=dupCol;
//
//        //left check
//        while(col>=0){
//            if(chessBoard[row][col]=='Q') return false;
//            col--;
//        }
//
//        col=dupCol;
//
//        //check diagonal downwards
//        while(row< chessBoard.length && col>=0){
//            if(chessBoard[row][col]=='Q') return false;
//            row++;
//            col--;
//        }
//
//        return true;
//    }
    private static List<List<String>> solveNQueen(int n){
        char[][] chessBoard = new char[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                chessBoard[i][j]='.';
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];
        List<List<String>> res = new ArrayList<>();
        dfs(0, chessBoard, res, leftRow, lowerDiagonal, upperDiagonal);
        return res;
    }
    private static void dfs(int col, char[][] board, List < List < String >> res, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        for(int row=0;row< board.length;row++){
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                dfs(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int n=4;
        List<List<String>> queen = solveNQueen(n);
        int i=1;
        for(List<String> it:queen){
            System.out.println("Arrangement "+i);
            for(String s:it){
                System.out.println(s);
            }
            System.out.println();
            i+=1;
        }
    }
}
