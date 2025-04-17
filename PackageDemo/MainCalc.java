package PackageDemo;
/*import PackageDemo.BasicCalc.Calc;  // Import package BasicCalc and access the method of Calc class
import PackageDemo.AdvCalc.AdvCalc;; // Import package AdvCalc and access the method of AdvCalc class*/
import PackageDemo.BasicCalc.*;
import PackageDemo.AdvCalc.*;

public class MainCalc {
    public static void main(String[] args) {
        Calc c1 = new Calc(); //Create an object of Calc class
        c1.show(); // Call the show() method from Calc class

        AdvCalc advc = new AdvCalc(); //Create an object of AdvCalc class
        advc.show(); // Call the show() method from AdvCalc class
    }
}
