import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
public class addPage extends JFrame implements ActionListener {
     //panels
    JPanel black = new JPanel();
    JPanel white = new JPanel();
    JPanel blackin1 = new JPanel();
    JPanel blackin2 = new JPanel();
    JPanel grid = new JPanel();
    JPanel drop = new JPanel();
    JPanel westpanel = new JPanel();
    JPanel listpanel = new JPanel();
    JPanel lpanel = new JPanel();
    JPanel gap = new JPanel();
    
    //labels 
    JLabel main = new JLabel();
    JLabel product = new JLabel("Product Name:");
    JLabel price = new JLabel("Product Price:");
    JLabel stock = new JLabel("Product Stock:");
    JLabel labeln = new JLabel(" Name:");
    JLabel labelp = new JLabel(" Price:");
    JLabel labels = new JLabel(" Stock:");
    
    
    //buttons
    JButton back = new JButton();
    JButton create = new JButton("ADD");
   
    
    //JList
    static ArrayList<Product> alist = new ArrayList<Product>();
    
    JList <Product> mylist = new JList<Product>(runMain.DLM);
    JScrollPane scroll = new JScrollPane(mylist);
    
    
    //textfields
    JTextField productt = new JTextField();
    JTextField pricet = new JTextField();
    JTextField stockt = new JTextField();
    
  
   
    
 
    public addPage()
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
        main.setIcon(new javax.swing.ImageIcon("images\\icons8-plus-math-48.png"));
        main.setText("Add New Product");  
        
        //bottom layouts
        white.add(BorderLayout.WEST,westpanel);
        westpanel.setPreferredSize(new Dimension(316,419));
        westpanel.setBackground(Color.white);
        westpanel.add(BorderLayout.NORTH,lpanel);
        lpanel.setBackground(Color.white);
        lpanel.setPreferredSize(new Dimension(316,100));
        westpanel.add(BorderLayout.CENTER,listpanel);
        listpanel.setBackground(Color.WHITE);
        listpanel.add(scroll);
        white.add(BorderLayout.EAST,drop);
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
        grid.add(create);
        
        
        ////list
        mylist.setVisibleRowCount(10);
        mylist.setBorder (BorderFactory.createLineBorder(Color.BLACK,3));
        
        
        
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
        
        labeln.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        labeln.setForeground(new java.awt.Color(0, 0, 0));
        
        labelp.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        labelp.setForeground(new java.awt.Color(0, 0, 0));
        
        labels.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        labels.setForeground(new java.awt.Color(0, 0, 0));
        
        ///button
            create.setPreferredSize(new Dimension(60,25));
            create.setBackground(new java.awt.Color(0, 0, 0));
            create.setForeground(new java.awt.Color(255, 255, 255));
            create.setBorder(new javax.swing.border.MatteBorder(1, 1, 1, 1, new java.awt.Color(0,0,0)));
     
            ///button
            back.addActionListener(this);
            create.addActionListener(this);
            
            
    }
   
     public void actionPerformed  (ActionEvent e)
    {
        if(e.getSource()==back)
        {
            new mainscreen();
            this.dispose();
        }
        if(e.getSource()==create)
        {
            if(productt.getText().isEmpty()|| pricet.getText().isEmpty() || stockt.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter all the fields");
            }
            else
            {
                 /* try{*/
         Product p = new Product(productt.getText(),Double.parseDouble
        (pricet.getText()),Integer.parseInt(stockt.getText())); 
                   //adding product to arraylist
                    alist.add(p);                
                    int j = alist.indexOf(p);
                    runMain.DLM.addElement(alist.get(j).getName()+"      |     "+alist.get(j).getPrice()
                            +"£     |      "+alist.get(j).getStockLevel() );
                    
                    
               
                   /* FileOutputStream fout = new FileOutputStream("file.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fout);
                    oos.writeObject(addPage.alist);
                    
                   
                    oos.close();
                    fout.close();*/
                    
                    
                    
                    
                    JOptionPane.showMessageDialog(null,"product added sucessfully");
                    
                   
                    
                    
                    
              /* }catch(Exception ex)
                    {
                    JOptionPane.showMessageDialog(null,"please enter valid data");
                    }*/
                productt.setText("");
                pricet.setText("");
                stockt.setText("");
                
                    
            }
        }
    }
}