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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " => ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println("Hello world");
        int[] lis= {-60, 0, 50, 30, 10, 20};
        selectionSort(lis);
    }
}
