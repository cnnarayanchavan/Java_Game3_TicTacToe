//need to import needed pacages for game 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame {
  int BoardWidth=600;
 int BoardHeight=650;

 JFrame frame = new JFrame("Tic-Tac-Toe");       //for game window 
 
 JLabel textLabel = new JLabel();   //for textLabel of game
 
 JPanel textPanel = new JPanel();   //for text panel of game

 JPanel boardPanel = new JPanel();   //for boadrpanel of game

 JButton[][] board = new JButton[3][3];  //buttins for board of window 
 String PlayerX ="X";
 String PlayerY="Y";
 String cuuPlayer = PlayerX;
 
 


 TicTacToe()
 {

    //adding game frame (window) --------------------------------------------------------
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setSize(BoardWidth, BoardHeight);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    //for addinf text to the game wondow -------------------------------------------------
    textLabel.setBackground(Color.darkGray);
    textLabel.setForeground(Color.white);
    textLabel.setFont(new Font("Arial", Font.BOLD, 50));
    textLabel.setHorizontalAlignment(JLabel.CENTER);
    textLabel.setText("Tic-Tac-Toe");
    textLabel.setOpaque(true);


    //for adding text to the game panel ---------------------------------------------------
    textPanel.setLayout(new BorderLayout());
    textPanel.add(textLabel);   


    //for adding textpanel to the frame window of game--------------------------------------
    //frame.add(textPanel);  // this refledts the game label in center of board so , to make room for our game window we have shift label to up
    frame.add(textPanel, BorderLayout.NORTH);


    // making the actual wondow for game with grid lines
    boardPanel.setLayout(new GridLayout(3,3));
    boardPanel.setBackground(Color.darkGray);
    frame.add(boardPanel);


    //Adding defined buttons into the game frame 
    for(int  r=0 ; r<3; r++){           //Cols for game
      for(int c=0; c<3; c++){
          JButton tile = new JButton();     //Rows for game
          board[r][c]=tile;
          boardPanel.add(tile);

        // adding the color into buttons tile and text on buttons 
        tile.setBackground(Color.darkGray);
        tile.setForeground(Color.red);
        tile.setFont(new Font("Arial", Font.BOLD, 120 ));
        tile.setFocusable(false);
        tile.seText(cuuPlayer);
        
        
      }
    }         
  }   
}


