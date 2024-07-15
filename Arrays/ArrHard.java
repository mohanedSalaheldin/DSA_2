package Arrays;

import java.util.*;

public class ArrHard {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> maj = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i < n ; i++){
            int pre = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], pre+1);
        }
        // System.out.println(mpp);
        // System.out.println(nums.length/3);
        for (Map.Entry<Integer, Integer> ent : mpp.entrySet()) {
           
            if (ent.getValue() >= n/3) {
                maj.add(ent.getKey()) ;
                
            }
        }
        // System.out.println(maj);
        return maj;
    }

    static int findFloor(long arr[], int n, long x) {
        int f = 0;
        int l = n-1;
        int cail =-1;
        while(f<=l){
            int mid =(l+f)/2 ;
            if(arr[mid] == x){
                return mid;
            }else if (arr[mid] < x) {
                
                f = mid + 1;
            }else{
                cail = mid;
                l = mid - 1;
            }
        }
            return cail; 
    }
    public static void main(String[] args) {
        long[] arr = {1, 5, 8, 15, 19};
        System.out.println(  findFloor(arr, arr.length,  5));

    }
}
