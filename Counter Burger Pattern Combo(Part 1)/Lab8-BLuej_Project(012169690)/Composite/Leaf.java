package Composite;


import java.text.DecimalFormat;


public class Leaf implements Component {

   private String description ;
   private Double price ;

   public Leaf ( String des, Double ps )
   {
       description = des ;
       price = ps ;
   }
   
   public void getOrderDetail() {
       DecimalFormat fmt = new DecimalFormat("0.00");
       System.out.println( description+" "+fmt.format(price)) ;
       
   }

   public void addChild(Component c) {
       // no implementation
   }

   public void removeChild(Component c) {
       // no implementation
   }

   public Component getChild(int i) {
       // no implementation
       return null ;
   }
   

    
}

