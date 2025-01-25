package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.sql.*;
public class delete extends JFrame implements MenuListener, ActionListener {
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1,menu2,menu3,menu4,menu5,menu6,menu7;
    JButton btn;
    JComboBox box;
    ArrayList<Integer> al;
    public delete() {
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        add(scrollPane);
        panel.setBackground(Color.white);
        JLabel label = new JLabel("Delete Products");
        label.setBounds(1310, 300, 550, 100);
        label.setFont(new Font("Arial", Font.BOLD, 60));
        label.setForeground(Color.decode("#b666d2"));
        panel.add(label);
        JLabel labell = new JLabel("Select Product No:");
        labell.setBounds(1350, 370, 450, 100);
        labell.setFont(new Font("Arial", Font.BOLD, 25));
        labell.setForeground(Color.decode("#000000"));
        panel.add(labell);
        box = new JComboBox();
        al = new ArrayList<Integer>();
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:babycare");
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery("select pno from product");
            while (rs.next()) {
                al.add(rs.getInt("pno"));
            }
            //state.close();
            //rs.close();
            //conn.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        for (int item : al) {
            box.addItem(item);
        }
        box.setBounds(1350, 450, 400, 50);
        box.setForeground(Color.decode("#b666d2"));
        box.setBorder(new LineBorder(Color.decode("#b666d2")));
        box.setBackground(Color.white);
        box.setFont(new Font("Arial", Font.BOLD, 25));
        panel.add(box);
        btn = new JButton("Submit");
        btn.setBounds(1350, 550, 400, 50);
         btn.setBackground(Color.decode("#b666d2"));
        btn.setForeground(Color.white);
        btn.setFont(new Font("Arial", Font.BOLD, 25));
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        panel.add(btn);
        btn.addActionListener(this);
        ImageIcon icon = new ImageIcon("babycare/img/IUD.jpg");
        JLabel lbl = new JLabel(icon);
        lbl.setSize(1000, 1000);
        lbl.setLocation(70, 0);
        panel.add(lbl);
        JMenuBar mb = new JMenuBar();
        mb.setOpaque(true);
        mb.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setJMenuBar(mb);
        mb.setBackground(Color.decode("#008080"));
        mb.add(Box.createHorizontalStrut(10));
        JMenu logo = new JMenu("BabyCare Admin");
        logo.setFont(new Font("Calibri", Font.BOLD, 30));
        logo.setForeground(Color.white);
         mb.add(logo);
        mb.add(Box.createVerticalStrut(50));
        mb.add(Box.createHorizontalStrut(300));
        menu = new JMenu("Homepage");
        mb.add(menu);
        menu.addMenuListener(this);
        menu.setForeground(Color.white);
        menu.setFont(new Font("Calibri", Font.BOLD, 30));
        mb.add(Box.createHorizontalStrut(40));
        menu1 = new JMenu("Insert");
        mb.add(menu1);
        mb.add(Box.createHorizontalStrut(40));
        menu1.setForeground(Color.white);
        menu1.setFont(new Font("Calibri", Font.BOLD, 30));
        menu1.addMenuListener(this);
        menu2 = new JMenu("Update");
        mb.add(menu2);
        mb.add(Box.createHorizontalStrut(40));
        menu2.setForeground(Color.white);
        menu2.setFont(new Font("Calibri", Font.BOLD, 30));
        menu2.addMenuListener(this);
        menu3 = new JMenu("Delete");
        mb.add(menu3);
        menu3.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu3.setForeground(Color.white);
        menu3.setFont(new Font("Calibri", Font.BOLD, 30));
        menu4 = new JMenu("Feedback");
        mb.add(menu4);
        menu4.addMenuListener(this);
        mb.add(Box.createHorizontalStrut(40));
        menu4.setForeground(Color.white);
        menu4.setFont(new Font("Calibri", Font.BOLD, 30));
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
    public void menuCanceled(MenuEvent e){}
    public void menuDeselected(MenuEvent e){}
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection conn=DriverManager.getConnection("jdbc:odbc:babycare");
                Statement state=conn.createStatement();
                int res = state.executeUpdate("delete from product where pno="+Integer.parseInt(box.getSelectedItem().toString()));
                if(res!=-1){
                    JOptionPane.showMessageDialog(null,"Product Deleted Successfully!","BabyCare Alerts!",JOptionPane.INFORMATION_MESSAGE);                   
                }else{
                    JOptionPane.showMessageDialog(null,"Something went wrong, try again later!","BabyCare Alerts!",JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception ex){
            System.out.println(ex);
        }
        }
}
}
