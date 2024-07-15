package Search;

public class BinarySearch {
    public static int searchStart(int[] nums, int target) {
        int n = nums.length;
        int f = 0;
        int l = n-1;
        int sol = -1;
        while (f<=l) {
            int mid = f+((l-f)/2);
            if (nums[mid]==target) {
                sol = mid;
                l = mid-1;
            }else if (nums[mid] > target) {
                l = mid-1;
            } else {
                f = mid +1;
            }
        }
        return sol;
    }
    public static int searchEnd(int[] nums, int target) {
        int n = nums.length;
        int f = 0;
        int l = n-1;
        int sol = -1;
        while (f<=l) {
            int mid = f+((l-f)/2);
            if (nums[mid]==target) {
                sol = mid;
                f = mid +1;
            }else if (nums[mid] > target) {
                l = mid-1;
            } else {
                f = mid +1;
            }
        }
        return sol;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] sol = new int[2];
        sol[0] = searchStart(nums, target);
        System.out.println(sol[0]);
        sol[1] = searchEnd(nums, target);
        System.out.println(sol[1]);
        return sol;
    }

    public static void main(String[] args) {
        int[] nums2= {5,7,7,8,8,8,10};
        // display(nums2);
        System.out.println(searchRange(nums2, 8));;
    }
}
