/*
 *      This code contains two-dimnsional. array as well as multi-dimnsional array.
 */
package Array;

public class TwoDimArray {
    public static void main(String[] args) {
        //Define 2-dim array and manually assign values: 2 X 2
        int a[][] = {{1,2}, {4,5}};

        //Define multi-dim array and manually assign values: 3 X 4
        int b[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        //Define 2-dim array with size: 2 X 2
        int c[][] = new int[2][2];

        //Define multi-dim array with size: 2 X 2
        int d[][] = new int[3][4];

        //Store values in multi-dom array
        int num = 0;
        for(int i=0; i<3; i++){  //Rows
            for(int j=0; j<4; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
