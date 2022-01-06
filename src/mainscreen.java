import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class mainscreen extends JFrame implements ActionListener
{
    //panels
    JPanel blue = new JPanel();
    JPanel white = new JPanel();
    JPanel bluein1 = new JPanel();
    JPanel bluein2 = new JPanel();
    JPanel grid = new JPanel();
    JPanel drop = new JPanel();
    JPanel pak = new JPanel();
    JPanel mid = new JPanel();
    JPanel space = new JPanel();
    
     // label  
        JLabel main = new JLabel();
   
     //buttons
        
        JButton ADD = new JButton();
        JButton EDIT = new JButton();
        JButton SELL = new JButton();
        
       
    
    BufferedReader br = null;
    
    
    public mainscreen()
    {
        
        setTitle("u1726436");
        setSize(632,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //main layout
        add(BorderLayout.NORTH,blue);
        blue.setBackground(new java.awt.Color(0,0,0));
        blue.setPreferredSize(new Dimension(632,181));
        add(BorderLayout.SOUTH,white);
        white.setBackground(new java.awt.Color(255,255,255));
        white.setPreferredSize(new Dimension(632,419));
        
        //layouts
        blue.add(BorderLayout.NORTH,bluein1);
        bluein1.setPreferredSize(new Dimension(632,81));
        bluein1.setBackground(new java.awt.Color(0,0,0));
        blue.add(BorderLayout.SOUTH,bluein2);
        bluein2.setPreferredSize(new Dimension(500,100));
        bluein2.setBackground(new java.awt.Color(0,0,0));
        bluein2.setLayout(new FlowLayout(FlowLayout.LEFT));
        bluein2.add(main);
        
        //main label
            main.setText("Apple");
            main.setFont(new java.awt.Font("Gill Sans Nova", 2, 36));
            main.setForeground(Color.white);
            main.setIcon(new javax.swing.ImageIcon("images\\icons8-apple-50.png"));
            
            //panels
            white.add(BorderLayout.NORTH,grid);
            grid.setPreferredSize(new Dimension(632,130));
            grid.setBackground(new java.awt.Color(255,255,255));
            white.add(BorderLayout.CENTER,pak);
            pak.setLayout(new GridLayout(0,2,70,0));
            pak.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            pak.setBackground(new java.awt.Color(255,255,255));
            white.add(BorderLayout.SOUTH,drop);
            drop.setBackground(new java.awt.Color(255,255,255));
            drop.setPreferredSize(new Dimension(643,220));
            drop.add(BorderLayout.NORTH,space);
            space.setPreferredSize(new Dimension(632,20));
            space.setBackground(Color.white);
            drop.add(BorderLayout.SOUTH,mid);
            mid.setLayout(new FlowLayout());
            mid.setPreferredSize(new Dimension(643,190));
            mid.setBackground(Color.white);
            pak.add(ADD);
            pak.add(EDIT);
            mid.add(SELL);
                                                                                            
            //buttons
            ADD.setPreferredSize(new Dimension(125,57));
            ADD.setBackground(new java.awt.Color(255, 255, 255));
            ADD.setFont(new java.awt.Font("Arial", 3, 14)); 
            ADD.setForeground(new java.awt.Color(0,0,0));
            ADD.setIcon(new javax.swing.ImageIcon("images\\icons8-add-file-48.png")); 
            ADD.setText("ADD");
            EDIT.setPreferredSize(new Dimension(125,57));
            EDIT.setFont(new java.awt.Font("Arial", 3, 14)); 
            EDIT.setText("EDIT");
            EDIT.setBackground(Color.white);
            EDIT.setForeground(new java.awt.Color(0,0,0));
            EDIT.setIcon(new javax.swing.ImageIcon("images\\icons8-edit-file-filled-48.png"));
            SELL.setPreferredSize(new Dimension(125,57));
            SELL.setBackground(new java.awt.Color(255, 255, 255));
            SELL.setFont(new java.awt.Font("Arial", 3, 14)); 
            SELL.setForeground(new java.awt.Color(0,0,0));
            SELL.setIcon(new javax.swing.ImageIcon("images\\icons8-buy-48 (1).png")); 
            SELL.setText("SELL");
            
            //actionlistener
            
            ADD.addActionListener(this);
            SELL.addActionListener(this);
            EDIT.addActionListener(this);
            
            
            
    }
    public void actionPerformed(ActionEvent g)
    {
       
        try{
        if(g.getSource() == ADD)
        {
            try
        {
             
            addPage add = new addPage();
   
        
        }catch(Exception b)          
        {
            
        }
            this.dispose();
        }
        if(g.getSource() == EDIT)
        {
            try
        {
             
            edit ed = new edit();
         
          
        }catch(Exception b)          
        {
            
        }
            
            this.dispose();
        }
        if(g.getSource() == SELL)
                {
                    try
        {
             
            sell se = new sell();
         
             
            BufferedReader br = null;
            
            br = new BufferedReader(new FileReader("file.dat"));
            
            
            
        
        }catch(Exception b)          
        {
            
        }
                    this.dispose();
                }
        }catch(Exception z)
        {
            
        }
        
    }
}
