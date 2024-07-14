package Search;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int f = 0;
        int l = n-1;
        while (f<=l) {
            int mid = f+((l-f)/2);
            if (nums[mid]==target) {
                return mid;
            }else if (nums[mid] > target) {
                l = mid-1;
            } else {
                f = mid +1;
            }
        }
        return -1;
    }

    

    public static void main(String[] args) {
        int[] nums2= {-1,0,3,5,9,12};
        // display(nums2);
        System.out.println(search(nums2, 9));;
    }
}
