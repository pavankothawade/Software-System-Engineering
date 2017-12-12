package Composite;




public class Sauces extends Decorator
{
  private String description;
  private PremiumToppings ptop;
  private String[] options;
   
   public Sauces ( String des)
   {
       super(des,0.0);
   }
   
   public double getPrice()
   {
       double mon = ptop.getPrice();
       if(options.length > 1)
       {
           return mon + (options.length - 1) * 0.75;
       }
       else
       {
           return mon + 0.0;
       }
   }
   
   public void settingOptions(String[] variety)
   {
       options = variety;
   }

   public void applyDecorator(PremiumToppings p)
   {
       ptop = p;
   }
   
   public void getOrderDetail()
   {
       int i=0;
       for(String opt:options)
       {   System.out.print(opt);
           if(i < options.length-1 )
           {
               System.out.print(" + ");
           }
           i++;
       }
       System.out.println("");
   }
}

