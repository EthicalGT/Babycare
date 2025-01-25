package babycare;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.sql.*;
public class feedback_records extends JFrame implements MenuListener {
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu, menu1, menu2, menu3, menu4;
    JTable tbl;
    DefaultTableModel tm;

    public feedback_records() {
        panel = new JPanel();
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        panel.setBackground(Color.white);
        add(scrollPane);
        JLabel lbll = new JLabel("User Feedbacks");
        lbll.setBounds(960, 250,600,100);
        lbll.setFont(new Font("Arial",Font.BOLD,60));
        lbll.setForeground(Color.decode("#008080"));
        panel.add(lbll);
        Border bd = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.decode("#008080"));
        String col[] = { "uname", "ucontact", "umsg" };
        tm = new DefaultTableModel(col, 0);
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn = DriverManager.getConnection("jdbc:odbc:babycare");
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery("select * from feedback");
            while (rs.next()) {
                Object[] r = new Object[col.length];
                for (int i = 0; i < col.length; i++) {
                    r[i] = rs.getObject(col[i]);
                }
                tm.addRow(r);
            }
            tbl = new JTable(tm);
            JTableHeader hd = tbl.getTableHeader();
            hd.setFont(new Font("Arial", Font.BOLD, 25));
            hd.setForeground(Color.white);
            hd.setBackground(Color.decode("#008080"));
            hd.setBorder(bd );
            tbl.setFont(new Font("Arial",Font.PLAIN,22));
            tbl.setForeground(Color.decode("#008080"));
            JScrollPane js = new JScrollPane(tbl);
            js.setBounds(960, 390, 750, 500);
            js.setBackground(Color.white);
           js.setPreferredSize(new Dimension(1200, 800));
            panel.add(js);
        } catch (Exception e) {
            System.out.print(e);
        }
        ImageIcon icon = new ImageIcon("babycare/img/feedbackui.png");
        JLabel lbl = new JLabel(icon);
        lbl.setSize(1920, 1200);
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
        menu3.addMenuListener(this);
        mb.add(menu3);
        mb.add(Box.createHorizontalStrut(40));
        menu3.setForeground(Color.white);
        menu3.setFont(new Font("Calibri", Font.BOLD, 30));

        menu4 = new JMenu("Feedback");
        menu4.addMenuListener(this);
        mb.add(menu4);
        mb.add(Box.createHorizontalStrut(40));
        menu4.setForeground(Color.white);
        menu4.setFont(new Font("Calibri", Font.BOLD, 30));

        setTitle("BabyCare - Admin Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panel.setPreferredSize(new Dimension(1345, 1200));
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

    public void menuCanceled(MenuEvent e) {
    }

    public void menuDeselected(MenuEvent e) {
    }
}
