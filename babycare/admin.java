package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class admin extends JFrame implements MenuListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1, menu2, menu3, menu4,menu5,menu6,menu7;
    public admin(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        JLabel heading=new JLabel("<html>Welcome to Admin Panel, Ready to control babycare!</html>");
        heading.setBounds(180,350,1800,300);
        heading.setFont(new Font("Arial",Font.BOLD,60));
        heading.setForeground(Color.white);
        panel.add(heading);
        ImageIcon icon=new ImageIcon("babycare/img/admin.png");
            JLabel lbl=new JLabel(icon);
            lbl.setSize(1920,1200);
            panel.add(lbl);
        JMenuBar mb = new JMenuBar();
        mb.setOpaque(true);
        mb.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setJMenuBar(mb);
        mb.setBackground(Color.decode("#008080"));
        mb.add(Box.createHorizontalStrut(10));
        JMenu logo = new JMenu("BabyCare Admin");
        logo.setFont(new Font("Calibri", Font.BOLD,30 ));
        logo.setForeground(Color.white);
        mb.add(logo);
        mb.add(Box.createVerticalStrut(50));
        mb.add(Box.createHorizontalStrut(300));
         
        menu = new JMenu("Homepage");
        mb.add(menu);
        menu.setForeground(Color.white); 
        menu.addMenuListener(this);
        menu.setFont(new Font("Calibri", Font.BOLD,30 ));
        mb.add(Box.createHorizontalStrut(40)); 
 
        menu1 = new JMenu("Insert");
        mb.add(menu1);
        mb.add(Box.createHorizontalStrut(40));
        menu1.setForeground(Color.white);  
        menu1.setFont(new Font("Calibri", Font.BOLD,30 )); 
        menu1.addMenuListener(this);

        menu2 = new JMenu("Update");
        mb.add(menu2);
        mb.add(Box.createHorizontalStrut(40));
        menu2.setForeground(Color.white);
        menu2.setFont(new Font("Calibri", Font.BOLD,30 ));
        menu2.addMenuListener(this);

        menu3 = new JMenu("Delete");
        menu3.addMenuListener(this);
        mb.add(menu3);
        mb.add(Box.createHorizontalStrut(40));
        menu3.setForeground(Color.white);
        menu3.setFont(new Font("Calibri", Font.BOLD,30 )); 
         
        menu4 = new JMenu("Feedback");
        mb.add(menu4);
        menu4.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40)); 
        menu4.setForeground(Color.white);
         menu4.setFont(new Font("Calibri", Font.BOLD,30 ));

        setTitle("BabyCare - Admin Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(1345, 768));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void menuSelected(MenuEvent e) {
         if (e.getSource()==menu) {
                    new homepage();
                    dispose();
            }  
             if (e.getSource()==menu1) {
                    new insert();
                    dispose();
 
            }
            if (e.getSource()==menu3) {
                    new delete();
                    dispose();
            }
            if (e.getSource()==menu4) {
                    new feedback_records();
                    dispose();
            }
             if (e.getSource()==menu2) {
                    new update();
                    dispose();
            }  
    }
    public void menuCanceled(MenuEvent e){

    }
    public void menuDeselected(MenuEvent e){

    }
}