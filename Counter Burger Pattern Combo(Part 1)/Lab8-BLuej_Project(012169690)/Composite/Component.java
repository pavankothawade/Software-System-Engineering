package Composite;

public interface Component {

    void getOrderDetail() ;
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);

}
