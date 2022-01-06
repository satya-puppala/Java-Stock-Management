public class Product
{
  private String name;
  private int stockLevel;
  private double price;

public Product(String name,double price,int stockLevel)
{
this.name = name;
this.stockLevel = stockLevel;
this.price = price;
}
public double reStock(int restock)
{
    return restock = stockLevel + stockLevel;
}
public double sell(int itemsSold)
{
if(itemsSold <= stockLevel)
{
this.stockLevel = stockLevel - itemsSold;
double totalprice = price * itemsSold;
return totalprice;
}
else
{
return 0.0;
}
}
public String setName(String namein)
{
return name = namein;
}
public double setPrice(double pricein)
{
return price = pricein;
}
public int setStock(int stockin)
{
return stockLevel = stockin;
}

public String getName()
{
return name;
}
public int getStockLevel()
{
return stockLevel;
}
public double getPrice()
{
return price;
}

}