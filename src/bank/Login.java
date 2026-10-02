package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
  
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setSize(800,490);
        setLocation(350,190);
        ImageIcon i1 = new ImageIcon("/icons/logo.jpg");
        JLabel label = new JLabel(i1);
        add(label);

    }

    public static void main(String[] args){
        new Login().setVisible(true);
    }

    
}