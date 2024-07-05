package Arrays;

import java.util.ArrayList;

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
    private static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println();
    }

    public static void moveZeroes(int[] nums) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r]!=0) {
                int temp = nums[r]; 
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
     }
     public static int removeElement(int[] nums, int val) {
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r]!=val) {
                int temp = nums[r]; 
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
        return l;
     }

     public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> res = new  ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i<n && j<m) {

            
        }


        return res;
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int l = 0;
        int r = 0;
        while (l < nums.length) {
            if (nums[l]==0 || l==nums.length-1) {
                int length = l-r;
                if (length>max) {
                    max = length;
                }
                r = l;
            } 
            l++;
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        int[] nums= {1,0,1,1,0,1};
        // int[] nums2= {1, 1, 2, 3, 4};
        
        findMaxConsecutiveOnes(nums);
        
    }
}
