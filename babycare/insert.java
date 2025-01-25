package babycare;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.sql.*;
public class insert extends JFrame implements MenuListener, ActionListener {
    JPanel panel;
    JScrollPane scrollPane;
    JMenu menu,menu1,menu2,menu3,menu4,menu5,menu6,menu7;
    JButton btn, filebtn;
    JTextField tb1, tb2;
    JTextArea tarea;
    File f;
    String dir;
    public insert() {
        panel = new JPanel();
        panel.setLayout(null);
         scrollPane = new JScrollPane(panel);
        add(scrollPane);
        panel.setBackground(Color.white);
        JLabel label = new JLabel("Insert Products");
         label.setBounds(1330, 50, 450, 200);
        label.setFont(new Font("Arial", Font.BOLD, 60));
         label.setForeground(Color.decode("#b666d2"));
        panel.add(label);

        JLabel lbl1 = new JLabel("Product Name:");
        lbl1.setBounds(1350, 200, 200, 100);
        lbl1.setFont(new Font("Arial", Font.BOLD, 25));
        lbl1.setForeground(Color.black);
         panel.add(lbl1);
        tb1 = new JTextField();
        tb1.setBounds(1350, 280, 400, 50);
        tb1.setFont(new Font("Arial", Font.BOLD, 25));
        tb1.setForeground(Color.decode("#b666d2"));
         tb1.setBorder(new LineBorder(Color.decode("#b666d2")));
        panel.add(tb1);
        JLabel lbl2 = new JLabel("Product Price:");
        lbl2.setBounds(1350, 320, 200, 100);
        lbl2.setFont(new Font("Arial", Font.BOLD, 25));
        lbl2.setForeground(Color.black);
        panel.add(lbl2);
         tb2 = new JTextField();
        tb2.setBounds(1350, 400, 400, 50);
        tb2.setFont(new Font("Arial", Font.BOLD, 25));
        tb2.setForeground(Color.decode("#b666d2"));
        tb2.setBorder(new LineBorder(Color.decode("#b666d2")));
        panel.add(tb2);
        JLabel lbl3 = new JLabel("Product Information:");
        lbl3.setBounds(1350, 440, 200, 100);
         lbl3.setFont(new Font("Arial", Font.BOLD, 25));
        lbl3.setForeground(Color.black);
        panel.add(lbl3);
        tarea = new JTextArea(5, 20);
        tarea.setFont(new Font("Arial", Font.BOLD, 25));
        tarea.setForeground(Color.decode("#b666d2"));
        tarea.setBorder(new LineBorder(Color.decode("#b666d2")));
        JScrollPane tsp = new JScrollPane(tarea);
        tsp.setBounds(1350, 520, 400, 150);
        panel.add(tsp);
        filebtn = new JButton("Select Image");
        filebtn.setBounds(1350, 700, 400, 50);
        filebtn.setBackground(Color.decode("#b666d2"));
        filebtn.setForeground(Color.white);
         filebtn.setFont(new Font("Arial", Font.BOLD, 25));
        filebtn.setBorderPainted(false);
        filebtn.setFocusPainted(false);
        panel.add(filebtn);
        filebtn.addActionListener(this);
        btn = new JButton("Submit");
        btn.setBounds(1350, 780, 400, 50);
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
        menu3.addMenuListener(this);
        mb.add(menu3);
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
         if (e.getSource()==filebtn) {
             JFileChooser fc=new JFileChooser();
        int rv=fc.showOpenDialog(null);
            if (rv==JFileChooser.APPROVE_OPTION) {
                  f=fc.getSelectedFile();
             dir="D:/bca/babycare/img/products";
            }
         }
        if(e.getSource()==btn){
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection conn=DriverManager.getConnection("jdbc:odbc:babycare");
                Statement state=conn.createStatement();
                String path="babycare/img/products/"+f.getName();
                int res=state.executeUpdate("insert into product(pname,pprice,pinfo,pimg) values('"+tb1.getText().toString()+"','"+Integer.parseInt(tb2.getText().toString())+"','"+tarea.getText().toString()+"','"+path+"')");
                if(res!=-1){
                    try{
                    File destFile=new File(dir,f.getName());
                       filecopy(f,destFile);
                JOptionPane.showMessageDialog(null,"File uploaded successfully!","BabyCare Alerts!",JOptionPane.INFORMATION_MESSAGE);
                }catch (IOException exc) {
                    System.out.println(exc);
                }
                    JOptionPane.showMessageDialog(null,"Product Added Successfully!","BabyCare Alerts!",JOptionPane.INFORMATION_MESSAGE);    
                }else{
                    JOptionPane.showMessageDialog(null,"Something went wrong, try again later!","BabyCare Alerts!",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception ex){
            System.out.println(ex);
        }
        }
}

    public void filecopy(File sf, File df) throws IOException {
        InputStream is = new FileInputStream(sf);
        OutputStream os = new FileOutputStream(df);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
        is.close();
        os.close();
    }
}
