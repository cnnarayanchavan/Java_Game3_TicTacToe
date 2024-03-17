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
 String PlayerO="O";
 String cuuPlayer = PlayerX;

 boolean gameOver = false;          //Game over condition 
 int turns = 0;
 
 


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
    textLabel.setForeground(Color.pink);
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
        //tile.setText(cuuPlayer);


        //noe to make buttons on tiles respnsible we have to add action listener

        tile.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            if (gameOver) return ;
            JButton tile = (JButton) e.getSource();  
            if (tile.getText() == "")
            {
               tile.setText(cuuPlayer);  
              turns++;
              checkWinner();
              if (!gameOver)
              {
                cuuPlayer = cuuPlayer == PlayerX ? PlayerO : PlayerX;
                //need to change the text label too as per X and O turn 
                textLabel.setText(cuuPlayer + "'s turn.");
              }
              
            }            
           }
        });
      }
    }         
  }   
  void checkWinner()  //first winning condition 
  {
    //Horizontal 
    for (int r = 0; r < 3; r++) {
      if(board[r][0].getText()=="") continue;
      
      if(board[r][0].getText()==board[r][1].getText()   &&
        board[r][1].getText()==board[r][2].getText())
      {
        for(int i = 0; i<3; i++){
          setWinner(board[r][i]);
        }
        gameOver = true;
        return;
      }
    }  

    //now for checking vertical condition 
    for(int c = 0; c<3; c++){
      if(board[0][c].getText() == "") continue;
      
      if(board[0][c].getText() == board[1][c].getText() &&
        board[1][c].getText() == board[2][c].getText())
      {
        for(int i=0; i<3; i++)
        {
          setWinner(board[i][c]);
        }
        gameOver = true;
        return;
      } 
        
    }

    //checking winning  condition digonally 
    if (board[0][0].getText() == board[1][1].getText() &&
       board[1][1].getText() == board[2][2].getText() &&
       board[0][0].getText() != "")
    {
        for(int i =0; i<3; i++)
        {
          setWinner(board[i][i]);
        }
        gameOver = true;
        return;
    }

    // adding next winner condition anti diagonally 
    if(board[0][2].getText() == board[1][1].getText() &&  //top right
       board[1][1].getText() == board[2][0].getText() &&  //middle
       board[0][2].getText() != "")                       //bottom left
    {
      setWinner(board[0][2]);
      setWinner(board[1][1]);
      setWinner(board[2][0]);
      gameOver = true; 
      return;
    }
    if(turns = 9)
    {
      for(int r=0; r<3; r++)
      {
        for(int c =0 ; c<3; c++)
        {
          setTie(board[r][c]);
        }
      }
      gameOver = true;
    }
  }
    // defining color for winners (green and gray)  
    void setWinner(JButton tile){
      tile.setForeground(Color.green);
      tile.setBackground(Color.gray);
      textLabel.setText(cuuPlayer + " is the winner!");
    }
  
}
  

