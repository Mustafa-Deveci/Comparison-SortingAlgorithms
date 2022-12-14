public class HeapSort {

	public void sort(int runningArray[]) {
		int N = runningArray.length;

		// Build heap (rearrange array)
		for (int i = N / 2 - 1; i >= 0; i--)
			heapify(runningArray, N, i);

		// One by one extract an element from heap
		for (int i = N - 1; i > 0; i--) {
			// Move current root to end
			int temp = runningArray[0];
			runningArray[0] = runningArray[i];
			runningArray[i] = temp;

			// call max heapify on the reduced heap
			heapify(runningArray, i, 0);
		}
	}

	// To heapify a subtree rooted array node i which is
	// an index in arr[]. n is size of heap
	void heapify(int runningArray[], int N, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < N && runningArray[l] > runningArray[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < N && runningArray[r] > runningArray[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			int swap = runningArray[i];
			runningArray[i] = runningArray[largest];
			runningArray[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(runningArray, N, largest);
		}
	}

	public void run() {
		Arrays arr = new Arrays();

		double[] timeArray = new double[18];
		
		System.out.println();
		System.out.println("****** >>>>>> Heap Sort Running <<<<<< ******");
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

		System.out.println("Random array size >> 10  : " + (timeArray[0]) + " second");
		System.out.println("Random array size >> 10^2: " + (timeArray[1]) + " second");
		System.out.println("Random array size >> 10^3: " + (timeArray[2]) + " second");
		System.out.println("Random array size >> 10^4: " + (timeArray[3]) + " second");
		System.out.println("Random array size >> 10^5: " + (timeArray[4]) + " second");
		System.out.println("Random array size >> 10^6: " + (timeArray[5]) + " second");
		System.out.println();

		System.out.println("Incremental array size >> 10  : " + (timeArray[6]) + " second");
		System.out.println("Incremental array size >> 10^2: " + (timeArray[7]) + " second");
		System.out.println("Incremental array size >> 10^3: " + (timeArray[8]) + " second");
		System.out.println("Incremental array size >> 10^4: " + (timeArray[9]) + " second");
		System.out.println("Incremental array size >> 10^5: " + (timeArray[10]) + " second");
		System.out.println("Incremental array size >> 10^6: " + (timeArray[11]) + " second");
		System.out.println();

		System.out.println("Decremental array size >> 10  : " + (timeArray[12]) + " second");
		System.out.println("Decremental array size >> 10^2: " + (timeArray[13]) + " second");
		System.out.println("Decremental array size >> 10^3: " + (timeArray[14]) + " second");
		System.out.println("Decremental array size >> 10^4: " + (timeArray[15]) + " second");
		System.out.println("Decremental array size >> 10^5: " + (timeArray[16]) + " second");
		System.out.println("Decremental array size >> 10^6: " + (timeArray[17]) + " second");
		System.out.println();
		System.out.println("****** >>>>>> Heap Sort Completed <<<<<< ******");
		System.out.println();

	}

	private double calculateTime(int[] runningArray) {
		double startTime = System.currentTimeMillis();        
        this.sort(runningArray);
        double endTime = System.currentTimeMillis();
        return ((endTime - startTime) / 1000.0);

	}
}