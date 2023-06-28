package boardCreate;

import java.util.Scanner;

public class ConcaveGamePlay extends ConcaveGameBoard {
	String player1 = "";
	String player2 = "";
	String blackStone = "○";
	String whiteStone = "●";

	String[][] concaveGameBoardArr = super.concaveGameBoardArr;

	GameMessage gameMsg = new GameMessage();

	public String playConcaveGame(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;

		String winner = "";

		player1 = blackStone;
		player2 = whiteStone;

		String win = "";
		Scanner scan = new Scanner(System.in);

		ConcaveGameCompareWin compareWin = new ConcaveGameCompareWin();

		// 게임은 바둑판에 놓을수 있는 수만큼 진행된다.
		for (int i = 0; i < concaveGameBoardArr.length * concaveGameBoardArr.length; i++) {
			System.out.println((i + 1) + "수");
			while (true) {
				try {
					System.out.print(player1 + " Y축의 위치 : ");
					int player1Order1 = Integer.parseInt(scan.nextLine());
					System.out.println();
					System.out.print(player1 + " X축의 위치 : ");
					int player1Order2 = Integer.parseInt(scan.nextLine());
					System.out.println();
					// 사용자가 입력한 위치에 돌이 있으면 놓지 못하게 한다.
					if (concaveGameBoardArr[player1Order1][player1Order2].contentEquals(blackStone)
							|| concaveGameBoardArr[player1Order1][player1Order2].contentEquals(whiteStone)) {
						System.out.println("이미 해당 위치에 돌이 있습니다.");
					} else {
						concaveGameBoardArr[player1Order1][player1Order2] = player1;
						concaveGameBoard();
						break;
					}
				} catch (NumberFormatException e) {
					gameMsg.wrongInput();
				} catch (ArrayIndexOutOfBoundsException e) {
					gameMsg.outOfArray();
				}

			}
			win = compareWin.compareStone(player1, concaveGameBoardArr);

			if (compareWin.compareStone(player1, concaveGameBoardArr).equals("승리!")) {
				gameMsg.win(player1, this.player1);
				break;
			}
			while (true) {
				try {
					System.out.print(player2 + " Y축의 위치 : ");
					int player2Order1 = Integer.parseInt(scan.nextLine());
					System.out.print(player2 + " X축의 위치 : ");
					int player2Order2 = Integer.parseInt(scan.nextLine());
					System.out.println();

					// 사용자가 입력한 위치에 돌이 있으면 놓지 못하게 한다.
					if (concaveGameBoardArr[player2Order1][player2Order2].contentEquals(blackStone)
							|| concaveGameBoardArr[player2Order1][player2Order2].contentEquals(whiteStone)) {
						System.out.println("이미 해당 위치에 돌이 있습니다.");
					} else {
						concaveGameBoardArr[player2Order1][player2Order2] = player2;
						concaveGameBoard();
						break;
					}
				} catch (NumberFormatException e) {
					gameMsg.wrongInput();
				} catch (ArrayIndexOutOfBoundsException e) {
					gameMsg.outOfArray();
				}

			}
			win = compareWin.compareStone(player2, concaveGameBoardArr);
			if (compareWin.compareStone(player2, concaveGameBoardArr).equals("승리!")) {
				gameMsg.win(player2, this.player2);
				break;
			}

		}
		scan.close();

		return winner;
	}

	public void concaveGameBoard() {
		System.out.println("");
		System.out.println("\t\t\t\t\t" + "--------------------------" + "X축 인덱스-------------------->");
		for (int i = 0; i < concaveGameBoardArr.length; i++) {
			System.out.print("|" + i + "|");
			for (int j = 0; j < concaveGameBoardArr[i].length; j++) {
				System.out.print(concaveGameBoardArr[i][j]);
			}
			System.out.print("\t\t");
			System.out.print("Y축:" + i + " ");
			for (int j = 0; j < concaveGameBoardArr[i].length; j++) {
				if (concaveGameBoardArr[i][j].equals(whiteStone) || concaveGameBoardArr[i][j].equals(blackStone)) {
					System.out.print(" " + concaveGameBoardArr[i][j] + " ");
				} else {
					System.out.print("(" + j + ")");
				}
			}
			System.out.println();
		}
	}
}
