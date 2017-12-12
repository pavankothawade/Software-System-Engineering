
package Composite;
public class BuildYourOrder {

    public static Component getOrder()
    {
        Composite compOrder = new Composite( "Order :" ) ;
        compOrder.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        compOrder.addChild(new Leaf("The Purist", 8.00 ));
        
        CustBurger custBurger = new CustBurger( "Build Your Own Burger 12.00" ) ;
        Burger bug = new Burger("Different Burger Options");
        String burgers[] = {"Beef","1/3 lb.","On A Bun"};
        bug.settingOptions(burgers);
        
        Cheese ch = new Cheese("Different Cheese option");
        String cheeses[] = {"Danish blue cheese","Horseradish Cheddar"};
        ch.settingOptions(cheeses);
        ch.applyDecorator(bug);
        
        Toppings toppings = new Toppings("Different Toppings options");
        String top[] = {"Bermuda Red Onion","Black Olives","Carrot Strings","Coleslaw"};
        toppings.settingOptions(top);
        toppings.applyDecorator(ch);
        
        PremiumToppings premToppings = new PremiumToppings("Different Premium options");
        String premTop[] = {"Applewood Smoked Bacon"};
        premToppings.settingOptions(premTop);
        premToppings.applyDecorator(toppings);
        
        Sauces sauces = new Sauces("Different Premium sauces");
        String s[]={"Appricot Sauce"};
        sauces.settingOptions(s);
        sauces.applyDecorator(premToppings);
        
        custBurger.setDecorator(sauces);
        custBurger.addChild(bug); 
        custBurger.addChild(ch); 
        custBurger.addChild(toppings); 
        custBurger.addChild(premToppings); 
        custBurger.addChild(sauces); 
        compOrder.addChild(custBurger);
        return compOrder ;
    }

}


