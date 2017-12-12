package Composite;

public class Burger extends Decorator
{
    private String description;
    private String[] options;
    
    public Burger ( String des)
    {
       super(des,0.0);
    }
    
    public void settingOptions(String[] variety)
    {
        options = variety;
    }
    
    public double getPrice()
    {
        double mon = 0.0;
        for(String opt:options)
        {
            if(opt.equals("1/3 lb"))
            {
                mon += 9.50;
            }
            else if(opt.equals("2/3 lb"))
            {
                    mon += 11.50;
            }
            else if(opt.equals("On A Bun"))
            {
                mon += 1.00;
            }
        }
        return mon;
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
