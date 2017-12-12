package Composite;




public class PremiumToppings extends Decorator
{
  private String description;
  private Toppings topping;
  private String[] options;   
   
   public PremiumToppings ( String des)
   {
       super(des,0.0);
   }
   
   public double getPrice()
   {
       double mon = topping.getPrice();
       if(options.length > 0)
       {
           return (mon + (options.length * 1.50));
       }
       else
       {
           return mon + 0.0;
       }
   }
   
   public void settingOptions(String variety[])
   {
       options = variety;
   }

   public void applyDecorator(Toppings t)
   {
        topping= t;
   }
   
   public void getOrderDetail()
   {
       int i=0;
       for(String opt:options)
       {
           System.out.print(opt);
           if(i < options.length-1 )
           {
               System.out.print(" + ");
           }
           i++;
       }
       System.out.println(" ");
   }
}

