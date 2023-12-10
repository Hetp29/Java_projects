import java.util.Scanner;
class Tictactoe {
  public static void main(String[] args) {
    char[][] b = new char[3][3]; //3x3 board 
    for(int r = 0; r < b.length; r++) {
      for(int c = 0; c< b[r].length; c++) {
        b[r][c] = ' ';
      }
    }

    char p = 'X';
    boolean gameOver = false; 
    Scanner scanner = new Scanner(System.in);

    while(!gameOver) {
      printBoard(b);
      System.out.print("Player " + p + " enter: ");
      int r = scanner.nextInt();
      int c = scanner.nextInt();
      System.out.println();

      if (b[r][c] == ' ') {
        b[r][c] = p;
        gameOver = haveWon(b, p);
        if (gameOver) {
          System.out.print("Player " + p + " is the winner. ");
        } else {
          if (p == 'X') {
            p = 'O';
          } else {
            p = 'X';
          }
        }
      } else {
        System.out.println("Invalid. Try again.");
      }
    }
    printBoard(b);
  }

  public static boolean haveWon(char[][] b, char p) {
    for(int r = 0; r < b.length; r++) {
      if(b[r][0] == p && b[r][0] == p && b[r][2] == p) {
        return true;
      }
      
    }
    for(int c = 0; c < b.length; c++) {
      if(b[0][c] == p && b[1][c] == p && b[2][c] == p) {
        return true;
      }
  }
    if(b[0][0] == p && b[1][1] == p && b[2][2] == p) {
      return true;
    }
    if(b[0][2] == p && b[1][1] == p && b[2][0] == p) {
      return true; 
    }
    return false; 
  }  

  public static void printBoard(char[][] b) {
    for(int r = 0; r < b.length; r++) {
      for(int c = 0; c< b[r].length; c++) {
        System.out.print(b[r][c] + " ");
      }
      System.out.println();
  }
}
}