import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class list extends JFrame implements ActionListener
{
      //textfields
    JTextField productt = new JTextField();
    JTextField pricet = new JTextField();
    JTextField stockt = new JTextField();
    
    DefaultListModel<Product> DLM = new DefaultListModel<>();
    JList <Product> mylist = new JList<>(DLM);
    JScrollPane pane = new JScrollPane(mylist);
    
    JButton kic = new JButton("ADD");
    
    
 public list()
 {
     
     
     
     JPanel panel = new JPanel();
     
    
     
        setSize(832,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        add(BorderLayout.NORTH,panel);
        panel.setSize(new Dimension(600,600));
        panel.add(pane);
        panel.add(productt);
        panel.add(pricet);
        panel.add(stockt);
        panel.add(kic);
        
        
        
        pricet.setPreferredSize(new Dimension(100,30));
        pricet.setBackground(Color.WHITE);
        pricet.setForeground(Color.black);
        productt.setPreferredSize(new Dimension(100,30));
        productt.setBackground(Color.WHITE);
        productt.setForeground(Color.black);
        stockt.setPreferredSize(new Dimension(100,30));
        stockt.setBackground(Color.WHITE);
        stockt.setForeground(Color.black);
        
        kic.setPreferredSize(new Dimension(60,25));
        kic.addActionListener(this);
        mylist.setVisibleRowCount(3);
 }
  public void actionPerformed(ActionEvent e)
     {
     
     Product p = new Product(productt.getText(),Double.parseDouble(pricet.getText()),Integer.parseInt(stockt.getText()));

     DLM.addElement(p);
     }
  public static void main(String [] args)
  {
      new list();
  }
}
