
import java.util.Arrays;

public class RandomNumberSorter {

    public static class RandomNumber implements Comparable<RandomNumber> {

        private int number;

        // DO NOT MODIFY
        public RandomNumber() {
            number = (int) ((Math.random()) * 10) + 1;
        }

        // DO NOT MODIFY
        public int getNumber() {
            return number;
        }

        // Update the code here
        public int compareTo(RandomNumber o) {
            // WRITE CODE HERE

            return Integer.compare(this.number, o.number); // Update the return value per your algorithm
        }
    }

    // Update the code here
    public static void quickSorter(RandomNumber[] nums) {
        quickSorter(nums, 0, nums.length - 1);
    }

    private static void quickSorter(RandomNumber[] nums, int low, int high) {
        if (low < high) {
            int pivot = partition(nums, low, high);
            quickSorter(nums, low, pivot - 1);
            quickSorter(nums, pivot + 1, high);
        }
    }

    private static int partition(RandomNumber[] nums, int low, int high) {
        RandomNumber pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j].compareTo(pivot) <= 0) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;
    }

    private static void swap(RandomNumber[] nums, int i, int j) {
        RandomNumber temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // DO NOT MODIFY
    private static void printArray(RandomNumber[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i].getNumber() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int NUM_GENERATED = 10;

        // DO NOT MODIFY BELOW THIS LINE
        RandomNumber[] nums1 = new RandomNumber[NUM_GENERATED];
        RandomNumber[] nums2 = new RandomNumber[NUM_GENERATED];

        for (int i = 0; i < NUM_GENERATED; i++) {
            RandomNumber r = new RandomNumber();
            nums1[i] = r;
            nums2[i] = r;
        }

        // PRINT INITIAL ARRAY
        printArray(nums1);

        // TEST YOUR QUICKSORT IMPLEMENTATION
        quickSorter(nums1);
        printArray(nums1);

        // TEST YOUR COMPARATOR
        Arrays.sort(nums2);
        printArray(nums2);
    }
}
