package Array;

public class SingleDimDynamicArray {
    public static void main(String[] args) {
        //Define array with only size
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;      // Define values manually using index
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int i=0; i<5; i++){
            System.out.println(a[i]);
        }
    }
}
