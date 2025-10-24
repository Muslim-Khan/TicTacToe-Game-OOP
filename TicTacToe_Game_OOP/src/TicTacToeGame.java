
import java.util.Scanner;

class GameBoard {
    private String[][] grid = new String[3][3];
    public GameBoard() {
        resetboard();
    }
    Scanner sc = new Scanner(System.in);
    public void resetboard() {
        for( int i = 0; i<3; i++ ) {
            for( int j = 0; j<3; j++ ) {
                grid[i][j] = null;
            }
        }
    }
    public void printBoard() {
        double[][] represent = {{0.0,0.1,0.2},{1.0,1.1,1.2},{2.0,2.1,2.2}};
       for( int i = 0; i<3; i++ ) {
        for( int j = 0; j<3; j++ ) {
            System.out.print(represent[i][j] + " ");
        }
        System.out.println();
       }
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((grid[i][j] == null ? "-" : grid[i][j]) + " ");
            }
            System.out.println();
        }
    }
    public boolean  isOccupiedwith(String[][] arr, int i, int j,String symbol) {
        return arr[i][j] != null && arr[i][j].equals(symbol);
    }
    public String checkwin() {
        if( isOccupiedwith(grid,0, 0 , "O") && isOccupiedwith(grid, 0, 1 , "O") && isOccupiedwith(grid, 0, 2 , "O") ) {
            return "Player 1 Wins the Game.";
        }
        else if( isOccupiedwith(grid,1, 0 , "O") && isOccupiedwith(grid, 1, 1 , "O") && isOccupiedwith(grid, 1, 2 , "O") ) {
            return "Player 1 Wins the Game.";
        }
        else if( isOccupiedwith(grid,2, 0 , "O") && isOccupiedwith(grid, 2, 1 , "O") && isOccupiedwith(grid, 2, 2 , "O") ) {
            return "Player 1 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 0 , "O") && isOccupiedwith(grid, 1, 0 , "O") && isOccupiedwith(grid, 2, 0 , "O") ) {
            return "Player 1 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 1 , "O") && isOccupiedwith(grid, 1, 1 , "O") && isOccupiedwith(grid, 2, 1 , "O") ) {
            return "Player 1 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 2 , "O") && isOccupiedwith(grid, 1, 2 , "O") && isOccupiedwith(grid, 2, 2 , "O") ) {
            return "Player 1 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 0 , "O") && isOccupiedwith(grid, 1, 1 , "O") && isOccupiedwith(grid, 2, 2 , "O") ) {
            return "Player 1 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 2 , "O") && isOccupiedwith(grid, 1, 1 , "O") && isOccupiedwith(grid, 2, 0 , "O") ) {
            return "Player 1 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 0 , "X") && isOccupiedwith(grid, 0, 1 , "X") && isOccupiedwith(grid, 0, 2 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else if( isOccupiedwith(grid,1, 0 , "X") && isOccupiedwith(grid, 1, 1 , "X") && isOccupiedwith(grid, 1, 2 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else if( isOccupiedwith(grid,2, 0 , "X") && isOccupiedwith(grid, 2, 1 , "X") && isOccupiedwith(grid, 2, 2 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else if( isOccupiedwith(grid,1, 0 , "X") && isOccupiedwith(grid, 1, 1 , "X") && isOccupiedwith(grid, 1, 2 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 0 , "X") && isOccupiedwith(grid, 1, 0 , "X") && isOccupiedwith(grid, 2, 0 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 1 , "X") && isOccupiedwith(grid, 1, 1 , "X") && isOccupiedwith(grid, 2, 1 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 2 , "X") && isOccupiedwith(grid, 1, 2 , "X") && isOccupiedwith(grid, 2, 2 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 0 , "X") && isOccupiedwith(grid, 1, 1 , "X") && isOccupiedwith(grid, 2, 2 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else if( isOccupiedwith(grid,0, 2 , "X") && isOccupiedwith(grid, 1, 1 , "X") && isOccupiedwith(grid, 2, 0 , "X") ) {
            return "Player 2 Wins the Game.";
        }
        else
        return null;
         
    }
    public boolean isBoardfull() {
        return grid[0][0] != null && grid[0][1] != null && grid[0][2] != null && grid[1][0] != null && grid[1][1] != null && grid[1][2] !=null && grid[2][0] != null && grid[2][1] != null && grid[2][2] !=null;
    }    
    public String checkdraw() {
        if( checkwin() == null && isBoardfull() ) {
            return "IT IS A DRAW!";
        }
        return null;
    }
    public void placemove(Player player) {
        while (true) {
            System.out.println("Where do you want to input?");
            System.out.print("Row (0-2): ");
            int x = sc.nextInt();
            System.out.print("Column (0-2): ");
            int y = sc.nextInt();
    
            if (x < 0 || x > 2 || y < 0 || y > 2) {
                System.out.println("Invalid position! Try again.");
                continue;
            }
    
            if (grid[x][y] == null) {
                grid[x][y] = player.getsymbol();
                System.out.println("Occupied Successsfuly.");
                break;
            } else {
                System.out.println("Cell already occupied! Try again.");
            }
        }
    }
        
}

class Player {
    private String name ;
    private String symbol;
    public Player(String name,String symString) {
        this.name = name;
        this.symbol = symString;
    }
    public void makemove(GameBoard board) {
        board.placemove(this);
    }
    public String getsymbol() {
        return symbol;
    }
    public String getname() {
        return name;
    }
}

public class TicTacToeGame {
    public static void main(String[] args) {
        
        Player P1 = new Player("Player 1", "O");
        Player P2 = new Player("Player 2", "X");
        GameBoard board = new GameBoard();

        Player currentPlayer = P1;
        while (true) {
            
            board.printBoard();
            System.out.println( currentPlayer.getname() + "  Turn: ");
            currentPlayer.makemove(board);

            String winMessage = board.checkwin();
            if (winMessage != null) {
                board.printBoard();
                System.out.println(winMessage);
                break;
            }

            String drawMessage = board.checkdraw();
            if (drawMessage != null) {
                board.printBoard();
                System.out.println(drawMessage);
                break;
            }

            // Switch players
            currentPlayer = (currentPlayer == P1) ? P2 : P1;
        }    

    }
} 
