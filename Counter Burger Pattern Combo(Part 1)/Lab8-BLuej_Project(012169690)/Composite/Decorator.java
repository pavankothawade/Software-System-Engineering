package Composite;




import java.text.DecimalFormat;

public abstract class Decorator extends Leaf implements CostDecorator
{
   private String description ;
   private double price ;

   public Decorator ( String d, double p )
   {
       super(d,p);
   }
   
   public void getOrderDetail()
   {
       
   }

   public void addChild(Component c) {
     
   }

   public void removeChild(Component c) {
     
   }

   public Component getChild(int i) {
       return null;
   }
   
   public abstract double getPrice();
   
}
