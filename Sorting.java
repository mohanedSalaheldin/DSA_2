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

    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " => ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println("Hello world");
        int[] lis= {-60, 0, 1, 90, 4};
        insetionSort(lis);
    }
}
