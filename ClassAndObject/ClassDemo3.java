package ClassAndObject;

class Computer {
    
    //Method with no return type: void()
    public void playMusic(){
        System.out.println("Play Music method called");
    }

    //Method with String return type with perameters with if-else condition
    public String getPen(int cost)
    {
        if(cost >= 10){
            return "Pen";
        }
        return "Cost is lower";
    }
}

public class ClassDemo3 {
    public static void main(String[] args) {
        
        Computer com = new Computer();
        com.playMusic();
        
        //Store the return value of method to the variable and display it
        String str = com.getPen(10);
        System.out.println(str);
    }
}
