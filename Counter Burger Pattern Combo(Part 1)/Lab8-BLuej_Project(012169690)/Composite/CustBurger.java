package Composite;



import java.util.ArrayList;

public class CustBurger extends Composite
{
   private Decorator decorator;
   private String description;
   private ArrayList<Component> component = new ArrayList<Component>()  ;
   
   public CustBurger ( String d )
   {
       super(d) ;
       description = d;
   }

   public void setDecorator(Decorator bud)
   {
       decorator = bud;
   }
   
   
   public void getOrderDetail() {
       System.out.print( description+" " );
       double total = decorator.getPrice();
       System.out.println(total);
       for (Component obj  : component)
       {
           obj.getOrderDetail();
       }
       
   }

   public void addChild(Component c) {
       component.add( c ) ;
   }
    
   public void removeChild(Component c) {
       component.remove(c) ;
   }
    
   public Component getChild(int i) {
       return component.get( i ) ;
   }
}

