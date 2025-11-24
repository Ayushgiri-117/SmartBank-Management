package com.ayushgiri117.smartbank.management;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){
        this.pin = pin;
        setTitle("SmartBank ATM Interface");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_bg.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("SMARTBANK ATM - Choose Your Operation");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        JLabel welcome = new JLabel("Welcome User: " + pin);
        welcome.setBounds(430,140,700,35);
        welcome.setForeground(Color.YELLOW);
        welcome.setFont(new Font("System",Font.BOLD,24));
        l3.add(welcome);
        
        JLabel lastLogin = new JLabel("Last Login: " + java.time.LocalDateTime.now());
        lastLogin.setBounds(430, 220, 400, 25);
        lastLogin.setForeground(Color.CYAN);
        lastLogin.setFont(new Font("System", Font.PLAIN, 18));
        l3.add(lastLogin);

        b1 = new JButton("Add Money");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(34, 120, 80));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Withdraw Cash");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(34, 120, 80));
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Quick ₹500/₹1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(34, 120, 80));
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("View Mini Statement");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(34, 120, 80));
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Change PIN");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(34, 120, 80));
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Check Balance");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(34, 120, 80));
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("Logout");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(34, 120, 80));
        b7.setBounds(700,406,150,35);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
           new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquriy(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
