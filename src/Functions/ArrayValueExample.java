package Functions;

import java.util.Arrays;

public class ArrayValueExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));


   }
   static void change(int[] nums){
        nums[0] =99; //if you make a change to the object via this ref variable then it will change the original object
   }
}
