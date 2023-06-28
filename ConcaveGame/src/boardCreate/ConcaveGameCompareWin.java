package boardCreate;

public class ConcaveGameCompareWin {

	int checkY = 0;
	int checkX = 0;
	int count = 0;

	String win = "";


	ConcaveGamePlay board = new ConcaveGamePlay();
	
	
	
	public String compareStone(String playerStone , String[][] array) {// 연동하면 끝
		String[][] concaveGameBoardArr = array;
		
		try {
			for (int y = 0; y < concaveGameBoardArr.length; y++) {
				for (int x = 0; x < concaveGameBoardArr[y].length; x++) {

					if (concaveGameBoardArr[y][x].equals(playerStone)) {
						count++;
						checkY = y;
						checkX = x;

						for (int i = 1; i <= 4; i++) {
							if (checkY >= 1 
									&& concaveGameBoardArr[checkY - 1][checkX + 1].equals(playerStone)) {
								checkY = checkY - 1;
								checkX = checkX + 1;
								count++;
								if (count == 4) {
									win = "승리!";
									break;
								} else if (y == concaveGameBoardArr.length - 1 
										|| x == concaveGameBoardArr[0].length - 1) {
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
							if (checkX < concaveGameBoardArr[0].length - 1 
									&& concaveGameBoardArr[checkY][checkX + 1].equals(playerStone)) {
								checkX = checkX + 1;
								count++;
								if (count == 4) {
									win = "승리!";
									break;
								} else if (y == concaveGameBoardArr.length - 1 
										&& x == concaveGameBoardArr[0].length - 1) {
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
							if ((checkY < concaveGameBoardArr.length - 1 && checkX >= 1)
									&& concaveGameBoardArr[checkY + 1][checkX - 1].equals(playerStone)) {
								checkY = checkY + 1;
								checkX = checkX - 1;
								count++;
								if (count == 4) {
									win = "승리";
									break;
								} else if (y == concaveGameBoardArr.length - 1 
										&& x == concaveGameBoardArr[0].length - 1) {
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
							if (checkY < concaveGameBoardArr.length - 1 
									&& concaveGameBoardArr[checkY + 1][checkX].equals(playerStone)) {
								checkY = checkY + 1;
								count++;
								if (count == 4) {
									win = "승리!";
									break;
								} else if (y == concaveGameBoardArr.length - 1 
										&& x == concaveGameBoardArr[0].length - 1) {
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
							if ((checkX < concaveGameBoardArr.length - 1 
									&& checkY < concaveGameBoardArr[0].length - 1)
									&& concaveGameBoardArr[checkY + 1][checkX + 1].equals(playerStone)) {
								checkY = checkY + 1;
								checkX = checkX + 1;
								count++;
								if (count == 4) {
									win = "승리!";
									break;
								} else if (y == concaveGameBoardArr.length - 1 && x == concaveGameBoardArr[0].length - 1) {
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
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
		
		
//		for (int i = 0; i < concaveGameBoardArr.length; i++) {
//			for (int j = 0; j < concaveGameBoardArr[i].length; j++) {
//				System.out.print(concaveGameBoardArr[i][j]);
//			}
//			System.out.println();
//		}
		return win;
	}
}
