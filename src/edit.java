import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
public class edit extends JFrame implements ActionListener
{
       //panels
    JPanel black = new JPanel();
    JPanel white = new JPanel();
    JPanel blackin1 = new JPanel();
    JPanel blackin2 = new JPanel();
    JPanel grid = new JPanel();
    JPanel drop = new JPanel();
    JPanel westpanel = new JPanel();
    JPanel listpanel = new JPanel();
    JPanel gap = new JPanel();
    
    //labels 
    JLabel main = new JLabel();
    JLabel product = new JLabel("edit Name:");
    JLabel price = new JLabel("edit Price:");
    JLabel stock = new JLabel("edit Stock:");
    
    
    //buttons
    JButton back = new JButton();
    JButton ADD = new JButton("EDIT");
    JButton DELETE = new JButton("DELETE");
   
    
    //JList

    JList <Product> myliste = new JList<>(runMain.DLM);
    JScrollPane scroll = new JScrollPane(myliste);
    
    
    //textfields
    JTextField productt = new JTextField();
    JTextField pricet = new JTextField();
    JTextField stockt = new JTextField();
   
    private addPage add;
    
  public edit()
  {

    
    setTitle("u1726436");
        setSize(632,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        add(BorderLayout.NORTH,black);
        black.setBackground(Color.black);
        black.setPreferredSize(new Dimension(632,181));
        add(BorderLayout.SOUTH,white);
        white.setBackground(new java.awt.Color(255,255,255));
        white.setPreferredSize(new Dimension(632,419));
        
        //layouts
        black.add(BorderLayout.NORTH,blackin1);
        blackin1.setPreferredSize(new Dimension(532,81));
        blackin1.setBackground(new java.awt.Color(0, 0, 0));
        blackin1.setLayout(new FlowLayout(FlowLayout.LEFT));
        black.add(BorderLayout.SOUTH,blackin2);
        blackin2.setPreferredSize(new Dimension(500,100));
        blackin2.setBackground(new java.awt.Color(0, 0, 0));
        blackin2.setLayout(new FlowLayout(FlowLayout.LEFT));
        blackin2.add(main);
        blackin1.add(back);
 
        // logo
        
        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setBorder(null);
        back.setIcon(new javax.swing.ImageIcon("images\\icons8-undo-26.png"));
        
        main.setFont(new java.awt.Font("Gill Sans Nova", 2, 36)); 
        main.setForeground(new java.awt.Color(255, 255, 255));
        main.setIcon(new javax.swing.ImageIcon("images\\icons8-edit-file-50 (1).png"));
        main.setText("Edit Product");  
        
        //bottom layouts
        white.add(BorderLayout.WEST,westpanel);
        westpanel.setPreferredSize(new Dimension(316,419));
        westpanel.setBackground(Color.white);
        westpanel.add(BorderLayout.NORTH,gap);
        gap.setBackground(Color.white);
        gap.setPreferredSize(new Dimension(316,100));
        westpanel.add(BorderLayout.SOUTH,listpanel);
        listpanel.setBackground(Color.WHITE);
        listpanel.add(scroll);
        white.add(BorderLayout.CENTER,drop);
        drop.setBackground(Color.white);
        drop.add(BorderLayout.CENTER,grid);
        grid.setBackground(Color.white);
        grid.setLayout(new GridLayout(0,1,5,10));
        grid.add(product);
        grid.add(productt);
        grid.add(price);
        grid.add(pricet);
        grid.add(stock);
        grid.add(stockt);
        grid.add(ADD);
        grid.add(DELETE);
        
        
        ////list
        myliste.setVisibleRowCount(10);
        myliste.setBorder (BorderFactory.createLineBorder(Color.BLACK,3));
        myliste.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
    ////////////////// textfieldss
        pricet.setPreferredSize(new Dimension(200,30));
        pricet.setBackground(Color.WHITE);
        pricet.setForeground(Color.black);
        productt.setPreferredSize(new Dimension(200,30));
        productt.setBackground(Color.WHITE);
        productt.setForeground(Color.black);
        stockt.setPreferredSize(new Dimension(200,30));
        stockt.setBackground(Color.WHITE);
        stockt.setForeground(Color.black);
        
        /////labels
        product.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        product.setForeground(new java.awt.Color(0, 0, 0));
        
        price.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        price.setForeground(new java.awt.Color(0, 0, 0));
        
        stock.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        stockt.setForeground(new java.awt.Color(0, 0, 0));
        
        ///button
            ADD.setPreferredSize(new Dimension(60,25));
            ADD.setBackground(new java.awt.Color(0, 0, 0));
            ADD.setForeground(new java.awt.Color(255, 255, 255));
            ADD.setBorder(new javax.swing.border.MatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
            ADD.addActionListener(this);
            
            DELETE.setPreferredSize(new Dimension(60,25));
            DELETE.setBackground(new java.awt.Color(0, 0, 0));
            DELETE.setForeground(new java.awt.Color(255, 255, 255));
            DELETE.setBorder(new javax.swing.border.MatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
            DELETE.addActionListener(this);
     
            ///button
            back.addActionListener(this);
            ADD.addActionListener(this);
            
            ListenerClass listener = new ListenerClass();
            myliste.addListSelectionListener(listener);
  }
  public void actionPerformed(ActionEvent e)
  {

        if(e.getSource() == back)
        {
            new mainscreen();
            this.dispose();
        }
       if (e.getSource() == ADD)
       {
          
                  if(productt.getText().isEmpty()|| pricet.getText().isEmpty() || stockt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter all the fields");
            }
            else
            {
                try{
                int k = myliste.getSelectedIndex();
                
                runMain.DLM.remove(k);
                addPage.alist.get(k).setName(productt.getText());
                addPage.alist.get(k).setPrice(Double.parseDouble(pricet.getText()));
                addPage.alist.get(k).setStock(Integer.parseInt(stockt.getText()));
                
                runMain.DLM.add(k, addPage.alist.get(k).getName()+"      |     "+addPage.alist.get(k).getPrice()
                            +"£     |      "+addPage.alist.get(k).getStockLevel());
                
                
                
                
                }catch(Exception z)
                {
                    
                }
            }
        
       }
       if(e.getSource() == DELETE)
       {
           try{
                
               int k = myliste.getSelectedIndex();
                
                runMain.DLM.remove(k);
                addPage.alist.remove(k);
            
       }catch(Exception y)
       {
           
       }
       }
  }

    

    private class ListenerClass implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent e) {
            
            
            
            
            
            
            
        }
    }
  
}

