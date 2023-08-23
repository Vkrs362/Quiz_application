
package quiz.application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
;

public class Score extends JFrame implements ActionListener{
     
    Score(String name,int score){
      setBounds(600,150,750,550);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
       JLabel image=new JLabel(i1);
       image.setBounds(240,10,300,250);
       add(image);
        
       JLabel heading=new JLabel("ThankYou " + name + " for playing" );
       heading.setBounds(250,300,600,25);
       heading.setFont(new Font("Tahoma",Font.PLAIN,24));
       add(heading);
       
       JLabel lbscore=new JLabel("Your score is " +score);
       lbscore.setBounds(250,330,600,25);
       lbscore.setFont(new Font("Tahoma",Font.PLAIN,24));
       add(lbscore);
        
        JButton submit=new JButton("Play Again");
        submit.setBounds(320,370,110,20);
        submit.setBackground(new  Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[])
    {
        new Score("User",0);
    }
}
