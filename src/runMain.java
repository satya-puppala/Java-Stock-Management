
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class runMain 
{
    static DefaultListModel DLM = new DefaultListModel();
    
    public static void main(String[] args)
    {   
       /*try{ 
                    FileInputStream fin = new FileInputStream("file.dat");
                    ObjectInputStream ois = new ObjectInputStream(fin);
                    addPage.alist = (ArrayList) ois.readObject();
                    ois.close();
                    fin.close();
                    
       }catch(ClassNotFoundException e) {
           System.out.println("class excpetion");
       }catch(IOException e) {
           System.out.println("io excpetion");
       }catch(Exception e)
       {
           System.out.println("excpetion");
       }*/
        
        addPage.alist.add(new Product("iPhone 6",400,12));
        addPage.alist.add(new Product("Macbook Pro 2013",800,4));
        addPage.alist.add(new Product("iPhone X",1200,1));
        addPage.alist.add(new Product("iMac 2017",1400,6));
        
        for(int i = 0; i < addPage.alist.size(); i++) {
            DLM.addElement(addPage.alist.get(i).getName()+"      |     "+addPage.alist.get(i).getPrice()
                            +"£     |      "+addPage.alist.get(i).getStockLevel());
        }
        
        
        
        
        
        
             new login();  
    } 
}
