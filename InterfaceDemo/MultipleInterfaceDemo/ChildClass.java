package InterfaceDemo.MultipleInterfaceDemo;

public class ChildClass implements ChildInterface{

    @Override
    public void childShow() {
        System.out.println("Call method of child interface");
    }

    @Override
    public void parentShow() {
        System.out.println("Call method of parent interface"); 
    }
    
}
