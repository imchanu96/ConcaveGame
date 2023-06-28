package test;
/////////////// 안쓰는거 ConcaveGameCompareWin의 기초가 됨
public class ConcaveGameWinTest {
	public static void checkXAxis() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] testArr = new String[6][6];

		for (int i = 0; i < testArr.length; i++) { // 값 입력
			for (int j = 0; j < testArr[i].length; j++) {
				testArr[i][j] = "(" + String.valueOf(i + ", ") + j + ")";
			}
		}
		String whiteStone = "●";

		testArr[0][0] = "  " + whiteStone + "   ";
		testArr[0][1] = "  " + whiteStone + "   ";
		testArr[0][2] = "  " + whiteStone + "   ";
		testArr[0][3] = "  " + whiteStone + "   ";
		testArr[0][4] = "  " + whiteStone + "   ";
		
		testArr[0][5] = "  " + whiteStone + "   ";
		testArr[0][5] = "  " + whiteStone + "   ";
		testArr[0][5] = "  " + whiteStone + "   ";
		testArr[0][5] = "  " + whiteStone + "   ";
		testArr[0][5] = "  " + whiteStone + "   ";
		testArr[0][5] = "  " + whiteStone + "   ";

		for (int i = 0; i < testArr.length; i++) { // 출력
			for (int j = 0; j < testArr[i].length; j++) {
				System.out.print(testArr[i][j] + " ");
			}
			System.out.println();
		}

		// 재료 준비 끝
//		int xAxis = 2;
//		int yAxis = 2;
		int checkY = 0;
		int checkX = 0;
		int count = 0;
//		if (y < testArr.length - 4 && x < testArr[0].length - 4) {
//			
//		}
		for (int y = 0; y < testArr.length; y++) {
 			for (int x = 0; x < testArr[y].length; x++) {


					if (testArr[y][x].trim().equals(whiteStone)) {
						count++;
						checkY = y;
						checkX = x;

						for (int i = 1; i <= 4; i++) {
							if (checkY >= 1 && testArr[checkY - 1][checkX + 1].trim().equals(whiteStone)) {
								checkY = checkY - 1;
								checkX = checkX + 1;
								count++;
								if (count == 4) {
									System.out.println("승리");
									break;
								} else if (y == testArr.length - 1 || x == testArr[0].length - 1) {
									count = 0;
									break;
								}
							} else {
								count = 0;
								checkY = y;
								checkX = x;
							}
						}

						for (int i = 1; i <= 4; i++) {
							if (checkX < testArr[0].length - 1 && testArr[checkY][checkX + 1].trim().equals(whiteStone)) {
								checkX = checkX + 1;
								count++;
								if (count == 4) {
									System.out.println("승리");
									break;
								} else if (y == testArr.length - 1 && x == testArr[0].length - 1) {
									count = 0;
									break;
								}
							} else {
								count = 0;
								checkY = y;
								checkX = x;
							}
						}

						for (int i = 1; i <= 4; i++) {
							if ((checkY < testArr.length - 1 && checkX >= 1) && testArr[checkY + 1][checkX - 1].trim().equals(whiteStone)) {
								checkY = checkY + 1;
								checkX = checkX - 1;
								count++;
								if (count == 4) {
									System.out.println("승리");
									break;
								} else if (y == testArr.length - 1 && x == testArr[0].length - 1) {
									count = 0;
									break;
								}
							} else {
								count = 0;
								checkY = y;
								checkX = x;
							}
						}

						for (int i = 1; i <= 4; i++) {
							if (checkY < testArr.length - 1 && testArr[checkY + 1][checkX].trim().equals(whiteStone)) {
								checkY = checkY + 1;
								count++;
								if (count == 4) {
									System.out.println("승리");
									break;
								} else if (y == testArr.length - 1 && x == testArr[0].length - 1) {
									count = 0;
									break;
								}
							} else {
								count = 0;
								checkY = y;
								checkX = x;
							}
						}

						for (int i = 1; i <= 4; i++) {
							if ((checkX < testArr.length - 1 && checkY < testArr[0].length - 1) && testArr[checkY + 1][checkX + 1].trim().equals(whiteStone)) {
								checkY = checkY + 1;
								checkX = checkX + 1;
								count++;
								if (count == 4) {
									System.out.println("승리");
									break;
								} else if (y == testArr.length - 1 && x == testArr[0].length - 1) {
									count = 0;
									break;
								}
							} else {
								count = 0;
								checkY = y;
								checkX = x;
							}
						}
					}
				}
				
			}

		}

}
