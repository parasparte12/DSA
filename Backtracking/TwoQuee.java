
public class TwoQuee{


public static void nQuees(char board[][],int row){

    // base case

if(row==board.length){
printBoard(board);
return;  
}
for(int j=0;j<board.length;j++){
board[row][j]='Q';
nQuees(board,row+1);
board[row][j]='.';
}
}

public static void printBoard(char board[][]){
    System.out.println("--------chess board---------");
for(int i=0;i<board.length;i++){
for(int j=0;j<board.length;j++){
System.out.print(board[i][j]+ " ");

}
System.out.println();
}

}


public static void main(String args[]){
int n=2;

char board[][]=new char[n][n];

for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
board[i][j]='.';

}
}
nQuees(board,0);

}

}   