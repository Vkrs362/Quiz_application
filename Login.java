package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField jname;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,400);
        add(image);
        
        JLabel heading=new JLabel("creative people let's get started");
        heading.setBounds(650,100,300,50);
        heading.setFont(new Font("Viner hand ITC",Font.BOLD, 20));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(710,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        name.setForeground(Color.BLACK);
        add(name);
        
        jname=new JTextField();
        jname.setBounds(650,200,300,20);
        name.setFont(new Font("Times New Roman",Font.BOLD, 20));
        add(jname);
        
        rules=new JButton("Rules");
        rules.setBounds(650,250,120,20);
        rules.setBackground(new  Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
         
         back=new JButton("Back");
        back.setBounds(800,250,120,20);
        back.setBackground(new  Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,420);
        setLocation(200,100);
       setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==rules){
            String name=jname.getText();
            setVisible(false);
            new Rules(name);
        }
         else if(ae.getSource()==back) {
            setVisible(false);
            
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
    
}
