import java.util.Scanner;

public class BinarySearch {
    static int[] list = {2, 6, 23, 30, 42, 49, 52, 58, 63, 71, 85, 89, 92, 98};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key == list[mid])
                return mid;
            else if (key > list[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number you want to find: ");
        Scanner sc = new Scanner(System.in);
        int searchNumber = sc.nextInt();
        int result = binarySearch(list, searchNumber);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
