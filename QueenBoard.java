public class QueenBoard {
  private int[][]board;
  public QueenBoard(int size){
    int[][] board = new int[size][size];
  }
  private boolean addQueen(int r, int c) {

    for (int i = 0; r < board.length; i++) {
      board[r][i] += 1;
    }
    for (int i = 0; c < board.length; c++) {
      board[i][c] += 1;
    }
    return true;
  }
  private boolean removeQueen(int r, int c) {


    return true;
  }
  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  *"""_ _ Q _
  *Q _ _ _

  *_ _ _ Q

  *_ Q _ _"""
  *(pythonic string notation for clarity,
  *excludes the character up to the *)
  */
  public String toString(){
    return "" + board;




  }


  /**
  *@return false when the board is not solveable and leaves the board filled with zeros;

  *        true when the board is solveable, and leaves the board in a solved state

  *@throws IllegalStateException when the board starts with any non-zero value

  */
  public boolean solve(){
    return true;









  }

  /**
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value
  */
  public int countSolutions(){
    return 0;
  }








}