import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println(
					" Write correctly which sorting algorithm you want to calculate the running time. \n\n ->> *** \tMerge Sort \t   *** <<- \n ->> *** \tHeap Sort \t   *** <<- \n ->> *** \tSelection Sort\t   *** <<-  \n ->> *** \tInsertion Sort\t   *** <<- \n ->> *** \tLomuto Quick Sort  *** <<- \n ->> *** \tHoare Quick Sort   *** <<- \n\n :(( *** To exit, simply write -> exit *** :((");

				String input = scanner.nextLine();
				if (input.equalsIgnoreCase("Merge Sort")) {
					MergeSort ms = new MergeSort();
					ms.run();
				} else if (input.equalsIgnoreCase("Heap Sort")) 
				{
					HeapSort hs = new HeapSort();
					hs.run();
				} else if (input.equalsIgnoreCase("Selection Sort")) 
				{
					SelectionSort ss = new SelectionSort();
					ss.run();
				} else if (input.equalsIgnoreCase("Insertion Sort")) 
				{
					InsertionSort is = new InsertionSort();
					is.run();
				} else if (input.equalsIgnoreCase("Lomuto Quick Sort")) 
				{
					LomutoQuickSort lp = new LomutoQuickSort();
					lp.run();
				} else if (input.equalsIgnoreCase("Hoare Quick Sort")) 
				{
					HoareQuickSort hp = new HoareQuickSort();
					hp.run();
				} else if (input.equalsIgnoreCase("exit")) 
				{
					break;
				} else 
				{
					System.out.println(" You wrote wrong. Please try again.");	
				}
			}
		}
	}
}

