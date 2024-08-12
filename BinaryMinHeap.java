
public class BinaryMinHeap {

    private int[] array;
    private int currentSize;

    // DO NOT MODIFY
    public BinaryMinHeap() {
        array = new int[12];
        currentSize = 0;
    }

    // DO NOT MODIFY
    public BinaryMinHeap(int[] items) {
        currentSize = items.length;
        array = new int[(currentSize + 2)]; // just enough buffer
        int i = 1;
        for (int item : items) {
            array[i++] = item;
        }
        buildHeap();
    }

    // DO NOT MODIFY
    private void buildHeap() {
        for (int i = currentSize / 2; i > 0; i--) {
            percolateDown(i);
        }
    }

    // DO NOT MODIFY
    private void enlargeArray(int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // DO NOT MODIFY
    public void insert(int x) {
        if (currentSize == array.length - 1) {
            enlargeArray(array.length * 2 + 1);
        }

        // Percolate Up
        int hole = ++currentSize;
        for (array[0] = x; x < array[hole / 2]; hole = hole / 2) {
            array[hole] = array[hole / 2];
        }
        array[hole] = x;
    }

    // DO NOT MODIFY
    public int deleteMin() {
        int returnValue = array[1];
        //moving the last one to the first; breaking the heap
        array[1] = array[currentSize];
        --currentSize;
        percolateDown(1);
        return returnValue;
    }

    // DO NOT MODIFY
    private void percolateDown(int hole) {
        int child;
        int tmp = array[hole];
        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;
            if (child != currentSize && array[child + 1] < array[child]) {
                child++;
            }
            if (array[child] < tmp) {
                array[hole] = array[child];
            } else {
                break;
            }
        }
        array[hole] = tmp;
    }

    // DO NOT MODIFY
    public static int findKthSmallest(int[] array, int k) {
        BinaryMinHeap myHeap = new BinaryMinHeap(array);
        int returnValue = -1;
        for (int i = 0; i < k; i++) {
            returnValue = myHeap.deleteMin();
        }
        return returnValue;
    }

    public static int findKthLargest(int[] array, int k) {
        BinaryMinHeap myHeap = new BinaryMinHeap(); // DO NOT MODIFY THIS LINE
        // WRITE CODE HERE
        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if (myHeap.currentSize < k) {
                myHeap.insert(num);
            } else if (num > myHeap.array[1]) {
                myHeap.deleteMin();
                myHeap.insert(num);
            }
        }

        return myHeap.array[1]; // modify to the correct value
    }

    public static void main(String[] args) {
        System.out.println("Find K-th Smallest: ");
        int[] kthInput = {10, 50, 40, 75, 60, 65, 45};
        System.out.println("2nd Smallest: " + findKthSmallest(kthInput, 2));
        System.out.println("4th Smallest: " + findKthSmallest(kthInput, 4));

        System.out.println("2nd Largest: " + findKthLargest(kthInput, 2)); // must print 65
        System.out.println("4th Largest: " + findKthLargest(kthInput, 4)); // must print 50
    }
}
