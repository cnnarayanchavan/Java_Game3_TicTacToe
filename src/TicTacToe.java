//need to import needed pacages for game 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame 
{
 int BoardWidth=600;
 int BoardHeight=650;

 JFrame frame = new JFrame();
 JLabel textLabel = new JLabel();
 JPanel textPanel = new JPanel();


 TicTacToe(){
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setSize(BoardWidth, BoardHeight);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    //
    textLabel.setBackground(Color.darkGray);
    textLabel.setForeground(Color.white);
    textLabel.setFont(new Font("Arial", Font.BOLD, 50));
    textLabel.setHorizontalAlignment(JLabel.CENTER);
    textLabel.setText("Tic-Tac-Toe");
    textLabel.setOpaque(true);


    //
    textPanel.setLayout(new BorderLayout());
    textPanel.add(textLabel);   


    //
    frame.add(textPanel);

 }
}

