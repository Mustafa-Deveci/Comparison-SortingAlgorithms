public class MergeSort {

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int runningArray[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = runningArray[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = runningArray[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				runningArray[k] = L[i];
				i++;
			} else {
				runningArray[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			runningArray[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			runningArray[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	public void sort(int runningArray[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second halves
			sort(runningArray, l, m);
			sort(runningArray, m + 1, r);

			// Merge the sorted halves
			merge(runningArray, l, m, r);
		}
	}

	public void run() {
		Arrays arr = new Arrays();

		double[] timeArray = new double[18];
		System.out.println();
		System.out.println("****** >>>>>> Merge Sort Running <<<<<< ******");
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

		System.out.println("Incremental array size >> 10: " + (timeArray[6]) + "  second");
		System.out.println("Incremental array size >> 10^2: " + (timeArray[7]) + "  second");
		System.out.println("Incremental array size >> 10^3: " + (timeArray[8]) + "  second");
		System.out.println("Incremental array size >> 10^4: " + (timeArray[9]) + "  second");
		System.out.println("Incremental array size >> 10^5: " + (timeArray[10]) + "  second");
		System.out.println("Incremental array size >> 10^6: " + (timeArray[11]) + "  second");
		System.out.println();

		System.out.println("Decremental array size >> 10: " + (timeArray[12]) + "  second");
		System.out.println("Decremental array size >> 10^2: " + (timeArray[13]) + "  second");
		System.out.println("Decremental array size >> 10^3: " + (timeArray[14]) + "  second");
		System.out.println("Decremental array size >> 10^4: " + (timeArray[15]) + "  second");
		System.out.println("Decremental array size >> 10^5: " + (timeArray[16]) + "  second");
		System.out.println("Decremental array size >> 10^6: " + (timeArray[17]) + "  second");
		System.out.println();
		System.out.println("****** >>>>>> Merge Sort Completed <<<<<< ******");
		System.out.println();

	}

	private double calculateTime(int[] runningArray) {
		double startTime = System.currentTimeMillis();        
		this.sort(runningArray, 0, runningArray.length - 1);
        double endTime = System.currentTimeMillis();  
        return ((endTime - startTime) / 1000.0);
	}
}