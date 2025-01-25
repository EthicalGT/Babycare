package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
public class food extends JFrame implements MenuListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1,menu2,menu3,menu4,menu5,menu6,menu7;
    public food(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        JLabel lbll=new JLabel("<html><u>Healthy Baby Food :</u></html>");
        lbll.setBounds(50,100,400,50);
        lbll.setFont(new Font("Arial",Font.BOLD,35));
        lbll.setForeground(Color.white);
        panel.add(lbll);
        
        JLabel lbl1=new JLabel("<html>For a baby just starting solid foods (around 6 months), consider introducing purees and soft, easily digestible options. Here are some ideas:<br<br>1. *Single-Grain Cereals:* Begin with iron-fortified rice cereal or oatmeal mixed with breast milk or formula.<br>2. *Pureed Fruits:* Start with mild fruits like apples, pears, and bananas. Ensure they are well-cooked or appropriately mashed for easy swallowing.<br>3. *Pureed Vegetables:* Introduce soft vegetables like sweet potatoes, carrots, peas, or squash. Steam or boil them until very tender before pureeing.</html>");
        lbl1.setBounds(50,150,1300,400);
        lbl1.setFont(new Font("Arial",Font.PLAIN,30));
        lbl1.setForeground(Color.gray);
        panel.add(lbl1);
        ImageIcon img=new ImageIcon("babycare/img/food.jpeg");
        JLabel imglbl=new JLabel(img);
        imglbl.setBounds(1350,200,500,296);
        panel.add(imglbl);
        JLabel lbl2=new JLabel("<html>4. *Mashed Avocado:* Rich in healthy fats, mashed avocado is a nutritious choice and easy for little ones to eat.<br>5. *Pureed Meats:* Offer finely pureed meats such as chicken, turkey, or beef to provide essential iron and protein.<br>6. *Full-Fat Yogurt:* Opt for plain, full-fat yogurt as a source of calcium and healthy fats. Check with your pediatrician before introducing dairy.<br>7. *Soft Cooked Eggs:* Scrambled or well-cooked eggs can be introduced, starting with the yolk and gradually incorporating the whites.<br>8. *Cheese:* Offer small, soft cheese cubes or finely grated cheese. Again, ensure it's age-appropriate and consult with your pediatrician.<br>9. *Whole Grains:* Introduce well-cooked and finely mashed grains like quinoa, barley, or couscous for added texture.<br>10. *Finger Foods:* As your baby develops their pincer grasp, introduce small, soft finger foods like well-cooked and diced fruits, steamed vegetables, or small pieces of toast.<br>Always consult with your pediatrician before introducing new foods and monitor your baby for any signs of allergies or sensitivities. Gradually expanding their diet helps build a foundation for healthy eating habits.</html>");
        lbl2.setBounds(50,210,1800,1000);
        lbl2.setFont(new Font("Arial",Font.PLAIN,30));
       lbl2.setForeground(Color.gray);
       panel.add(lbl2);
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
        
        this.setTitle("BabyCare - Info");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(1345,1000));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void menuSelected(MenuEvent e) {
         if (e.getSource()==menu) {
                    new homepage();
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