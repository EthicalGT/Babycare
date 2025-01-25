package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
public class baby extends JFrame implements MenuListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1, menu2, menu3, menu4,menu5,menu6,menu7;
    JLabel lbl2,lbl3,lbl4; 
    public baby(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        panel.setBackground(Color.white);
        JLabel heading=new JLabel("<html>-: Baby Names :-</html>");
        heading.setBounds(650,50,1800,100);
        heading.setFont(new Font("Arial",Font.BOLD,80));
        heading.setForeground(Color.black);
        panel.add(heading);
        JLabel heading2=new JLabel("<html>You can view baby names by selecying one of the following religion, kindly select one of the following!</html>");
        heading2.setBounds(300,130,1800,100);
        heading2.setFont(new Font("Arial",Font.PLAIN,30));
        heading2.setForeground(Color.black);
        panel.add(heading2);
        
        ImageIcon img=new ImageIcon("babycare/img/hindu.jpg");
        lbl2=new JLabel(img);
        lbl2.setBounds(100,250,500,500);
        panel.add(lbl2);
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        new hindunames();
    }
    });
        ImageIcon img2=new ImageIcon("babycare/img/christian.jpg");
        lbl3=new JLabel(img2);
        lbl3.setBounds(650,250,500,500);
        panel.add(lbl3);
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        new christiannames();
    }
});
        ImageIcon img3=new ImageIcon("babycare/img/muslim.jpg");
        lbl4=new JLabel(img3);
        lbl4.setSize(500,500);
        lbl4.setLocation(1250,250);
        panel.add(lbl4);
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        new muslimnames();
    }
});
        JLabel hindu=new JLabel("Hindu");
        hindu.setBounds(300,800,200,50);
        hindu.setFont(new Font("Arial",Font.BOLD,40));
        hindu.setForeground(Color.black);
        panel.add(hindu);
        JLabel christ=new JLabel("Christian");
        christ.setBounds(850,800,200,50);
        christ.setFont(new Font("Arial",Font.BOLD,40));
        christ.setForeground(Color.black);
        panel.add(christ);
        JLabel muslim=new JLabel("Muslim");
        muslim.setBounds(1450,800,200,50);
        muslim.setFont(new Font("Arial",Font.BOLD,40));
        muslim.setForeground(Color.black);
        panel.add(muslim);
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
        panel.setPreferredSize(new Dimension(1400, 768));
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