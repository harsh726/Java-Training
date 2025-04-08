package Array;

public class JaggedArray {
    public static void main(String[] args) {
        int temp = 0;
        // Define multi-dim array with number of rows only and leave columns size empty
        int nums[][] = new int[3][];

        //Define size of columns for each row
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0; i<nums.length; i++){ //Use .length method to store the size of array dynamically/automatically
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = temp;
                temp++;
            }
        }

        //Use enhanced for loop
        for(int n[] : nums){
            for(int h: n){
                System.out.print(h + " ");
            }
            System.out.println();
        }
    }
}
