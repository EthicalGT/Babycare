package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
public class info extends JFrame implements MenuListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1,menu2,menu3,menu4,menu5,menu6,menu7;
    public info(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        panel.setBackground(Color.WHITE);
        JLabel lbll=new JLabel("<html><u>Healthy Baby Tips :</u></html>");
        lbll.setBounds(50,100,400,50);
        lbll.setFont(new Font("Arial",Font.BOLD,35));
        lbll.setForeground(Color.white);
        panel.add(lbll);
        
        JLabel lbl1=new JLabel("<html>1. Gentle Bathing: Use mild baby soap and shampoo, and ensure the water is comfortably warm. Be cautious with water temperature and never leave the baby unattended. <br> 2. Soft Clothing: Dress your baby in soft, breathable fabrics. Avoid clothing with rough seams or tight elastic to keep them comfortable.<br>3. Feeding Time: Whether breastfeeding or using formula, create a calm environment. Hold the baby close and maintain eye contact for a bonding experience.</html>");
        lbl1.setBounds(50,150,1250,400);
        lbl1.setFont(new Font("Arial",Font.PLAIN,30));
        lbl1.setForeground(Color.GRAY);
        panel.add(lbl1);
        ImageIcon img=new ImageIcon("babycare/img/tips.jpg");
        JLabel imglbl=new JLabel(img);
        imglbl.setBounds(1280,130,550,340);
        panel.add(imglbl);
        ImageIcon img2=new ImageIcon("babycare/img/tips.jpg");
        JLabel imglb2=new JLabel(img);
        imglb2.setBounds(50,500,600,360);
        panel.add(imglb2);
        JLabel lbl2=new JLabel("<html><br>4. Safe Sleeping:* Always place your baby on their back to sleep in a crib with a firm mattress. Keep the sleeping area free of toys and loose bedding to reduce the risk of suffocation.<br>5. Diaper Duty: Change diapers frequently to prevent diaper rash. Use a gentle diaper cream and wipes designed for sensitive skin.<br>6. Cuddling Time: Regularly hold and cuddle your baby to provide comfort and promote bonding. Skin-to-skin contact is beneficial for both you and the baby.<br>7. Play and Exploration: Engage in simple activities like tummy time to encourage motor development. Use soft toys and age-appropriate activities to stimulate their senses.<br>8. Health Check-ups: Schedule regular check-ups with the pediatrician to monitor your baby's growth and address any concerns early on.</html>");
        lbl2.setBounds(680,160,1230,1000);
        lbl2.setFont(new Font("Arial",Font.PLAIN,30));
        lbl2.setForeground(Color.gray);
        panel.add(lbl2);
        JLabel lbl3=new JLabel("<html>9. Be Attentive: Pay attention to your baby's cues. Whether it's hunger, tiredness, or discomfort, responding promptly helps build trust and security.<br>10. Parental Self-Care: Take care of yourself too. Adequate rest, nutrition, and support will enable you to be the best caregiver for your little one.</html>");
        lbl3.setBounds(50,850,1800,200);
        lbl3.setFont(new Font("Arial",Font.PLAIN,30));
        lbl3.setForeground(Color.gray);
        panel.add(lbl3);
        ImageIcon bg=new ImageIcon("babycare/img/babybg2.jpg");
        JLabel bglbl=new JLabel(bg);
        bglbl.setSize(1920,1200);
        panel.add(bglbl);
        JMenuBar mb=new JMenuBar();
        mb.setOpaque(true);
        mb.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.setJMenuBar(mb);
        mb.setBackground(Color.decode("#000"));
        mb.add(Box.createHorizontalStrut(10));
        JMenu logo=new JMenu("BabyCare");
        logo.setFont(new Font("Calibri",Font.BOLD,22));
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
        
        menu2 = new JMenu("Baby Names");
        mb.add(menu2);
        mb.add(Box.createHorizontalStrut(40));
        menu2.setForeground(Color.white);
         menu2.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu3 = new JMenu("Tips");
        mb.add(menu3);
        mb.add(Box.createHorizontalStrut(40));
        menu3.setForeground(Color.white);
       menu3.setFont(new Font("Calibri", Font.BOLD,30 )); 
         
        menu4 = new JMenu("Food");
        mb.add(menu4);
        mb.add(Box.createHorizontalStrut(40)); 
        menu4.setForeground(Color.white);
         menu4.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu5 = new JMenu("Product");
        mb.add(menu5);
        mb.add(Box.createHorizontalStrut(40));
        menu5.setForeground(Color.white); 
        menu5.setFont(new Font("Calibri", Font.BOLD,30 ));
 
        menu6 = new JMenu("Admin"); 
        mb.add(menu6);
        mb.add(Box.createHorizontalStrut(40));
        menu6.setForeground(Color.WHITE); 
        menu6.setFont(new Font("Calibri", Font.BOLD,30 ));

        menu7 = new JMenu("Feedback");
        mb.add(menu7);
        menu7.setFont(new Font("Calibri", Font.BOLD,30 ));
        mb.add(Box.createHorizontalStrut(40));
        menu7.setForeground(Color.white); 
        menu.setFont(new Font("Calibri", Font.BOLD,30 )); this.setTitle("BabyCare - Info");
        menu.addMenuListener(this);
        menu1.addMenuListener(this);
        menu2.addMenuListener(this);
        menu3.addMenuListener(this);
        menu4.addMenuListener(this);
        menu5.addMenuListener(this);
        menu6.addMenuListener(this);
        menu7.addMenuListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(1345,1050));
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