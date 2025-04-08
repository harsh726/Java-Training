/*
 *      Perform  Simple tasks with an Array
 */
package Array;

public class SingleDimSimpleStaticArray {
    public static void main(String[] args) {
        //Array with value
        int a[] = {1, 2, 3, 4};

        //Define array with size only without values
        int b[] = new int[4];
        //Add values to array manually
        b[0] = 0;
        b[1] = 1;
        b[2] = 2;
        b[3] = 3;
        //Display values manually
        System.out.println("b[0]: " + b[0] + "\nb[1]: " + b[1] + "\nb[2]: " + b[2] + "\nb[3]: " + b[3]);

        //Display individual values using index
        System.out.println("Index Value: " + a[2]);

        //Update the value manually with index
        a[2] = 15;
        System.out.println("Index Value: " + a[2]);
    }
}
