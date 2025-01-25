package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class muslimnames extends JFrame implements MenuListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1, menu2, menu3, menu4,menu5,menu6,menu7;
    public muslimnames(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        JLabel heading=new JLabel("<html>Choose the best name for your little one!</html>");
        heading.setBounds(340,50,800,100);
        heading.setFont(new Font("Arial",Font.BOLD,30));
        heading.setForeground(Color.gray);
        panel.add(heading);
        JLabel names=new JLabel("<html>&#10026 Aisha<br>&#10026 Amir<br>&#10026 Amina<br>&#10026 Bilal<br>&#10026 Fatima<br>&#10026 Dawood<br>&#10026 Eman<br>&#10026 Farid<br>&#10026 Ghazi<br>&#10026 Hana<br>&#10026 Hassan<br>&#10026 Iman<br>&#10026 Ibrahim<br>&#10026 Jamal<br>&#10026 Jannah<br>&#10026 Karim<br>&#10026 Layla<br>&#10026 Malik</html>");
        names.setBounds(500,150,200,900);
        names.setFont(new Font("Arial",Font.BOLD,30));
        names.setForeground(Color.gray);
        panel.add(names);
        JLabel names2=new JLabel("<html>&#10026 Maryam<br>&#10026 Mustafa<br>&#10026 Naima<br>&#10026 Omar<br>&#10026 Qasim<br>&#10026 Qadir<br>&#10026 Rahim<br>&#10026 Safiya<br>&#10026 Samir<br>&#10026 Talib<br>&#10026 Umar<br>&#10026 Varda<br>&#10026 Waleed<br>&#10026 Xara<br>&#10026 Yasir<br>&#10026 Yusra<br>&#10026 Zahra<br>&#10026 Zayd</html>");
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