public class Arrays {

	public int[] createIncremental(int size) {
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = i + 1;
		}

		return array;
	}

	public int[] createDecremental(int size) {
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = size - i;
		}

		return array;
	}

	public int[] createRandom(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 1000) + 1;
		}
		return array;
	}
}