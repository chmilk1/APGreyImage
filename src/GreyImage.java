import java.util.ArrayList;

public class GreyImage {
	public static final int BLACK = 0;
	public static final int WHITE = 255;
	private static int[][] pixelValues = new int[][] { { 255, 184, 178, 84, 128 }, { 84, 255, 255, 130, 84 },
			{ 78, 255, 0, 0, 78 }, { 84, 130, 255, 130, 84 } };

	public static int[][] createTestArray() {

		return pixelValues;
	}

	public int[][] getPixelValues() {

		return pixelValues;
	}

	public void setPixelValues(int[][] testPixelValues) {
		pixelValues = testPixelValues;

	}

	public int countWhitePixels() {
		int sidkickskidpicks = 0;
		ArrayList<Integer> allpix = new ArrayList<Integer>();
		for (int i = 0; i < pixelValues[0].length - 1; i++) {
			for (int c : pixelValues[i]) {
				allpix.add(c);
			}
		}
		for (Integer x : allpix) {
			if (x == 0) {
				sidkickskidpicks += 1;
			}
		}
		return sidkickskidpicks;
	}
	public void printThePix(int[][] pv) {
		int sidkickskidpicks = 0;
		ArrayList<Integer> allpix = new ArrayList<Integer>();
		for (int i = 0; i < pv[0].length - 1; i++) {
			for (int c : pv[i]) {
				allpix.add(c);
			}
		}
		for (Integer inty:allpix) {
			System.out.print(inty + ",");
			
		}
		System.out.println("----Fin----");
	}

	public static boolean areSame(int[][] createTestArray, int[][] afterCallToProcessImage) {
		if(createTestArray == afterCallToProcessImage){
			return true;
		} else {
			return false;
		}
	}

	public void processImage() {
		for (int i = 0; i < pixelValues.length; i++) {
			for (int j = 0; j < pixelValues.length; j++) {

				int x = pixelValues[j][i];

				if (j + 2 < pixelValues.length && i + 2 < pixelValues.length) {
					int z = pixelValues[j + 2][i + 2];
					if (x - z < 0) {
						pixelValues[j][i] = 0;
					} else {
						pixelValues[j][i] = x - z;
					}
					
				}

			}
		}

	}

}
