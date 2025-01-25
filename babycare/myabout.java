package babycare;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import javax.swing.event.*;
public class myabout extends JFrame implements MenuListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1, menu2, menu3, menu4,menu5,menu6,menu7;
    public myabout(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        panel.setBackground(Color.white);
        JLabel tagline=new JLabel("<html><b>About</b> Us</b></html>");
        tagline.setFont(new Font("Arial",Font.PLAIN,100));
        tagline.setForeground(Color.black);
        tagline.setBounds(50,200,1000,100);
        panel.add(tagline);
        JLabel p1=new JLabel("<html> Child safety is paramount.We prioritize creating a secure environment, employing qualified caregivers, and implementing stringent safety protocols to ensure the well-being of every child entrusted to us. Our commitment to child safety is unwavering. We meticulously screen and train our caregivers, maintain a secure environment, and adhere to strict safety protocols. Your child's well-being is our top priority.Child Safety and Care is the most import  to protect our child and protect our child's future...</html>");
        p1.setBounds(50,340,500,400);
        p1.setFont(new Font("Arial",Font.PLAIN,22));
        p1.setForeground(Color.BLACK);
        panel.add(p1);
        JLabel label=new JLabel("Child Safety & Care...");
        label.setBounds(50,300,400,90);
        label.setForeground(Color.black);
        label.setOpaque(false);
        label.setFont(new Font("Arial",Font.PLAIN,30));
        panel.add(label);
        ImageIcon icon=new ImageIcon("babycare/img/about2.jpg");
            JLabel lbl=new JLabel(icon);
            lbl.setBounds(500,0,1500,1000);
            panel.add(lbl);
            JButton btn=new JButton("Connect");
            btn.setBackground(new Color(218,112,214));
            btn.setBounds(50,730,300,70);
            btn.setFont(new Font("Arial",Font.BOLD,30));
            btn.setFocusPainted(false);
            btn.setForeground(Color.white);
            panel.add(btn);
        JMenuBar mb=new JMenuBar();
        mb.setOpaque(true);
        mb.setBorder(new EmptyBorder(0, 0, 0, 1));
        this.setJMenuBar(mb);
        mb.setBackground(Color.white);
        mb.add(Box.createHorizontalStrut(10));
        JMenu logo=new JMenu("BabyCare");
        logo.setFont(new Font("Calibri",Font.BOLD,22));
        logo.setForeground(Color.white);
        mb.add(logo);
        mb.add(Box.createVerticalStrut(50));
        mb.add(Box.createHorizontalStrut(300));
        menu = new JMenu("Home");
        mb.add(menu);
        menu.addMenuListener(this);
        menu.setForeground(Color.black); 
        menu.setFont(new Font("Calibri", Font.BOLD,30 ));
        mb.add(Box.createHorizontalStrut(40)); 
        menu1 = new JMenu("About");
        mb.add(menu1);
        mb.add(Box.createHorizontalStrut(40));
        menu1.setForeground(Color.black);  
         menu1.setFont(new Font("Calibri", Font.BOLD,30 )); 
         menu1.addMenuListener(this);

        menu2 = new JMenu("Baby Names");
        mb.add(menu2);
        menu2.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu2.setForeground(Color.black);
         menu2.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu3 = new JMenu("Tips");
        menu3.addMenuListener(this);
        mb.add(menu3);
        mb.add(Box.createHorizontalStrut(40));
        menu3.setForeground(Color.black);
       menu3.setFont(new Font("Calibri", Font.BOLD,30 )); 
         
        menu4 = new JMenu("Food");
        mb.add(menu4);
        menu4.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40)); 
        menu4.setForeground(Color.black);
         menu4.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu5 = new JMenu("Product");
        mb.add(menu5);
        menu5.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu5.setForeground(Color.black); 
        menu5.setFont(new Font("Calibri", Font.BOLD,30 ));
 
        menu6 = new JMenu("Admin"); 
        mb.add(menu6);
        menu6.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu6.setForeground(Color.black); 
        menu6.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu7 = new JMenu("Feedback");
        mb.add(menu7);
        menu7.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu7.setForeground(Color.black); 
        menu7.setFont(new Font("Calibri", Font.BOLD,30 )); 
        mb.add(Box.createHorizontalStrut(40));
        this.setTitle("BabyCare - About");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(1345, 768));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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