package Composite;

import java.lang.String;

public class Cheese extends Decorator
{
    private String description;
    private Burger burger;
    private String[] options;
    
    public Cheese ( String des)
    {
        super(des,0.0);
    }
    public double getPrice()
    {
        double mon = burger.getPrice();
        if(options.length > 1)
            return mon+options.length -1;
        else
            return mon+0.0;
    }
    
    public void settingOptions(String[] variety)
    {
        options = variety;
    }

    public void applyDecorator(Burger b)
    {
        burger = b;
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

