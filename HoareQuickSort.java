import java.util.Stack;

public class HoareQuickSort {

  // Hoare's partitioning algorithm
  public int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low - 1;
    int j = high + 1;

    while (true) {
      // find leftmost element greater than
      // or equal to pivot
      do {
        i++;
      } while (arr[i] < pivot);

      // find rightmost element smaller than
      // or equal to pivot
      do {
        j--;
      } while (arr[j] > pivot);

      // if two pointers met
      if (i >= j) {
        return j;
      }

      // swap arr[i] and arr[j]
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }

  public void quicksort(int[] arr, int low, int high) {
    // create a stack to store subarrays
    Stack<Integer> stack = new Stack<>();
    // push initial values of low and high to stack
    stack.push(low);
    stack.push(high);

    // keep popping from stack while is not empty
    while (!stack.isEmpty()) {
      // pop high and low
      high = stack.pop();
      low = stack.pop();

      // set pivot element at its correct position
      // in sorted array
      int p = partition(arr, low, high);

      // If there are elements on left side of pivot,
      // then push left side to stack
      if (p > low) {
        stack.push(low);
        stack.push(p);
      }

      // If there are elements on right side of pivot,
      // then push right side to stack
      if (p + 1 < high) {
        stack.push(p + 1);
        stack.push(high);
      }
    }
  }

  public void run() {
    Arrays arr = new Arrays();

    double[] timeArray = new double[18];

    System.out.println();
    System.out.println("****** >>>>>> Hoare Quick Sort Running <<<<<< ******");
    System.out.println();

    timeArray[0] = calculateTime(arr.createRandom(10));
    timeArray[1] = calculateTime(arr.createRandom(100));
    timeArray[2] = calculateTime(arr.createRandom(1000));
    timeArray[3] = calculateTime(arr.createRandom(10000));
    timeArray[4] = calculateTime(arr.createRandom(100000));
    timeArray[5] = calculateTime(arr.createRandom(1000000));

    timeArray[6] = calculateTime(arr.createIncremental(10));
    timeArray[7] = calculateTime(arr.createIncremental(100));
    timeArray[8] = calculateTime(arr.createIncremental(1000));
    timeArray[9] = calculateTime(arr.createIncremental(10000));
    timeArray[10] = calculateTime(arr.createIncremental(100000));
    timeArray[11] = calculateTime(arr.createIncremental(1000000));

    timeArray[12] = calculateTime(arr.createDecremental(10));
    timeArray[13] = calculateTime(arr.createDecremental(100));
    timeArray[14] = calculateTime(arr.createDecremental(1000));
    timeArray[15] = calculateTime(arr.createDecremental(10000));
    timeArray[16] = calculateTime(arr.createDecremental(100000));
    timeArray[17] = calculateTime(arr.createDecremental(1000000));

    System.out.println("Random array size >> 10: " + (timeArray[0]) + " second");
    System.out.println("Random array size >> 10^2: " + (timeArray[1]) + " second");
    System.out.println("Random array size >> 10^3: " + (timeArray[2]) + " second");
    System.out.println("Random array size >> 10^4: " + (timeArray[3]) + " second");
    System.out.println("Random array size >> 10^5: " + (timeArray[4]) + " second");
    System.out.println("Random array size >> 10^6: " + (timeArray[5]) + " second");
    System.out.println();

    System.out.println("Incremental array size >> 10: " + (timeArray[6]) + " second");
    System.out.println("Incremental array size >> 10^2: " + (timeArray[7]) + " second");
    System.out.println("Incremental array size >> 10^3: " + (timeArray[8]) + " second");
    System.out.println("Incremental array size >> 10^4: " + (timeArray[9]) + " second");
    System.out.println("Incremental array size >> 10^5: " + (timeArray[10]) + " second");
    System.out.println("Incremental array size >> 10^6: " + (timeArray[11]) + " second");
    System.out.println();

    System.out.println("Decremental array size >> 10: " + (timeArray[12]) + " second");
    System.out.println("Decremental array size >> 10^2: " + (timeArray[13]) + " second");
    System.out.println("Decremental array size >> 10^3: " + (timeArray[14]) + " second");
    System.out.println("Decremental array size >> 10^4: " + (timeArray[15]) + " second");
    System.out.println("Decremental array size >> 10^5: " + (timeArray[16]) + " second");
    System.out.println("Decremental array size >> 10^6: " + (timeArray[17]) + " second");

    System.out.println();
    System.out.println("****** >>>>>> Hoare Quick Sort Completed <<<<<< ******");
    System.out.println();

  }

  private double calculateTime(int[] runningArray) {
    double startTime = System.currentTimeMillis();
    this.quicksort(runningArray, 0, runningArray.length - 1);
    double endTime = System.currentTimeMillis();
    return ((endTime - startTime) / 1000.0);

  }
}