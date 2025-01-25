package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class adminlogin extends JFrame implements MenuListener,ActionListener{
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1, menu2, menu3, menu4,menu5,menu6,menu7;
    JButton btn;
    JTextField tb1,tb2;
    JTextArea tarea; 
    public adminlogin(){
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        panel.setBackground(Color.white);
        JLabel label=new JLabel("Admin Login");
        label.setBounds(855,340,600,200);
        label.setFont(new Font("Arial",Font.BOLD,40));
        label.setForeground(Color.white);
        panel.add(label);

        JLabel lbl1=new JLabel("Username:");
        lbl1.setBounds(790,440,200,100);
        lbl1.setFont(new Font("Arial",Font.BOLD,20));
        lbl1.setForeground(Color.black);
        panel.add(lbl1);
        tb1=new JTextField();
        tb1.setBounds(790,520,400,50);
        tb1.setFont(new Font("Arial",Font.BOLD,20));
        tb1.setForeground(Color.decode("#6a5acd"));
        tb1.setBorder(new LineBorder(Color.decode("#6a5acd")));
        panel.add(tb1);
        JLabel lbl2=new JLabel("Password:");
        lbl2.setBounds(790,545,200,100);
        lbl2.setFont(new Font("Arial",Font.BOLD,20));
        lbl2.setForeground(Color.black);
        panel.add(lbl2);
        tb2=new JTextField();
        tb2.setBounds(790,620,400,50);
        tb2.setFont(new Font("Arial",Font.BOLD,20));
        tb2.setForeground(Color.decode("#6a5acd"));
        tb2.setBorder(new LineBorder(Color.decode("#6a5acd")));
        panel.add(tb2);
        btn=new JButton("Login");
        btn.setBounds(790,700,400,50);
        btn.setBackground(Color.decode("#6a5acd"));
        btn.setForeground(Color.white);
        btn.setFont(new Font("Arial",Font.BOLD,25));
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        panel.add(btn);
        btn.addActionListener(this);
        ImageIcon icon=new ImageIcon("babycare/img/adminlogin.png");
            JLabel lbl=new JLabel(icon);
            lbl.setSize(1920,1040);
            panel.add(lbl);
        lbl.setBackground(Color.black);
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
        menu.addMenuListener(this);
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
        panel.setPreferredSize(new Dimension(1345, 1020));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btn) {
        if (tb1.getText().isEmpty() || tb2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory, kindly fill all the fields!", "BabyCare Alerts!", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean match1 = tb1.getText().matches("[a-z0-9]+");
             boolean match2 = tb2.getText().matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?!.*\\s).{6,}$");
         if (!match1) {
               JOptionPane.showMessageDialog(null, "Only text input is allowed.", "BabyCare Alerts!", JOptionPane.ERROR_MESSAGE);
            } else if (!match2) {
                JOptionPane.showMessageDialog(null, "Password does not match the criteria, please check!", "BabyCare Alerts!", JOptionPane.ERROR_MESSAGE);
         } else {
                try {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection conn = DriverManager.getConnection("jdbc:odbc:babycare");
                    Statement state = conn.createStatement();
                ResultSet rs = state.executeQuery("select * from login where username='" + tb1.getText() + "' and password='" + tb2.getText() + "'");
                if (rs.next()) {
                         new admin();
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Credentials Entered, Kindly Check it Again!", "BabyCare Alerts!", JOptionPane.ERROR_MESSAGE);
                    }
                    rs.close(); // Close ResultSet
                    state.close(); // Close Statement
                    conn.close(); // Close Connection
                } catch (Exception exc) {
                 exc.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error connecting to database: " + exc.getMessage(), "BabyCare Alerts!", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }
}

}