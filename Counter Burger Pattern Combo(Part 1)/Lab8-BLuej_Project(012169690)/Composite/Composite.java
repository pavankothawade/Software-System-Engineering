package Composite;



import java.util.ArrayList;

public class Composite implements Component {

   private ArrayList<Component> component = new ArrayList<Component>()  ;
   private String description ;
   
   public Composite ( String d )
   {
       description = d ;
   }

   public void getOrderDetail() {
       System.out.println( description );
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

