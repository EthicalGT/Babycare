package babycare;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

public class products extends JFrame implements MenuListener {
    String fname, path, fdesc, mname;
    String fpath;
    JButton btn;
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu, menu1, menu2, menu3, menu4, menu5, menu6, menu7;

    public products() {
        Border bd = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#00ffff"));
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        panel.setBackground(Color.white);
        /*JLabel tagline = new JLabel();
        tagline.setBackground(Color.BLACK);
        tagline.setBounds(0, 100, 4830, 300);
        panel.add(tagline);*/
        int x = 50;
        int y = 150;
        int distance = 400;
        int a = 50;
        int b = 150;
        int p = 150;
        int q = 500;
        int g = 70;
        int f = 550;
        int i = 70;
        int j = 540;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:babycare");
            Statement state = conn.createStatement();
            ResultSet op = state.executeQuery("select * from product");
            while (op.next()) {
                mname = op.getString("pname");
                fname = op.getString("pprice");
                fdesc = op.getString("pinfo");
                fpath= op.getString("pimg");
                JLabel lbl = new JLabel("<html>" +fdesc+"</html>");
                lbl.setBounds(i, j, 300, 300);
                lbl.setFont(new Font("Arial",Font.BOLD,20));
                panel.add(lbl);
                JLabel lbl1 = new JLabel("<html>Price: "+fname+"</html>");
                lbl1.setBounds(g,f,150,50);
                lbl1.setFont(new Font("Arial",Font.BOLD,20));
                panel.add(lbl1);
                JLabel lbl2 = new JLabel( mname );
                lbl2.setBounds(p, q, 250, 50);
                lbl2.setFont(new Font("Arial",Font.BOLD,25));
                panel.add(lbl2);
                ImageIcon img=new ImageIcon(fpath);
                JLabel lbl3 = new JLabel(img);
                lbl3.setBounds(a, b, 350, 350);
                lbl3.setOpaque(true);
                lbl3.setBorder(bd);
                panel.add(lbl3);

                JLabel label = new JLabel();
                label.setBounds(x, y, 350, 640);
                label.setOpaque(true);
                label.setBorder(bd);
                panel.add(label);

                x = x + distance;
                a = a +400;
                p = p +400;
                g = g +400;
                i = i +400;
            }

        } catch (Exception exception) {
            System.out.println(exception);
        }
        JLabel mylabel = new JLabel();
        mylabel.setBounds(0, 850, 4830, 100);
        mylabel.setOpaque(true);
        mylabel.setBackground(Color.decode("#000000"));
        panel.add(mylabel);
        JMenuBar mb = new JMenuBar();
        mb.setOpaque(true);
        mb.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setJMenuBar(mb);
        mb.setBackground(Color.decode("#000"));
        mb.add(Box.createHorizontalStrut(10));
        JMenu logo = new JMenu("BabyCare - Baby Products");
        logo.setFont(new Font("Calibri", Font.BOLD, 30));
        logo.setForeground(Color.white);
        mb.add(logo);
        mb.add(Box.createVerticalStrut(50));
        mb.add(Box.createHorizontalStrut(300));
        menu = new JMenu("Home");
        mb.add(menu);
        menu.addMenuListener(this);
        menu.setForeground(Color.white);
        menu.setFont(new Font("Calibri", Font.BOLD, 30));
        mb.add(Box.createHorizontalStrut(40));

        menu1 = new JMenu("About");
        mb.add(menu1);
        mb.add(Box.createHorizontalStrut(40));
        menu1.setForeground(Color.white);
        menu1.setFont(new Font("Calibri", Font.BOLD, 30));
        menu1.addMenuListener(this);

        menu2 = new JMenu("Baby Names");
        mb.add(menu2);
        mb.add(Box.createHorizontalStrut(40));
        menu2.setForeground(Color.white);
        menu2.setFont(new Font("Calibri", Font.BOLD, 30));
        menu2.addMenuListener(this);

        menu3 = new JMenu("Tips");
        menu3.addMenuListener(this);
        mb.add(menu3);
        mb.add(Box.createHorizontalStrut(40));
        menu3.setForeground(Color.white);
        menu3.setFont(new Font("Calibri", Font.BOLD, 30));

        menu4 = new JMenu("Food");
        mb.add(menu4);
        menu4.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu4.setForeground(Color.white);
        menu4.setFont(new Font("Calibri", Font.BOLD, 30));

        menu5 = new JMenu("Product");
        mb.add(menu5);
        mb.add(Box.createHorizontalStrut(40));
        menu5.setForeground(Color.white);
        menu5.addMenuListener(this);
        menu5.setFont(new Font("Calibri", Font.BOLD, 30));

        menu6 = new JMenu("Admin");
        mb.add(menu6);
        menu6.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu6.setForeground(Color.WHITE);
        menu6.setFont(new Font("Calibri", Font.BOLD, 30));

        menu7 = new JMenu("Feedback");
        mb.add(menu7);
        mb.add(Box.createHorizontalStrut(40));
        menu7.setForeground(Color.white);
        menu7.addMenuListener(this);
        menu7.setFont(new Font("Calibri", Font.BOLD, 30));

        setTitle("BabyCare - Products");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(5000, 768));
        setVisible(true);
    }

    public void menuSelected(MenuEvent e) {
         if (e.getSource()==menu) {
                    homepage ob = new homepage();
                    dispose();
            }  
             if (e.getSource()==menu1) {
                    new myabout();
                    dispose();
 
            }
            if (e.getSource()==menu3) {
                    new info();
                    dispose();
            }
            if (e.getSource()==menu5) {
                    new products();
                    dispose();
            }
            if (e.getSource()==menu4) {
                    new food();
                    dispose();
            }
             if (e.getSource()==menu2) {
                    new baby();
                    dispose();
            }  
             if (e.getSource()==menu6) {
                    new admin();
                    dispose();
            }  
             if (e.getSource()==menu7) {
                    new feedback();
                    dispose();
            }  
    }
    public void menuCanceled(MenuEvent e){

    }
    public void menuDeselected(MenuEvent e){

    }
}