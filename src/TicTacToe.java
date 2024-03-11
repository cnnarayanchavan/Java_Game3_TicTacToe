//need to import needed pacages for game 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame 
{
 int BoardWidth=600;
 int BoardHeight=650;

 JFrame frame = new JFrame();       //for game window 
 
 JLabel textLabel = new JLabel();   //for textLabel of game
 
 JPanel textPanel = new JPanel();   //for text panel of game


 TicTacToe(){
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

 }
}

