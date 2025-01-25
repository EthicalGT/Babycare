package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class homepage extends JFrame implements MenuListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1, menu2, menu3, menu4,menu5,menu6,menu7;
    public homepage(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        JLabel heading=new JLabel("<html>Welcome to BabyCare, We Help You!</html>");
        heading.setBounds(280,300,1800,300);
        heading.setFont(new Font("Arial",Font.BOLD,80));
        heading.setForeground(Color.white);
        panel.add(heading);
        ImageIcon icon=new ImageIcon("babycare/img/bg2.jpg");
            JLabel lbl=new JLabel(icon);
            lbl.setSize(1920,1200);
            panel.add(lbl);
        JMenuBar mb = new JMenuBar();
        mb.setOpaque(true);
        mb.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setJMenuBar(mb);
        mb.setBackground(Color.decode("#000"));
        mb.add(Box.createHorizontalStrut(10));
        JMenu logo = new JMenu("BabyCare");
        logo.setFont(new Font("Calibri", Font.BOLD,30 ));
        logo.setForeground(Color.white);
        mb.add(logo);
        mb.add(Box.createVerticalStrut(50));
        mb.add(Box.createHorizontalStrut(300));
         
      menu = new JMenu("Home");
        mb.add(menu);
        menu.setForeground(Color.white); 
        menu.setFont(new Font("Calibri", Font.BOLD,30 ));
        mb.add(Box.createHorizontalStrut(40)); 
 
        menu1 = new JMenu("About");
        mb.add(menu1);
        mb.add(Box.createHorizontalStrut(40));
        menu1.setForeground(Color.white);  
         menu1.setFont(new Font("Calibri", Font.BOLD,30 )); 
         menu1.addMenuListener(this);

        menu2 = new JMenu("Baby Names");
        mb.add(menu2);
        mb.add(Box.createHorizontalStrut(40));
        menu2.setForeground(Color.white);
         menu2.setFont(new Font("Calibri", Font.BOLD,30 ));
         menu2.addMenuListener(this);

        menu3 = new JMenu("Tips");
        menu3.addMenuListener(this);
        mb.add(menu3);
        mb.add(Box.createHorizontalStrut(40));
        menu3.setForeground(Color.white);
       menu3.setFont(new Font("Calibri", Font.BOLD,30 )); 
         
        menu4 = new JMenu("Food");
        mb.add(menu4);
        menu4.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40)); 
        menu4.setForeground(Color.white);
         menu4.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu5 = new JMenu("Product");
        mb.add(menu5);
        mb.add(Box.createHorizontalStrut(40));
        menu5.setForeground(Color.white); 
        menu5.addMenuListener(this);
        menu5.setFont(new Font("Calibri", Font.BOLD,30 ));
 
        menu6 = new JMenu("Admin"); 
        mb.add(menu6);
        mb.add(Box.createHorizontalStrut(40));
        menu6.addMenuListener(this);
        menu6.setForeground(Color.WHITE); 
        menu6.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu7 = new JMenu("Feedback");
        mb.add(menu7);
        mb.add(Box.createHorizontalStrut(40));
        menu7.setForeground(Color.white); 
        menu7.addMenuListener(this);
        menu7.setFont(new Font("Calibri", Font.BOLD,30 )); 

        setTitle("BabyCare - Homepage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(1345, 768));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void menuSelected(MenuEvent e) {
         if (e.getSource()==menu) {
                    homepage ob = new homepage();
                    dispose();
            }  
             if (e.getSource()==menu1) {
                    myabout ob = new myabout();
                    dispose();
 
            }
            if (e.getSource()==menu3) {
                    info ob = new info();
                    dispose();
            }
            if (e.getSource()==menu4) {
                    food ob = new food();
                    dispose();
            }
             if (e.getSource()==menu2) {
                    new baby();
                    dispose();
            }  
            if (e.getSource()==menu6) {
                    new adminlogin();
                    dispose();
            }  
             if (e.getSource()==menu7) {
                    new feedback();
                    dispose();
            }  
            if (e.getSource()==menu5) {
                    new products();
                    dispose();
            }  
    }
    public void menuCanceled(MenuEvent e){

    }
    public void menuDeselected(MenuEvent e){

    }

    public static void main(String[] args) {
                new homepage();
    }
}