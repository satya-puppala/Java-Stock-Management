
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener
{
    //panels
    JPanel blue = new JPanel();
    JPanel white = new JPanel();
    JPanel bluein1 = new JPanel();
    JPanel bluein2 = new JPanel();
    JPanel grid = new JPanel();
    JPanel drop = new JPanel();
    JPanel pak = new JPanel();
    
    // label,textfeilds,buttons   
    JLabel main = new JLabel();
    JLabel userid = new JLabel(" ",SwingConstants.CENTER);
    JLabel passwrd = new JLabel(" ",SwingConstants.CENTER);
    JTextField id = new JTextField();
    JPasswordField pass = new JPasswordField();
    JButton log = new JButton();
    
    public login()
    {
        setTitle("u1726436");
        setSize(747,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //main layout
        add(BorderLayout.NORTH,blue);
        blue.setBackground(new java.awt.Color(0,0,0));
        blue.setPreferredSize(new Dimension(747,245));
        add(BorderLayout.SOUTH,white);
        white.setBackground(new java.awt.Color(255,255,255));
        white.setPreferredSize(new Dimension(747,355));

       
        
        //setting panels for main label
        
        blue.add(BorderLayout.NORTH,bluein1);
        bluein1.setPreferredSize(new Dimension(747,125));
        bluein1.setBackground(new java.awt.Color(0,0,0));
        blue.add(BorderLayout.SOUTH,bluein2);
        bluein2.setPreferredSize(new Dimension(600,120));
        bluein2.setBackground(new java.awt.Color(0,0,0));
        bluein2.setLayout(new FlowLayout(FlowLayout.LEFT));
        bluein2.add(main);
       
        
         //main label
            main.setText("Apple Store");
            main.setFont(new java.awt.Font("Gill Sans Nova", 2, 36));
            main.setForeground(Color.white);
            main.setIcon(new javax.swing.ImageIcon("images\\icons8-apple-50.png"));
            
         //panels for textfields
            
            white.add(BorderLayout.NORTH,grid);
            grid.setPreferredSize(new Dimension(747,51));
            grid.setBackground(new java.awt.Color(255,255,255));
            white.add(BorderLayout.CENTER,pak);
            pak.setBackground(new java.awt.Color(255,255,255)); 
            pak.setLayout(new GridLayout(0,1,5,10));
            pak.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            pak.add(userid);
            pak.add(id);
            pak.add(passwrd);
            pak.add(pass);
            drop.add(log);
            white.add(BorderLayout.SOUTH,drop);
            drop.setPreferredSize(new Dimension(747,54));
            drop.setBackground(new java.awt.Color(255,255,255)); 
            
               
       // components
       
        
        id.setPreferredSize(new Dimension(200,30));
        id.setBackground(Color.WHITE);
        id.setForeground(Color.black);
        pass.setPreferredSize(new Dimension(200,30));
        pass.setBackground(Color.WHITE);
        pass.setForeground(Color.black);
        
        passwrd.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        passwrd.setForeground(new java.awt.Color(0, 0, 0));
        passwrd.setIcon(new javax.swing.ImageIcon("images\\icons8-lock-48 (1).png")); 
        passwrd.setText("Password");
            
            
        userid.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        userid.setForeground(new java.awt.Color(0, 0, 0));
        userid.setIcon(new javax.swing.ImageIcon("images\\icons8-customer-48 (1).png")); 
        userid.setText(" Username");
            
            
            log.setText("    Login    ");
            log.setPreferredSize(new Dimension(100,25));
            log.setBackground(new java.awt.Color(0, 0, 0));
            log.setForeground(new java.awt.Color(255, 255, 255));
            log.setBorder(new javax.swing.border.MatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
            log.addActionListener(this);
     
  
    }
    
    public void actionPerformed(ActionEvent e)
    {
        try{
         if(id.getText().equals("apple") && pass.getText().equals("1001"))
            {
                new mainscreen();
                this.dispose();
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"please enter correct details");
                 id.setText("");
                 pass.setText("");
            }
        }catch(Exception y){
            
        }
        
        
    }
    
}

