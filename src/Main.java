
class Solution {
    //Function that grabs the even values from the array and displays them.
    public void evenArr(int[] arr){
        for(int i = 0; i < arr.length; i++){ //Loops through the entire array
            if(arr[i] % 2 == 0){ //Determines if the value is even
                System.out.println(arr[i]);
            }
        }
    }

}

public class Main {

    public static void main(String[] args){

        //Creates an object from the solution class
            Solution solution = new Solution();

            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            //calls the even array function from the solution class passing in an array as the parameter
            solution.evenArr(arr);
    }
}