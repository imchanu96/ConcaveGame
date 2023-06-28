package boardCreate;

public class GameMessage {

	
	public static void gameStart() {
		System.out.println("\t 오목 게임");
		System.out.println("-------------------------------");
		System.out.println("|           게임 규칙                         |");
		System.out.println("|    쌍삼은 구현 하지 않음 (어려워)     |");
		System.out.println("|같은 색깔의 돌을 5개 연결되어 두면 이긴다.|");
		System.out.println("-------------------------------");
		System.out.println();
	}
	
	public void win(String playerStone, String player) {
		System.out.println("\n\n");
		
		String[][] circleStarArr = new String[8][8];
		
		
		for (int i = 0; i < circleStarArr.length; i++) {
			for (int j = 0; j < circleStarArr[i].length; j++) {
				if (i == 0 && (j == 3 || 3 + j == 7)) {
					circleStarArr[i][j] = playerStone;
				}else if (i == 1 && (j == 2 || 2 + j == 7)) {
					circleStarArr[i][j] = playerStone;
				}else if (i == 2 && (j == 1 || 1 + j == 7)) {
					circleStarArr[i][j] = playerStone;
				}else if (i == 3 && (j == 0 || 0 + j == 7)) {
					circleStarArr[i][j] = playerStone;
				}else if (i == 4 && (j == 0 || 0 + j == 7)) {
					circleStarArr[i][j] = playerStone;
				}else if (i == 5 && (j == 1 || 1 + j == 7)) {
					circleStarArr[i][j] = playerStone;
				}else if (i == 6 && (j == 2 || 2 + j == 7)) {
					circleStarArr[i][j] = playerStone;
				}else if (i == 7 && (j == 3 || 3 + j == 7)) {
					circleStarArr[i][j] = playerStone;
				}else if (i == 3 && j > 4 && j < 8) {
					circleStarArr[i][j] = "";
				}else if (i == 3 && j == 6) {
					circleStarArr[i][j] = "";
				}else if (i == 4 && j > 4 && j < 7) {
					circleStarArr[i][j] = "";
				}else {
					circleStarArr[i][j] = "✵✵";
				}
			}
		}
		circleStarArr[2][3] = playerStone + "돌";
		circleStarArr[3][2] = player + "님의 ";
		circleStarArr[4][3] = "승리입니다!";
		for (int i = 0; i < circleStarArr.length; i++) {
			for (int j = 0; j < circleStarArr[i].length; j++) {
				System.out.print(circleStarArr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("축하합니다!");
	}
	
	public void wrongInput() {
		System.out.println("————————————————————————");
		System.out.println("|오타입니다. 다시 입력해주세요|");
		System.out.println("————————————————————————");
	}
	public void outOfArray() {
		System.out.println("오목판에 벗어났습니다. 다시 입력하세요");
	}
	
}
