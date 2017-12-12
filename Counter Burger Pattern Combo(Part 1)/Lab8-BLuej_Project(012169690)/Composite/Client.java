
package Composite;
public class Client {

    public static void runTest()
    {
        Component comp = BuildYourOrder.getOrder() ;
        comp.getOrderDetail();

    }
    public static void main( String [] args )
    {
        Client c = new Client() ;
        c.runTest() ;
    }  
}
 
