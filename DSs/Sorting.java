package DSs;
import java.util.ArrayList;

public class Sorting {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[min] < arr[j] ) {
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;

                }
            }
           
        }
        display(arr);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;// 6
        boolean isSwapped = false;
        for (int i = 0; i < n-1; i++) { // 0 - 5
            for (int j = 0; j < n-i-1; j++) { // 0 - 4
                if (arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                System.out.println("Sorted");
                break;
            }
        }
        display(arr);
    }
    public static void insetionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n-1; i++) { 
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j - 1;
            }
            
        }
        display(arr);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        
        int left = low;
        int right = mid +1 ;
        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high ) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int j = low; j <= high; j++) {
            arr[j] = temp.get(j - low);
        }
    }

    public static void mergeSort(int[] arr, int low,int high) {
        if (low >= high) {
            return ;
        }
        int mid  = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
        // display(arr);
    }

    public static void quickSort(int[] arr,int left,int right) {
        if (left>= right) {
            return ;
        }
        int mid = left + (right - left)/2;
        int piv = arr[mid];
        int l = left;
        int r = right;
        while (l<=r) {
            while (arr[l] < piv) {
                l++;
            }
            while (arr[r] > piv) {
                r--;
            }
            if (l <= r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            if (left < r) {
                quickSort(arr, left, r);
            }
            if (right > l) {
                quickSort(arr, l, right);
            }
        }
    }

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " => ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println("Hello world");
        int[] lis= {9, 4, 7, 6, 3, 1, 5};
        quickSort(lis, 0, lis.length -1);
        display(lis);
    }
}
