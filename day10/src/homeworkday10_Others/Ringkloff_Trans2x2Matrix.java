package hausaufgaben;

public class Trans2x2Matrix {

	public static void main(String[] args) {

		int[][] zXmatrix = new int[][] { { 1, 2 }, { 3, 4 } }; // 2x2Matrix
		int[][] transzXmatrix = new int[2][2]; 			// Transponierte 2x2Matrix
												

		// Ausgabe der 2x2Matrix
		for (int i = 0; i < zXmatrix.length; i++) {
			for (int j = 0; j < zXmatrix[i].length; j++) {
				System.out.print(zXmatrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transponiere die 2X2Matrix");

		// transponieren der 2x2Matrix
		for (int i = 0; i < zXmatrix.length; i++) {
			for (int j = 0; j < zXmatrix[i].length; j++) {
				transzXmatrix[j][i] = zXmatrix[i][j];
			}

		}

		// finale Ausabe der transponierten 2x2Matrix
		for (int i = 0; i < transzXmatrix.length; i++) {
			for (int j = 0; j < transzXmatrix[i].length; j++) {
				System.out.print(transzXmatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
