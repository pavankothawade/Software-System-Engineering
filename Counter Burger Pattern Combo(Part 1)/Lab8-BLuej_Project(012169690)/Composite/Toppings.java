package Composite;


public class Toppings extends Decorator
{
   private String description;
   private Cheese ch;
   private String[] options;
    
    public Toppings ( String des)
    {
        super(des,0.0);
    }
    
    public double getPrice()
    {
        double mon = ch.getPrice();
        if(options.length > 4)
        {
            return (mon + (options.length - 4)*0.75);
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

    public void applyDecorator(Cheese cheese)
    {
        ch = cheese;
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
        System.out.println("");
    }
    
    
}

