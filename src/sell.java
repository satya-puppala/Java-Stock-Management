import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
public class sell extends JFrame implements ActionListener
{
       //panels
    JPanel black = new JPanel();
    JPanel white = new JPanel();
    JPanel blackin1 = new JPanel();
    JPanel blackin2 = new JPanel();
    JPanel grid = new JPanel();
    JPanel eastpanel = new JPanel();
    JPanel westpanel = new JPanel();
    JPanel listpanel = new JPanel();
    JPanel gap = new JPanel();
    JPanel top = new JPanel();
    JPanel bot = new JPanel();
    
    //labels 
    JLabel main = new JLabel();
    
    
    
    //buttons
    JButton back = new JButton();
    JButton add = new JButton("ADD TO CART");
    
    
    //JList
    DefaultListModel<String> DLMS = new DefaultListModel<>();
    JList <String> mylists = new JList<>(DLMS);
    JScrollPane scroll = new JScrollPane(mylists);
    ArrayList<Product> alist = new ArrayList<>();
    
    
    //textarea
    JTextArea receipt = new JTextArea();
    JScrollPane scroll2 = new JScrollPane(receipt);
   
  public sell()
  {

    
    setTitle("u1726436");
        setSize(732,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        add(BorderLayout.NORTH,black);
        black.setBackground(Color.black);
        black.setPreferredSize(new Dimension(732,231));
        add(BorderLayout.SOUTH,white);
        white.setBackground(Color.white);
        white.setPreferredSize(new Dimension(732,469));
        
        //layouts
        black.add(BorderLayout.NORTH,blackin1);
        blackin1.setPreferredSize(new Dimension(532,91));
        blackin1.setBackground(Color.black);
        blackin1.setLayout(new FlowLayout(FlowLayout.LEFT));
        black.add(BorderLayout.SOUTH,blackin2);
        blackin2.setPreferredSize(new Dimension(500,140));
        blackin2.setBackground(Color.black);
        blackin2.setLayout(new FlowLayout(FlowLayout.LEFT));
        blackin2.add(main);
        blackin1.add(back);
 
        // logo
        
        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setBorder(null);
        back.setIcon(new javax.swing.ImageIcon("images\\icons8-undo-26.png"));
        
        main.setFont(new java.awt.Font("Gill Sans Nova", 2, 36)); 
        main.setForeground(new java.awt.Color(255, 255, 255));
        main.setIcon(new javax.swing.ImageIcon("images\\icons8-checkout-48.png"));
        main.setText("sell Product");  
        
        //bottom layouts
        white.add(BorderLayout.WEST,westpanel);
        westpanel.setPreferredSize(new Dimension(300,469));
        westpanel.setBackground(Color.white);
        westpanel.add(BorderLayout.NORTH,gap);
        gap.setBackground(Color.white);
        gap.setPreferredSize(new Dimension(300,100));
        westpanel.add(BorderLayout.CENTER,listpanel);
        listpanel.setBackground(Color.WHITE);
        listpanel.add(scroll);
        white.add(BorderLayout.EAST,top);
        top.setBackground(Color.white);
        top.setPreferredSize(new Dimension(300,350));
        top.add(BorderLayout.CENTER,grid);
        grid.setBackground(Color.white);
        grid.setLayout(new GridLayout(0,1,5,10));
        grid.add(scroll2);
        grid.add(add);
        ////list
        mylists.setVisibleRowCount(10);
        mylists.setBorder (BorderFactory.createLineBorder(Color.BLACK,3));
        
        
        ///button
            
            add.setPreferredSize(new Dimension(60,25));
            add.setBackground(Color.black);
            add.setForeground(Color.white);
            add.setBorder(new javax.swing.border.MatteBorder(1, 1, 1, 1, Color.black));
            add.addActionListener(this);
     
            ///button
            back.addActionListener(this);
            
            ///
            receipt.setPreferredSize(new Dimension(250,300));
            receipt.setBackground(Color.WHITE);
            receipt.setForeground(Color.black);
            receipt.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
            receipt.setEditable(false);
            
  }
  
  public void actionPerformed(ActionEvent e)
  {

        if(e.getSource() == back)
        {
            new mainscreen();
            this.dispose();
        }
        
  }
  
}

