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

    // static int count(int[] arr, int n, int x) {
    //     int low = 0;
    //     int high = n-1;
    //     int index = -1;
    //     while(high>=low){
    //         int mid = (high+low) / 2;
    //         if(arr[mid] == x) index = mid ;
    //         else if(arr[mid] > x) high = mid - 1;
    //         else low = mid + 1;
    //     }
    //     System.out.println(index);
    //      low = index - 1;
    //      high = index + 1;
    //     while ((high < n && low < 0) ) {
            
    //     }
    
        
    
    // }
    public static int firstBadVersion(int n) {
        boolean[] nums2= {true, false};
        int low = 0;
        int high = n-1;
        int mid = -1;
        while (low<= high) {
            mid = (high+low) / 2;
            if (nums2[mid]) {
                low = mid +1;
            } else {
                high = mid-1;
            }
            
        }
        return  mid;
    }
    public static void main(String[] args) {
        boolean[] nums2= {false, true,  false};
        // display(nums2);
        System.out.println(firstBadVersion(nums2.length));;
    }
}
