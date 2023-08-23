package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcoome "+ name+ " to creative club");
        heading.setBounds(50,20,400,50);
        heading.setFont(new Font("Viner hand ITC",Font.BOLD, 20));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(50,25,600,500);
        rules.setFont(new Font("Tahoma",Font.PLAIN, 15));
        rules.setText(
                "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
           );
        
        start=new JButton("Start");
        start.setBounds(250,450,100,20);
        start.setBackground(new  Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
         
         back=new JButton("Back");
        back.setBounds(420,450,100,20);
        back.setBackground(new  Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        add(rules);
        
       setSize(800,600);
        setLocation(400,100);
       setVisible(true);   
    }
       public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }
         else {
            setVisible(false);
            new Login();
            
        }
       }
    public static void main(String args[]) 
    {
        new Rules("USER");
    }
}
