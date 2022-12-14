public class InsertionSort {

    public void sort(int[] runningArray) {
        for (int i = 1; i < runningArray.length; i++) {
            int current = runningArray[i];

            // arrays i. move from element to a previous element
            int j = i - 1;
            while (j >= 0 && runningArray[j] > current) {
                // If i. If the element before the element is greater than,
                // i. move the previous element from the element to the next element
                runningArray[j + 1] = runningArray[j];
                j--;
            }
            // i. locate the element and i. place the element in that place
            runningArray[j + 1] = current;
        }
    }

	public void run() {
		Arrays arr = new Arrays();
		
		double[] timeArray = new double[18];
		
		// Run ınsertionsort tests
		System.out.println();
		System.out.println("****** >>>>>> Insertion Sort Running <<<<<< ******");
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
		System.out.println("****** >>>>>> Insertion Sort Completed <<<<<< ******");
		System.out.println();

	}
	
	private double calculateTime(int[] runningArray) {
		double startTime = System.currentTimeMillis();        
        this.sort(runningArray);
        double endTime = System.currentTimeMillis();
        return ((endTime - startTime) / 1000.0);
	}
}