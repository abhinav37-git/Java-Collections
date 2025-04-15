// import java.util.Scanner;

class Bsearch {

    public static int searchArray(int[] arr, int target) {
        int n = arr.length;

        int start = 0;
        int end = arr.length - 1;

        //if start <= end, then search
        while (start <= end) {
            // int mid = start + (end - start) / 2;
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int target = sc.nextInt();
        //
        int[] arr = { 10, 15, 0, -1, 22, -10, 21 };
        int target = 21;

        int ans = searchArray(arr, target);
        System.out.println(ans);
    }
}
