import java.util.ArrayList;
import java.util.List;

public class nQueen {
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

    static boolean validate(char[][] chessBoard,int row,int col){
        int dupRow=row;
        int dupCol=col;

        //diagonal check
        while (row>=0 && col>=0){
            if(chessBoard[row][col]=='Q') return false;
            row--;
            col--;
        }

        row=dupRow;
        col=dupCol;

        //left check
        while(col>=0){
            if(chessBoard[row][col]=='Q') return false;
            col--;
        }

        col=dupCol;

        //check diagonal downwards
        while(row< chessBoard.length && col>=0){
            if(chessBoard[row][col]=='Q') return false;
            row++;
            col--;
        }

        return true;
    }
    private static List<List<String>> solveNQueen(int n){
        char[][] chessBoard = new char[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                chessBoard[i][j]='.';
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
        List<List<String>> res = new ArrayList<>();
        dfs(0,chessBoard,res);
        return res;
    }
    private static void dfs(int col,char[][] chessBoard,List<List<String>> res){
        if(col==chessBoard.length){
            res.add(construct(chessBoard));
            return;
        }
        for(int row=0;row< chessBoard.length;row++){
            if(validate(chessBoard,row,col)){
                chessBoard[row][col]='Q';
                dfs(col+1,chessBoard,res);
                chessBoard[row][col]='.';
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
