public class SelectionSort {

  public void sort(int[] runningArray) {
    // run all elements
    for (int i = 0; i < runningArray.length; i++) {
      // find min element
      int minIndex = i;
      for (int j = i + 1; j < runningArray.length; j++) {
        if (runningArray[j] < runningArray[minIndex]) {
          minIndex = j;
        }
      }

      // Smallest element index i. array element structure
      int temp = runningArray[i];
      runningArray[i] = runningArray[minIndex];
      runningArray[minIndex] = temp;
    }
  }

  public void run() {
    Arrays arr = new Arrays();
    
    // Store time averages & set # of run times
    double[] timeArray = new double[18];
    
		System.out.println();
		System.out.println("****** >>>>>> Selection Sort Running <<<<<< ******");
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
		System.out.println("****** >>>>>> Selection Sort Completed <<<<<< ******");
		System.out.println();

}

private double calculateTime(int[] runningArray) {
  double startTime = System.currentTimeMillis();        
  this.sort(runningArray);
  double endTime = System.currentTimeMillis(); 
  return ((endTime - startTime) / 1000.0);
}
}