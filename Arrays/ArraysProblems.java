package Arrays;

public class ArraysProblems {
    public boolean check(int[] nums) {
        int breaks = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                breaks++;  
            }  
        }
        if (nums[0] < nums[nums.length-1]) {
            breaks++;
        }
        return breaks <=1;  
    }


    public  void reverse(int arr[], int li, int ri){
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
    public void rotate(int[] nums, int k) {
        k= k % nums.length;
        reverse(nums, 0, nums.length- k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
        display(nums); 
    }
    private void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7};
        new ArraysProblems(). rotate(nums, 3);
        
    }
}
