package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class hindunames extends JFrame implements MenuListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1, menu2, menu3, menu4,menu5,menu6,menu7;
    public hindunames(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        JLabel heading=new JLabel("<html>Choose the best name for your little one!</html>");
        heading.setBounds(340,50,800,100);
        heading.setFont(new Font("Arial",Font.BOLD,30));
        heading.setForeground(Color.gray);
        panel.add(heading);
        JLabel names=new JLabel("<html>&#10026 Aarav<br>&#10026 Aanya<br>&#10026 Advait<br>&#10026 Anika<br>&#10026 Arjun<br>&#10026 Bhavya<br>&#10026 Bhuvan<br>&#10026 Bhumika<br>&#10026 Chaitanya<br>&#10026 Diya<br>&#10026 Dev<br>&#10026 Divya<br>&#10026 Ekta<br>&#10026 Farhan<br>&#10026 Gaurav<br>&#10026 Hrithik<br>&#10026 Ishita<br>&#10026 Jai<br>&#10026 Jyoti<br>&#10026 Krish<br>&#10026 Kavya<br>&#10026 Kunal<br>&#10026 Krish</html>");
        names.setBounds(500,150,200,900);
        names.setFont(new Font("Arial",Font.BOLD,30));
        names.setForeground(Color.gray);
        panel.add(names);
        JLabel names2=new JLabel("<html>&#10026 Kavya<br>&#10026 Kunal<br>&#10026 Lavanya<br>&#10026 Manan<br>&#10026 Meera<br>&#10026 Neha<br>&#10026 Om<br>&#10026 Prisha<br>&#10026 Qamar<br>&#10026 Riya<br>&#10026 Rohan<br>&#10026 Saanvi<br>&#10026 Shreya<br>&#10026 Tanvi<br>&#10026 Utkarsh<br>&#10026 Ved<br>&#10026 Vanya<br>&#10026 Wahid<br>&#10026 Xena<br>&#10026 Yash<br>&#10026 Yuvika<br>&#10026 Zara<br>&#10026 Zayn</html>");
        names2.setBounds(1300,150,200,900);
        names2.setFont(new Font("Arial",Font.BOLD,30));
        names2.setForeground(Color.gray);
        panel.add(names2);
        ImageIcon icon=new ImageIcon("babycare/img/namebg.jpg");
            JLabel lbl=new JLabel(icon);
            lbl.setSize(1920,1200);
            lbl.setLocation(0,0);
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
        menu.addMenuListener(this);
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
        menu5.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu5.setForeground(Color.white); 
        menu5.setFont(new Font("Calibri", Font.BOLD,30 ));
 
        menu6 = new JMenu("Admin"); 
        mb.add(menu6);
        menu6.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu6.setForeground(Color.WHITE); 
        menu6.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu7 = new JMenu("Feedback");
        mb.add(menu7);
        menu7.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu7.setForeground(Color.white); 
        menu7.setFont(new Font("Calibri", Font.BOLD,30 )); 

        setTitle("BabyCare - Homepage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(1345, 1200));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    public static void main(String[] args) {
                new homepage();
    }
}